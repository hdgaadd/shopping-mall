package com.codeman.controller;

import com.codeman.entity.HomeResult;
import com.codeman.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import util.R;

import javax.annotation.Resource;

@Api(tags = "首页")
@RestController
@RequestMapping("/home")
public class HomeController {

    @Resource
    private HomeService homeService;

    @ApiOperation("首页内容展示")
    @GetMapping("/content")
    public R<HomeResult> content() {
        HomeResult content = homeService.content();
        return R.ok(content);
    }
}
