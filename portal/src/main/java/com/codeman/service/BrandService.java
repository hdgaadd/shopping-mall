package com.codeman.service;

import com.codeman.domain.Brand;
import com.codeman.domain.Product;
import com.codeman.entity.CommonPage;

/**
 * @author hdgaadd
 * Created on 2021/12/07 21:31:00
*/
public interface BrandService {

    CommonPage<Product> getBrandById(Long brandId, Integer pageNum, Integer pageSize);
}