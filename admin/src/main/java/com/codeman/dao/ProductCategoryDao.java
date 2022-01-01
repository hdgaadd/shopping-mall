package com.codeman.dao;

import com.codeman.dto.ProductCategoryWithChildrenItem;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2022/01/01
*/
public interface ProductCategoryDao {
    List<ProductCategoryWithChildrenItem> listWithChildren();
}