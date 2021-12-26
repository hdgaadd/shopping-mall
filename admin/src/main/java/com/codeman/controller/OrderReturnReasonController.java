package com.codeman.controller;

import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hdgaadd
 * Created on 2021/12/26
*/
@Api(tags = "退货管理")
@RestController
@RequestMapping("/returnReason")
public class OrderReturnReasonController {
    // create(OrderReturnReason o) 添加退货原因

    // update(OrderReturnReason o) 修改退货原因

    // delete(List<Long> ids) 批量删除退货原因

    // list(Integer pageNum, Integer pageSize) 分页查询所有退货原因

    // getItem(Integer id) 获取一条退货原因的详细信息

    // updateStatus(List<Long> ids, Integer status) 修改退货原因的状态
}
