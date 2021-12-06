package com.codeman.controller;

import com.codeman.service.EsService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.R;

import javax.annotation.Resource;

/**
 * @author hdgaadd
 * Created on 2021/12/06 21:15:56
 */
@Api(tags = "查询所有商品")
@RestController
@RequestMapping("/esProduct")
public class EsController {
    @Resource
    private EsService esService;

    @GetMapping("/importAll")
    public R<Integer> importAll(Integer id){
        int count = esService.importAll(id);
        System.out.println(count);
        return R.ok(count);
    }
}
