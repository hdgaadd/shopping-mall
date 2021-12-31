package com.codeman.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.codeman.domain.Menu;
import com.codeman.domain.RoleMenuRelation;
import com.codeman.mapper.MenuMapper;
import com.codeman.mapper.RoleMenuRelationMapper;
import com.codeman.service.RoleService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
@Service
public class RoleServiceImpl implements RoleService {
    @Resource
    private MenuMapper menuMapper;
    @Resource
    private RoleMenuRelationMapper roleMenuRelationMapper;

    @Override
    public List<Menu> listMenu(Long roleId) {
        // 查询角色的所有菜单id
        QueryWrapper<RoleMenuRelation> roleMenuRelationQueryWrapper = new QueryWrapper<>();
        roleMenuRelationQueryWrapper.eq("role_id", roleId);
        List<RoleMenuRelation> roleMenuRelations = roleMenuRelationMapper.selectList(roleMenuRelationQueryWrapper);

        List<Long> menuIds = roleMenuRelations.stream()
                .map(RoleMenuRelation::getMenuId).collect(Collectors.toList());

        List<Menu> menus = new ArrayList<>();
        for (Long id : menuIds) {
            menus.add(menuMapper.selectById(id));
        }
        return menus;
    }
}
