package com.ecnu.petHospital.controller;

import com.ecnu.petHospital.param.PageParam;
import com.ecnu.petHospital.result.CommonResult;
import com.ecnu.petHospital.result.Result;
import com.ecnu.petHospital.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/getQuestionList")
    public Result<?> getQuestionList(@RequestParam Integer diseaseId,
                                     @RequestParam PageParam pageParam){

        return CommonResult.success().data(questionService.getQuestionList(diseaseId, pageParam));
    }


}
