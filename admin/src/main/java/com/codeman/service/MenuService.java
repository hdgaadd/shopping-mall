package com.codeman.service;

import com.codeman.dto.MenuNode;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
public interface MenuService {
    /**
     * 获取所有菜单的树形结构
     * @return
     */
    List<MenuNode> treeMenus();
}