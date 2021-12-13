package com.codeman.service.impl;

import com.codeman.constant.CouponType;
import com.codeman.dao.MemberCouponDao;
import com.codeman.domain.Cart;
import com.codeman.entity.CouponDetail;
import com.codeman.service.MemberCouponService;
import com.codeman.service.MemberService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<CouponDetail> listCart(List<Cart> carts, String type) {
        System.out.println("------------------------------carts" + carts);
        // 用户所有优惠券
        List<CouponDetail> couponDetails = memberCouponDao.getAllCoupon(memberService.getCurrentMember().getId());
        System.out.println("--------------------------- couponDetails" + couponDetails);
        // 可用优惠券
        List<CouponDetail> enable = new ArrayList<>();
        // 不可用优惠券
        List<CouponDetail> disable = new ArrayList<>();


        for (CouponDetail couponDetail : couponDetails) {
            // 得到购物车总金额
            // 暂定表中没有金额就返回0
            BigDecimal total = getTotalAmout(carts);
            if (type.equals(CouponType.USEALL.toString())) {
                if (total.subtract(couponDetail.getCoupons().getAmount()).intValue() >= 0) {
                    enable.add(couponDetail);
                }
            }
        }
        return enable;
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
