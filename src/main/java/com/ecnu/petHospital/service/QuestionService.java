package com.ecnu.petHospital.service;

import com.ecnu.petHospital.entity.Question;
import com.ecnu.petHospital.param.PageParam;
import com.github.pagehelper.PageInfo;
import org.springframework.stereotype.Service;

@Service
public interface QuestionService {

    PageInfo<Question> getQuestionList(Integer diseaseId, PageParam pageParam);
}
