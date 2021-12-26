package com.codeman.service.impl;

import com.codeman.domain.Menu;
import com.codeman.dto.MenuNode;
import com.codeman.mapper.MenuMapper;
import com.codeman.service.MenuService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
@Service
public class MenuServiceImpl implements MenuService {
    @Resource
    private MenuMapper menuMapper;

    @Override
    public List<MenuNode> treeMenus() {
        List<Menu> menus = menuMapper.selectList(null);
        // getParentId()指定最高级别的菜单
        List<MenuNode> menuNodes = menus.stream().filter(menu -> menu.getParentId().equals(0L))
                .map(menu -> covetMenuNode(menu, menus)).collect(Collectors.toList());
        return menuNodes;
    }

    /**
     * 给最高级的菜单添加子菜单
     * @param menu
     * @param menus
     * @return
     */
    private MenuNode covetMenuNode(Menu menu, List<Menu> menus) {
        MenuNode menuNode = new MenuNode();
        // 存在两个具有相同属性的bean，可以使用该方法
        BeanUtils.copyProperties(menu, menuNode);
        // 所有节点都应该是MenuNode，子菜单也可能是别人的父级菜单
        List<MenuNode> childs = menus.stream()
                .filter(subMenu -> subMenu.getParentId().equals(menu.getId()))
                .map(subMenu -> covetMenuNode(subMenu, menus))
                .collect(Collectors.toList());
        /*List<Menu> childs = menus.stream()
            .filter(subMenu -> subMenu.getParentId().equals(menu.getId()))
            .map(subMenu -> covetMenuNode(subMenu, menus)) // childs结果为Menu类型，但covetMenuNode返回的是MenuNode类型
            .collect(Collectors.toList());*/
        menuNode.setChilds(childs);
        return menuNode;
    }


}
