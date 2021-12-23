package com.codeman.service;

import com.codeman.entity.EsProduct;

import java.io.IOException;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/06 21:15:56
*/
public interface EsService {
    int importAll();

    /**
     * ik分词器查询
     * @return
     */
    List<EsProduct> selectMatch(String key, String value) throws IOException;
}