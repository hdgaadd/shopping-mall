package com.codeman.service;

import com.codeman.dto.ProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2022/01/01
*/
public interface ProductCategoryService {
    /**
     * 获取所有的一级分类和二级分类
     * @return
     */
    List<ProductCategoryWithChildrenItem> listWithChildren();
}