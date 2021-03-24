package com.ecnu.petHospital.user.service;

import com.ecnu.petHospital.entity.User;
import com.ecnu.petHospital.paging.PageParam;
import com.ecnu.petHospital.user.param.LoginParam;
import com.ecnu.petHospital.user.param.RegisterParam;
import com.ecnu.petHospital.user.session.UserSessionInfo;
import com.ecnu.petHospital.user.vo.UserVO;

import java.util.List;

//@Service
public interface UserService {

    //登陆
    User login(LoginParam loginParam);

    //根据用户名获取用户
    UserVO getUserByUsername(String username);

    //根据用户Id获取用户
    UserVO getUserById(Integer id);

    //注册新用户
    int register(RegisterParam registerParam);

    //更新用户密码
    int updatePassword(UserSessionInfo userSessionInfo, String oldPassword, String newPassword);

    //更新用户名
    int updateUsername(Integer id, String username);

    //更新用户电话
    int updateTelephone(Integer id, String telephone);

    //更改权限
    int updatePermission(Integer id, Integer admin);

    //获取所有用户
    List<User> getUserList(PageParam pageParam);

    //删除用户
    int deleteUserById(Integer id);

    //获取用户数
    int getCountOfUser();

}
