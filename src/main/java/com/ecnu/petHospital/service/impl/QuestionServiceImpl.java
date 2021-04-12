package com.ecnu.petHospital.service.impl;

import com.ecnu.petHospital.dao.QuestionMapper;
import com.ecnu.petHospital.entity.Question;
import com.ecnu.petHospital.param.PageParam;
import com.ecnu.petHospital.service.QuestionService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImpl implements QuestionService {

    @Autowired
    QuestionMapper questionMapper;

    @Override
    public PageInfo<Question> getQuestionList(Integer diseaseId, PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNum(),pageParam.getPageSize());
        List<Question> questionList = questionMapper.getQuestionList(diseaseId);
        return new PageInfo<>(questionList);
    }
}
