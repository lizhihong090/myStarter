package com.starter.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

/**
 * @Auther: li zhihong
 * @Date: 2020/3/13 4:50 PM
 */
@RestController
@Api(tags = { "swagger tag" }, description = "测试接口描述")
@RequestMapping("/mydemo")
public class CController {
    @RequestMapping(method = GET, value = "/dashboard")
    @ApiOperation(value = "method")
    public Object method(
            @RequestParam(name = "startDate", required = false)
            @ApiParam(value = "查询起始日期（含）", example = "2020-03-13")
                    String startDateStr
    ) {
        System.out.println("startDateStr ----->" + startDateStr);
        return "startDateStr ----->" + startDateStr;
    }
}
