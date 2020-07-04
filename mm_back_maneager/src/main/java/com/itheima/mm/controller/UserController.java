package com.itheima.mm.controller;




import com.itheima.mm.constants.Constants;

import com.itheima.mm.entity.Result;
import com.itheima.mm.pojo.User;
import com.itheima.mm.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import javax.servlet.http.HttpSession;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
    @RequestMapping("/user/logout")
    public Result logoutUser(HttpSession session)throws Exception{
        try {
          session.invalidate();
           return new Result(true,"logout success");
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(false,"logout fail");
        }
    }
    @RequestMapping("/user/login")
    public Result logintest(@RequestBody User user,HttpSession session)throws Exception{
        try {
            //2. 调用业务层的方法，校验登录
            User loginUser = userService.loginByDao(user);
            //3. 登录成功，将用户信息存储到Session中，向客户端响应数据
             session.setAttribute(Constants.Constants_mm_loginuser,loginUser);
//            String jsonString = JSON.toJSONString(loginUser);
            return new Result(true,"登录成功");
//            System.out.println(jsonString+">>>>>>>>>>>>>>>>>>>>>>>>>");
        } catch (Exception e) {
            e.printStackTrace();
            //登录失败，失败的信息就是e的message
            return new Result(false,e.getMessage());
        }
    }
}
