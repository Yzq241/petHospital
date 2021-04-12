package com.ecnu.petHospital.service;

import com.ecnu.petHospital.entity.TestPaper;
import com.ecnu.petHospital.param.PageParam;
import com.github.pagehelper.PageInfo;

public interface TestPaperService {

    PageInfo<TestPaper> getTestPaperList(PageParam pageParam);
}
