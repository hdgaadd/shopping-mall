package com.codeman.service.impl;

import com.alibaba.fastjson.JSONObject;
import com.codeman.domain.Product;
import com.codeman.entity.EsProduct;
import com.codeman.mapper.EsMapper;
import com.codeman.mapper.ProductMapper;
import com.codeman.repository.EsProductRepository;
import com.codeman.service.EsService;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.elasticsearch.action.search.SearchRequest;
import org.elasticsearch.action.search.SearchResponse;
import org.elasticsearch.client.RequestOptions;
import org.elasticsearch.client.RestHighLevelClient;
import org.elasticsearch.index.query.QueryBuilders;
import org.elasticsearch.search.SearchHit;
import org.elasticsearch.search.builder.SearchSourceBuilder;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.ArrayList;
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
    @Resource
    private EsProductRepository elasticsearchRepository;
    @Resource
    private ProductMapper productMapper;
    @Resource
    private RestHighLevelClient restHighLevelClient;


    @Override
    public int importAll() {
        List<EsProduct> productList = esProductMapper.selectAll();
        Iterable<EsProduct> iterable = elasticsearchRepository.saveAll(productList);
        Iterator<EsProduct> iterator = iterable.iterator();
        int ret = 0;
        while (iterator.hasNext()) {
            EsProduct next = iterator.next();
            ret++;
        }
        return ret;
    }

    @Override
    public List<EsProduct> selectMatch(String key, String value) throws IOException {
        // 实例化SearchRequest、SearchSourceBuilder
        SearchRequest searchRequest = new SearchRequest();
        SearchSourceBuilder searchSourceBuilder = new SearchSourceBuilder();
        // 添加key
        searchSourceBuilder.query(QueryBuilders.matchQuery(key, value));
        // 把SearchSourceBuilder添加进SearchRequest
        searchRequest.source(searchSourceBuilder);
        // 查询，返回SearchResponse
        SearchResponse response = restHighLevelClient.search(searchRequest, RequestOptions.DEFAULT);

        // 把SearchResponse转换为EsProduct
        List<EsProduct> esProducts = new ArrayList<>();
        SearchHit[] hits = response.getHits().getHits();
        for (SearchHit hit : hits) {
            EsProduct esProduct = JSONObject.parseObject(hit.getSourceAsString(), EsProduct.class);
            esProducts.add(esProduct);
        }
        return esProducts;
    }
}
