package com.ecnu.petHospital.controller;

import com.ecnu.petHospital.entity.User;
import com.ecnu.petHospital.result.CommonResult;
import com.ecnu.petHospital.result.Result;
import com.ecnu.petHospital.result.UserResult;
import com.ecnu.petHospital.exception.IncorrectUsernameOrPasswordException;
import com.ecnu.petHospital.exception.UsernameAlreadyExistException;
import com.ecnu.petHospital.exception.UsernameNotExistsException;
import com.ecnu.petHospital.param.LoginParam;
import com.ecnu.petHospital.param.RegisterParam;
import com.ecnu.petHospital.service.UserService;
import com.ecnu.petHospital.session.UserSessionInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
@CrossOrigin
@Api("登录注册")
public class LoginController {

    @Autowired
    private UserService userService;

    @ApiOperation(value = "登录", response = Result.class)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "email", value = "注册邮箱", required = true, paramType = "query", dataType = "String"),
            @ApiImplicitParam(name = "password", value = "密码", required = true, paramType = "query", dataType = "String")
    })
    @PostMapping("/login")
    public Result<?> login(@RequestParam String username, @RequestParam String  password,
                           HttpSession httpSession){
        //参数校验
        LoginParam loginParam = new LoginParam(username,password);
        if(loginParam.getUsername().length() < 2 || loginParam.getUsername().length() > 20
                ||loginParam.getPassword().length() < 2 ||loginParam.getPassword().length() > 20){
            return UserResult.invalidUsernameOrPassword();
        }

        UserSessionInfo userSessionInfo = new UserSessionInfo();

        //请求转发，会话管理
        try{
            User user = userService.login(loginParam);
            BeanUtils.copyProperties(user,userSessionInfo);
            httpSession.setAttribute("userSessionInfo",userSessionInfo);
        }catch (UsernameNotExistsException e){
            return UserResult.usernameNotExists();
        }
        catch (IncorrectUsernameOrPasswordException e){
            return UserResult.incorrectUsernameOrPassword();
        }

        return CommonResult.success().data(userSessionInfo);
    }

    @PostMapping("/register")
    public Result<?> register(@RequestParam String username, @RequestParam String  password, @RequestParam String email){

        RegisterParam registerParam = new RegisterParam(username,password,email);
        //参数校验
        if(registerParam.getUsername().length() < 2 || registerParam.getUsername().length() > 20
                || registerParam.getPassword().length() < 2 || registerParam.getPassword().length() > 20){
            return UserResult.invalidUsernameOrPassword();
        }

         try{
             userService.register(registerParam);
         }catch (UsernameAlreadyExistException e){
             return UserResult.usernameAlreadyExists();
         }
         return CommonResult.success();
    }

//OK

    @PostMapping("/logout")
    public Result<?> logout(HttpSession session){
        session.invalidate();
        return CommonResult.success();
    }

}
