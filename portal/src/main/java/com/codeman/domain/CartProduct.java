package com.codeman.domain;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2022/01/04
 * @description 一个商品包含多个Sku规格、多个商品属性
 */
public class CartProduct extends Product {
    List<ProductSkuStock> productSkuStocks;
    List<ProductAttribute> productAttributes;
}
