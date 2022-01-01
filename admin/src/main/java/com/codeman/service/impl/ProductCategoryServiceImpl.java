package com.codeman.service.impl;

import com.codeman.dao.ProductCategoryDao;
import com.codeman.dto.ProductCategoryWithChildrenItem;
import com.codeman.mapper.ProductCategoryMapper;
import com.codeman.service.ProductCategoryService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2022/01/01
*/
@Service
public class ProductCategoryServiceImpl implements ProductCategoryService {
    @Resource
    private ProductCategoryDao productCategoryDao;

    @Override
    public List<ProductCategoryWithChildrenItem> listWithChildren() {
        return productCategoryDao.listWithChildren();
    }
}
