package com.codeman.controller;

import com.codeman.entity.HomeResult;
import com.codeman.service.HomeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

@Api(tags = "首页")
@RestController
public class HomeController {

    @Resource
    private HomeService homeService;

    @GetMapping("/content")
    @ApiOperation("首页内容展示")
    public HomeResult content() {
        HomeResult content = homeService.content();
        return content;
    }
}
