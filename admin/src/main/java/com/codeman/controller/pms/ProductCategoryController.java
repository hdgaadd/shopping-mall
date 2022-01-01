package com.codeman.controller.pms;

import com.codeman.dto.ProductCategoryWithChildrenItem;
import com.codeman.service.ProductCategoryService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.omg.CORBA.CODESET_INCOMPATIBLE;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2022/01/01
 */
@Api(tags = "商品分类管理")
@RestController
@RequestMapping("/productCategory")
public class ProductCategoryController {
    @Resource
    private ProductCategoryService productCategoryService;

    @ApiOperation("获取所有的一级分类和二级分类")
    @GetMapping("listWithChildren")
    public CommonResult<List<ProductCategoryWithChildrenItem>> listWithChildren() {
        List<ProductCategoryWithChildrenItem> items = productCategoryService.listWithChildren();
        return CommonResult.success(items);
    }
}
