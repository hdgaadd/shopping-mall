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

    // CREATE READ UPDATE DELETE

    // create(ProductCategory productCategory) 创建商品分类，如果传入的商品分类对象没有父类id则设置其为最高级别商品分类，有则level设置为父类的level - 1

    // update(Long id, ProductCategoryParam param) 根据商品分类id，更新商品分类，若该param拥有List<商品属性id>，则删除该商品分类的原有所有属性，把新的属性id插入

    @ApiOperation("获取所有的一级分类和二级分类")
    @GetMapping("listWithChildren")
    public CommonResult<List<ProductCategoryWithChildrenItem>> listWithChildren() {
        List<ProductCategoryWithChildrenItem> items = productCategoryService.listWithChildren();
        return CommonResult.success(items);
    }
}
