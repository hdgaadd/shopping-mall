package com.codeman.entity;

import com.codeman.domain.ProdcuctCategoryAttributeRelation;
import com.codeman.domain.Product;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.math.BigDecimal;

/**
 * @author hdgaadd
 * Created on 2021/12/06/21:26
 */
@Data
@Document(indexName = "pms", shards = 1,replicas = 0)
public class EsProduct{
    private static final long serialVersionUID = 1L;
    @Id
    private Long id;
    @Field(type = FieldType.Keyword)
    private String name;

    private String icon;

    private Long productCategoryId;

    private Long productAttributeCategoryId;

    private Long brandId;

    private Long feightTemplateId;

    private BigDecimal price;

    private BigDecimal weight;

    private Integer sort;

    private Integer sale;

    private Integer status;

    private String attributeName;
}
