package com.codeman.controller;

import com.codeman.domain.Product;
import com.codeman.domain.Subject;
import com.codeman.entity.HomeResult;
import com.codeman.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import util.CommonResult;

import javax.annotation.Resource;
import java.util.List;

@Api(tags = "首页")
@RestController
@RequestMapping("/home")
public class HomeController {

    @Resource
    private HomeService homeService;

    @ApiOperation("首页内容展示")
    @GetMapping("/content")
    public CommonResult<HomeResult> content() {
        HomeResult content = homeService.content();
        return CommonResult.success(content);
    }

    // 分页获取推荐商品，默认推荐所有

    // 根据商品分类的parentId，获取所有分类

    @ApiOperation("根据专题分类获取专题")
    @GetMapping("/getSubjectList")
    public CommonResult<List<Subject>> getSubjectList(@RequestParam(required = false) Long cateId,
                                                      @RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<Subject> subjects = homeService.getSubjectList(cateId, pageNum, pageSize);
        return CommonResult.success(subjects);
    }


    @ApiOperation("分页获取人气推荐商品")
    @GetMapping("/getHotProjectList")
    public CommonResult<List<Product>> getHotProjectList(@RequestParam(value = "pageNum", defaultValue = "1") Integer pageNum,
                                                      @RequestParam(value = "pageSize", defaultValue = "3") Integer pageSize) {
        List<Product> products = homeService.getHotProjectList(pageNum, pageSize);
        return CommonResult.success(products);
    }

    // 同上，分页获取新品推荐商品，表为home_new_product
}
