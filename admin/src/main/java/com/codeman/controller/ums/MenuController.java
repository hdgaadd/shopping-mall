package com.codeman.controller.ums;

import com.codeman.dto.MenuNode;
import com.codeman.service.MenuService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
 */
@Api(tags = "菜单管理")
@RestController
@RequestMapping("/menu")
public class MenuController {
    @Resource
    private MenuService menuService;
    // create(Menu o) 添加菜单

    // update(Long id, Menu o) 修改菜单

    // getItem(Long id) 获取菜单详情

    // delete(Long id) 删除菜单

    // list(Long parentId, Integer pageNum, Integer pageSize) 根据菜单父类id，分页查询父类id下的所有菜单

    @ApiOperation("获取所有菜单的树形结构")
    @GetMapping("/treeMenus")
    public CommonResult<List<MenuNode>> treeMenus() {
        List<MenuNode> menuNodes = menuService.treeMenus();
        return CommonResult.success(menuNodes);
    }

   // updateHidden(Long id, Integer hiddenStatus) 修改菜单隐藏状态
}
