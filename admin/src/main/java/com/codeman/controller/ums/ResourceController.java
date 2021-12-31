package com.codeman.controller.ums;

import com.codeman.domain.Resource;
import com.codeman.service.ResourceService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import util.CommonResult;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
 */
@Api(tags = "后台资源管理")
@RestController
@RequestMapping("/resource")
public class ResourceController {
    @Autowired
    private ResourceService resourceService;

    // create(Resource o) 添加资源

    // delete(Long id) 根据id，删除资源

    // update(Long id, Resource o) 修改资源

    // getItem(Long id) 获取资源详情

    @ApiOperation("分页模糊查询后台资源")
    @GetMapping("/list")
    public CommonResult<List<Resource>> list(@RequestParam(required = false) Long categoryId,
                                             @RequestParam(required = false) String nameKeyword,
                                             @RequestParam(required = false) String urlKeyword,
                                             @RequestParam(value = "defaultPageNum", defaultValue = "1") Integer pageNum,
                                             @RequestParam(value = "defaultPageSize", defaultValue = "3") Integer PageSize) {
        List<Resource> resources = resourceService.list(categoryId, nameKeyword, urlKeyword, pageNum, PageSize);
        return CommonResult.success(resources);
    }

    // selectAll() 查询所有后台资源
}
