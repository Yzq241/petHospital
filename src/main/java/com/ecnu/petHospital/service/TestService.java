package com.ecnu.petHospital.service;

import com.ecnu.petHospital.entity.Test;
import com.ecnu.petHospital.param.PageParam;
import com.github.pagehelper.PageInfo;

import java.util.List;

public interface TestService {

    PageInfo<Test> getTestList(PageParam pageParam);
}
