package com.codeman.service;

import com.codeman.domain.Resource;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
public interface ResourceService {
    /**
     * 分页模糊查询后台资源
     * @param categoryId
     * @param naemKeyword
     * @param urlKeyword
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Resource> list(Long categoryId, String naemKeyword, String urlKeyword, Integer pageNum, Integer pageSize);
}