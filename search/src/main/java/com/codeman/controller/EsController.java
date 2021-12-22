package com.codeman.controller;

import com.codeman.service.EsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

import javax.annotation.Resource;

/**
 * @author hdgaadd
 * Created on 2021/12/06 21:15:56
 */
@Api(tags = "查询所有商品")
@RestController
@RequestMapping("/esProduct")
public class EsController {
    @Resource
    private EsService esService;

    @ApiOperation("导入商品到ElasticSearch")
    @GetMapping("/importAll")
    public CommonResult<Integer> importAll(Integer id){
        int count = esService.importAll(id);
        System.out.println(count);
        return CommonResult.success(count);
    }
}
