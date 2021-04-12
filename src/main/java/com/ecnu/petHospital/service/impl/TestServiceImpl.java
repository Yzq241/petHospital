package com.ecnu.petHospital.service.impl;

import com.ecnu.petHospital.dao.TestMapper;
import com.ecnu.petHospital.entity.Test;
import com.ecnu.petHospital.param.PageParam;
import com.ecnu.petHospital.service.TestService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestMapper testMapper;

    @Override
    public PageInfo<Test> getTestList(PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize());
        List<Test> testList = testMapper.selectAll();
        return new PageInfo<>(testList);
    }
}
