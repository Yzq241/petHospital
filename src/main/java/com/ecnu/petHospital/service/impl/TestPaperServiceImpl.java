package com.ecnu.petHospital.service.impl;

import com.ecnu.petHospital.dao.TestPaperMapper;
import com.ecnu.petHospital.entity.TestPaper;
import com.ecnu.petHospital.param.PageParam;
import com.ecnu.petHospital.service.TestPaperService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TestPaperServiceImpl implements TestPaperService {

    @Autowired
    private TestPaperMapper testPaperMapper;

    @Override
    public PageInfo<TestPaper> getTestPaperList(PageParam pageParam) {
        PageHelper.startPage(pageParam.getPageNum(), pageParam.getPageSize(), "id desc");
        List<TestPaper> testPaperList = testPaperMapper.selectAll();
        return new PageInfo<>(testPaperList);
    }

}
