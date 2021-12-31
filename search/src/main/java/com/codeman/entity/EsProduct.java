package com.codeman.entity;

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
@Document(indexName = "es", shards = 1,replicas = 0)
public class EsProduct{
    private static final long serialVersionUID = 1L;

    @Id
    private Long id;

    @Field(type = FieldType.Text)
    private String name;
    @Field(type = FieldType.Keyword)
    private String icon;
    @Field(type = FieldType.Keyword)
    private Long productCategoryId;
    @Field(type = FieldType.Keyword)
    private Long productAttributeCategoryId;
    @Field(type = FieldType.Keyword)
    private Long brandId;
    @Field(type = FieldType.Keyword)
    private Long feightTemplateId;
    @Field(type = FieldType.Keyword)
    private BigDecimal price;
    @Field(type = FieldType.Keyword)
    private BigDecimal weight;
    @Field(type = FieldType.Keyword)
    private Integer sort;
    @Field(type = FieldType.Keyword)
    private Integer sale;
    @Field(type = FieldType.Keyword)
    private Integer status;
    @Field(type = FieldType.Keyword)
    private String attributeName;
}
