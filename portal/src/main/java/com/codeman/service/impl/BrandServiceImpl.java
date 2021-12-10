package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Product;
import com.codeman.entity.CommonPage;
import com.codeman.mapper.ProductMapper;
import com.codeman.service.BrandService;
import com.github.pagehelper.PageHelper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/07 21:31:00
*/
@Service
public class BrandServiceImpl implements BrandService {

    @Resource
    private ProductMapper productMapper;

    @Override
    public CommonPage<Product> getBrandById(Long brandId, Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<Product> brandQueryWrapper = new QueryWrapper<>();
        brandQueryWrapper.eq("brand_id", brandId);
        List<Product> brands = productMapper.selectList(brandQueryWrapper);
        return CommonPage.restPage(brands);
    }
}
