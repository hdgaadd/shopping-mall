package com.codeman.dao;

import com.codeman.domain.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/11 11:29:14
*/
@Mapper
public interface HomeDao {

    /**
     * 分页获取人气推荐商品
     * @return
     */
    List<Product> getHotProjectList();
}