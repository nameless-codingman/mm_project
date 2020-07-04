package com.itheima.mm.controller;


import com.itheima.mm.constants.Constants;
import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.entity.Result;
import com.itheima.mm.pojo.Course;
import com.itheima.mm.pojo.Question;
import com.itheima.mm.pojo.User;
import com.itheima.mm.service.QuestionBasicService;
import com.itheima.mm.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;
import java.util.List;

@RestController
public class QuestionBasicController {
    @Autowired
    private QuestionBasicService questionBasicService;
    @RequestMapping("/questionBasic/putCourseList")
    public Result findAllTitle(int status)throws Exception{
        try {
            List<Course> allCourse = questionBasicService.findAllCourse(status);
            return new Result(true,allCourse,"获取成功");
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return new Result(false,"获取失败");
        }
    }

    @RequestMapping("/questionBasic/showQuestionList")
    public Result findQuestionList(@RequestBody QueryPageBean queryPageBean)throws Exception{
        try {
            PageResult pageResult = questionBasicService.findQuestionList(queryPageBean);
              return new Result(true,pageResult,"查询成功");
        } catch (Exception e) {
            e.printStackTrace();
             return new Result(false,"失败");
        }
    }

    @RequestMapping("/questionBasic/addQuestion")
    public Result addQuestionMethod(@RequestBody Question question, HttpSession session)throws Exception{
        try {
            User user = (User) session.getAttribute(Constants.Constants_mm_loginuser);
            question.setUserId(user.getId());
            question.setCreateDate(DateUtils.parseDate2String(new Date()));
            questionBasicService.addQuestionAll(question);
             return new Result(true,"添加成功");
        } catch (IOException e) {
            e.printStackTrace();
           return new Result(true,"添加失败");
        }
    }
}
