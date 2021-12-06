package com.codeman.service.impl;

import com.codeman.domain.Product;
import com.codeman.entity.EsProduct;
import com.codeman.mapper.EsMapper;
import com.codeman.mapper.ProductMapper;
import com.codeman.repository.EsProductRepository;
import com.codeman.service.EsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Iterator;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/06 21:15:56
*/
@Service
public class EsServiceImpl implements EsService {
    @Resource
    private EsMapper esProductMapper;
    @Autowired
    private EsProductRepository elasticsearchRepository;

    @Override
    public int importAll(Integer id) {
        List<EsProduct> productList = esProductMapper.selectAll(id);
        Iterable<EsProduct> iterable = elasticsearchRepository.saveAll(productList);
        Iterator<EsProduct> iterator = iterable.iterator();
        int ret = 0;
        while (iterator.hasNext()) {
            EsProduct next = iterator.next();
            ret++;
        }
        return ret;
    }
}
