package com.codeman.controller;

import com.codeman.domain.Product;
import com.codeman.domain.CommonPage;
import com.codeman.service.BrandService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

/**
 * @author hdgaadd
 * Created on 2021/12/07 21:31:00
*/
@Api(tags = "品牌管理")
@RestController
@RequestMapping("/brand")
public class BrandController {

    @Autowired
    private BrandService brandService;

    // recommendList(Integer pageNum, Integer pageSize) 分页获取推荐品牌

    // getItem(Long id) 获取品牌详情

    @ApiOperation("分页获取品牌所有商品")
    @GetMapping("/projectList")
    public CommonResult<CommonPage<Product>> getProjectList(@RequestParam Long brandId,
                                                            @RequestParam(value = "pageNum", defaultValue = "1")Integer pageNum,
                                                            @RequestParam(value = "pageSize", defaultValue = "2") Integer pageSize){
        CommonPage<Product> result = brandService.getBrandById(brandId, pageNum, pageSize);
        return CommonResult.success(result);
    }
}
