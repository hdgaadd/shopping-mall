package com.codeman.controller;

import com.codeman.entity.EsProduct;
import com.codeman.service.EsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import util.CommonResult;

import javax.annotation.Resource;
import java.io.IOException;
import java.util.List;

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
    public CommonResult<String> importAll() {
        int count = esService.importAll();
        return CommonResult.success("导入的商品数量为：" + count);
    }

    @ApiOperation("ik分词器查询")
    @GetMapping("selectMatch")
    public CommonResult<List<EsProduct>> selectMatch(@RequestParam String value) throws IOException {
        List<EsProduct> esProducts = esService.selectMatch("name", value);
        return CommonResult.success(esProducts);
    }
}
