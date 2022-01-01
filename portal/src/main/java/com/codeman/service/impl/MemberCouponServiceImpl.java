package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.*;
import com.codeman.mapper.*;
import com.codeman.constant.CouponType;
import com.codeman.dao.MemberCouponDao;
import com.codeman.entity.CouponDetail;
import com.codeman.service.MemberCouponService;
import com.codeman.service.MemberService;
import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import exception.Asserts;
import org.springframework.stereotype.Service;
import util.CommonResult;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * @author hdgaadd
 * Created on 2021/12/11 10:49:17
*/
@Service
public class MemberCouponServiceImpl implements MemberCouponService {
    @Resource
    private MemberCouponDao memberCouponDao;
    @Resource
    private MemberService memberService;
    @Resource
    private CouponMapper couponMapper;
    @Resource
    private CouponHistoryMapper couponHistoryMapper;
    @Resource
    private CouponProductRelationMapper couponProductRelationMapper;
    @Resource
    private CouponProductCategoryRelationMapper couponProductCategoryRelationMapper;
    @Resource
    private ProductMapper productMapper;

    @Override
    public List<CouponDetail> listCart(List<Cart> carts, String type) {
        System.out.println("------------------------------carts" + carts);
        // 用户所有优惠券
        List<CouponDetail> couponDetails = memberCouponDao.getAllCoupon(memberService.getCurrentMember().getId());
        System.out.println("--------------------------- couponDetails" + couponDetails.toString());
        // 可用优惠券
        List<CouponDetail> enable = new ArrayList<>();
        // 不可用优惠券
        List<CouponDetail> disable = new ArrayList<>();


        for (CouponDetail couponDetail : couponDetails) {
            // 得到购物车总金额
            // 暂定表中没有金额就返回0
            BigDecimal total = getTotalAmout(carts);

            if (type.equals(CouponType.USEALL.toString())) {
                // 购物车总额满足优惠券门槛，即可添加
                /*if (total.subtract(couponDetail.getCoupons().getAmount()).intValue() >= 0) {
                    System.out.println(couponDetail);
                    enable.add(couponDetail);
                }*/
                // 暂定添加所有
                enable.add(couponDetail);
            }
        }
        System.out.println(enable);
        return enable;
    }

    @Override
    public CommonResult addCoupon(Long couponId) {
        Member currentMember = memberService.getCurrentMember();
        Coupon coupon = couponMapper.selectById(couponId);
        if (Objects.isNull(coupon)) {
            return CommonResult.failed(null, "优惠券为空");
        }
        if (coupon.getCount() == 0) {
            return CommonResult.failed(null, "优惠券领取完了");
        }
        LocalDateTime now = LocalDateTime.now();
        if (now.isBefore(coupon.getStartTime())) {
            return CommonResult.failed(null, "还没有到达优惠券可以领取的时间");
        }
        // 获取用户该优惠券的领取数量，判断是否超量
        QueryWrapper<CouponHistory> couponHistoryQueryWrapper = new QueryWrapper<>();
        couponHistoryQueryWrapper.eq("member_id", currentMember.getId()).eq("coupon_id", couponId);
        Integer count = couponHistoryMapper.selectCount(couponHistoryQueryWrapper);
        if (count >= coupon.getCouponLimit()) {
            Asserts.fail("兄弟，你还要领这优惠券多少次，这都多少次了");
        }
        // 生成优惠券history
        CouponHistory couponHistory = new CouponHistory();
        couponHistory.setCouponId(couponId);
        couponHistory.setMemberId(currentMember.getId());
        couponHistoryMapper.insert(couponHistory);
        // 修改该优惠券
        coupon.setCount(coupon.getCount() - 1);
        couponMapper.updateById(coupon);
        return CommonResult.success(null);
    }

    @Override
    public List<Coupon> couponsByProductId(Long productId) {
        List<Long> couponIds = new ArrayList<>();
        // 根据商品id获取商品id与优惠券记录表
        QueryWrapper<CouponProductRelation> couponProductRelationQueryWrapper = new QueryWrapper<>();
        couponProductRelationQueryWrapper.eq("product_id", productId);
        List<CouponProductRelation> couponProductRelations = couponProductRelationMapper.selectList(couponProductRelationQueryWrapper);
        if (!couponProductRelations.isEmpty()) {
            List<Long> listCouponId = couponProductRelations.stream().map(CouponProductRelation :: getCouponId).collect(Collectors.toList());
            couponIds.addAll(listCouponId);
        }

        // 查询商品的分类id
        Product product = productMapper.selectById(productId);
        Long productCategoryId = product.getProductCategoryId();

        // 根据商品id获取商品分类id与优惠券记录表
        QueryWrapper<CouponProductCategoryRelation> couponProductCategoryRelationQueryWrapper = new QueryWrapper<>();
        couponProductCategoryRelationQueryWrapper.eq("product_category_id", productCategoryId);
        List<CouponProductCategoryRelation> couponProductCategoryRelations = couponProductCategoryRelationMapper.selectList(couponProductCategoryRelationQueryWrapper);
        if (!couponProductCategoryRelations.isEmpty()) {
            List<Long> listCouponId = couponProductCategoryRelations.stream().map(CouponProductCategoryRelation :: getCouponId).collect(Collectors.toList());
            couponIds.addAll(listCouponId);
        }
        // 根据优惠券id获取优惠券
        List<Coupon> coupons = new ArrayList<>();
        LocalDateTime now = LocalDateTime.now();
        for (Long id : couponIds) {
            QueryWrapper<Coupon> couponQueryWrapper = new QueryWrapper<>();
            couponQueryWrapper.eq("id", id).le("start_time", now);
            Coupon coupon = couponMapper.selectOne(couponQueryWrapper);
            coupons.add(coupon);
        }
        return coupons;
    }

    private BigDecimal getTotalAmout(List<Cart> carts) {
        BigDecimal sum = new BigDecimal("0");
        for (Cart cart : carts) {
            BigDecimal price = cart.getPrice();
            Integer quantity = cart.getQuantity();
            if (price != null && quantity != null) {
                sum.add(price.multiply(new BigDecimal(quantity))); // 乘法[ˈmʌltɪplaɪ]
            }
            System.out.println(sum);
        }
        return sum;
    }
}
