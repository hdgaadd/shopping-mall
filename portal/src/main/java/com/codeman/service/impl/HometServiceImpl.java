package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.dao.HomeDao;
import com.codeman.domain.FlashPromotion;
import com.codeman.domain.FlashPromotionSession;
import com.codeman.domain.Product;
import com.codeman.domain.Subject;
import com.codeman.domain.HomeFlashPromotion;
import com.codeman.domain.HomeResult;
import com.codeman.mapper.FlashPromotionMapper;
import com.codeman.mapper.FlashPromotionSessionMapper;
import com.codeman.mapper.ProductMapper;
import com.codeman.mapper.SubjectMapper;
import com.codeman.service.HomeService;
import com.github.pagehelper.PageHelper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import util.LOG;

import java.util.Date;
import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
public class HometServiceImpl implements HomeService {

    private FlashPromotionMapper flashPromotionMapper;
    private FlashPromotionSessionMapper flashPromotionSessionMapper;
    private ProductMapper productMapper;
    private SubjectMapper subjectMapper;
    private HomeDao homeDao;

    @Override
    public HomeResult content() {
        HomeResult homeResult = new HomeResult();
        // 获取秒杀推荐
        homeResult.setHomeFlashPromotion(getHomeFlashPromotion());
        return homeResult;
    }

    @Override
    public List<Subject> getSubjectList(Long cateId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        if (Objects.isNull(cateId)) {
            LOG.log("cateId是空的");
            return null;
        }
        QueryWrapper<Subject> subjectQueryWrapper = new QueryWrapper<>();
        subjectQueryWrapper.eq("category_id", cateId).eq("show_status", 1);
        List<Subject> subjects = subjectMapper.selectList(subjectQueryWrapper);
        return subjects;
    }

    @Override
    public List<Product> getHotProjectList(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Product> products = homeDao.getHotProjectList();
        return products;
    }

    private HomeFlashPromotion getHomeFlashPromotion() {
        HomeFlashPromotion homeFlashPromotion = new HomeFlashPromotion();
        Date date = new Date();
        // 获取秒杀活动
        FlashPromotion flashPromotion = getFlashPromotion(date);
        System.out.println(flashPromotion);
        if (flashPromotion != null) {
            System.out.println("---------------------------");
            // 获取秒杀活动的第一场次
            FlashPromotionSession flashPromotionSession = getFlashPromotionSession(date);
            homeFlashPromotion.setStartTime(flashPromotionSession.getStartTime());
            homeFlashPromotion.setEndTime(flashPromotionSession.getEndTime());

            if (flashPromotionSession != null) {
                // 获取秒杀活动的第二场次
                FlashPromotionSession nextFlashPromotionSession = getNextFlashPromotionSession(date);
                homeFlashPromotion.setNextStartTime(nextFlashPromotionSession.getStartTime());
                homeFlashPromotion.setNextEndTimwe(nextFlashPromotionSession.getEndTime());
            }

            // 获取秒杀商品, 暂时获取全部商品
            List<Product> productList = productMapper.selectList(null);
            homeFlashPromotion.setProductList(productList);

        }
        System.out.println(homeFlashPromotion);
        return homeFlashPromotion;
    }

    private FlashPromotionSession getNextFlashPromotionSession(Date date) {
        QueryWrapper<FlashPromotionSession> queryWrapper = new QueryWrapper<>();
        queryWrapper.ge("start_time", date);
        queryWrapper.ge("end_time", date);
        List<FlashPromotionSession> flashPromotions = flashPromotionSessionMapper.selectList(queryWrapper);
        if (!CollectionUtils.isEmpty(flashPromotions)) {
            return flashPromotions.get(0);
        }
        return null;
    }

    private FlashPromotionSession getFlashPromotionSession(Date date) {
        QueryWrapper<FlashPromotionSession> queryWrapper = new QueryWrapper<>();
        queryWrapper.le("start_time", date);
        queryWrapper.ge("end_time", date);
        List<FlashPromotionSession> flashPromotions = flashPromotionSessionMapper.selectList(queryWrapper);
        if (!CollectionUtils.isEmpty(flashPromotions)) {
            return flashPromotions.get(0);
        }
        return null;
    }

    private FlashPromotion getFlashPromotion(Date date) {
        QueryWrapper<FlashPromotion> queryWrapper = new QueryWrapper<>();
        queryWrapper.le("start_time", date);
        queryWrapper.ge("end_time", date);
        List<FlashPromotion> flashPromotions = flashPromotionMapper.selectList(queryWrapper);
        if (!CollectionUtils.isEmpty(flashPromotions)) {
            return flashPromotions.get(0);
        }
        return null;
    }
}
