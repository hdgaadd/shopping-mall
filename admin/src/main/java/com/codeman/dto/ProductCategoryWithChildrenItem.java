package com.codeman.dto;

import com.codeman.domain.ProductCategory;
import lombok.Data;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2022/01/01
 */
@Data
public class ProductCategoryWithChildrenItem extends ProductCategory {
    List<ProductCategory> childrens;
}
