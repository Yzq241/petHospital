package com.ecnu.petHospital.controller;

import com.ecnu.petHospital.param.PageParam;
import com.ecnu.petHospital.result.CommonResult;
import com.ecnu.petHospital.result.Result;
import com.ecnu.petHospital.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/test")
public class TestController {

    @Autowired
    private TestService testService;

    @PostMapping("/getTestList")
    public Result<?> getQuestionList(@RequestParam PageParam pageParam){

        return CommonResult.success().data(testService.getTestList(pageParam));
    }

}
