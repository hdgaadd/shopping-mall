package com.codeman.service;

import com.codeman.domain.Menu;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
public interface RoleService {
    /**
     * 获取角色的相关菜单
     * @param roleId
     * @return
     */
    List<Menu> listMenu(Long roleId);

}