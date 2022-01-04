package com.codeman.service;

import com.codeman.domain.Product;
import com.codeman.domain.Subject;
import com.codeman.domain.HomeResult;

import java.util.List;

public interface HomeService {
    /**
     * 首页内容展示
     * @return
     */
    HomeResult content();

    /**
     * 根据分类获取专题
     * @param cateId
     * @return
     */
    List<Subject> getSubjectList(Long cateId, Integer pageNum, Integer pageSize);

    /**
     * 分页获取人气推荐商品
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Product> getHotProjectList(Integer pageNum, Integer pageSize);
}
