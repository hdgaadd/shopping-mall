package com.codeman.controller.ums;

import com.codeman.domain.Menu;
import com.codeman.service.RoleService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.CommonResult;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
 */
@Api(tags = "后台用户角色管理")
@RestController
@RequestMapping("/role")
public class RoleController {
    @Resource
    private RoleService roleService;

    // create(Role o) 增

    // delete(List<Long> ids) 批量删除角色

    // update(Long id, Role o) 改

    // listAll() 查询所有

    // selectByRoleName(String nameKeyword, Integer pageNum, Integer pageSize) 根据角色名称，分页模糊查询所有角色

    // updateStatus(Long id, Role o) 修改角色状态

    @ApiOperation("获取角色的相关菜单")
    @GetMapping("/listMenu/{roleId}")
    public CommonResult<List<Menu>> listMenu(@PathVariable Long roleId) {
        List<Menu> menus = roleService.listMenu(roleId);
        return CommonResult.success(menus);
    }

    // listResource(Long roleId) 获取角色的相关资源

    // allocateMenu(Long roleId, List<Long> menuIds) 清除角色所有菜单，根据菜单id重新分配菜单

    // allocateResource(Long roleId, List<Long> resourceId) 清除角色所有资源，根据资源id重新分配资源
}
