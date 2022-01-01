package com.codeman.controller.cms;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hdgaadd
 * Created on 2022/01/01
*/
@Api(tags = "商品专题管理")
@RestController
@RequestMapping("/subject")
public class SubjectController {
    // listAll() 获取所有商品专题

    // listByCategory(String categoryName, Integer pageNum, Integer pageSize) 根据专题分类名称分页获取商品专题
}
