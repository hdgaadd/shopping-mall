package com.codeman.dto;

import com.codeman.domain.Menu;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author hdgaadd
 * Created on 2021/12/26
 */
@Data
public class MenuNode extends Menu {
    // 所有节点都应该是MenuNode，子菜单也可能是别人的父级菜单
    @ApiModelProperty("菜单的子级菜单")
    List<MenuNode> childs;
}
