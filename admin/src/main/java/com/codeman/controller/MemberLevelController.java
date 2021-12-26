package com.codeman.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
@Api(tags = "用户等级管理")
@RestController
@RequestMapping("/memberLevel")
public class MemberLevelController {
    // selectAll(Integer status) 查询状态为失效或正常的，所有用户等级
}
