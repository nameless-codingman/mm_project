package com.itheima.mm.controller;

import com.itheima.mm.constants.Constants;
import com.itheima.mm.entity.ChangeLogDate;
import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;


import com.itheima.mm.entity.Result;
import com.itheima.mm.pojo.Course;
import com.itheima.mm.pojo.User;
import com.itheima.mm.service.CourseService;
import com.itheima.mm.utils.DateUtils;

import com.itheima.mm.utils.LogUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

@RestController
public class CourseController {
    @Autowired
    private CourseService courseService;
    @RequestMapping("/course/add")
    public Result addCourse(@RequestBody Course course, HttpSession session)throws Exception{
        try {
            User user = (User) session.getAttribute(Constants.Constants_mm_loginuser);
            course.setUserId(user.getId());
            courseService.addCourseByDao(course);
            String context="course:*****add*****"+course.getName()+"***by***"+user.getUsername()+"******";
            ChangeLogDate changeLogDate=new ChangeLogDate(user.getUsername(),DateUtils.parseDate2String(new Date()),context);
            System.out.println(changeLogDate+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            LogUtils.addLogDate(changeLogDate);
            return new Result(true,"添加成功");
        } catch (Exception e) {
            e.printStackTrace();
             return new Result(false,"添加失败");
        }
    }
    @RequestMapping("/course/findList")
    public Result findList(@RequestBody QueryPageBean queryPageBean)throws Exception{
        try {
            Integer offset = queryPageBean.getOffset();
            queryPageBean.setOffset(offset);
            PageResult listByService = courseService.findListByService(queryPageBean);
              return     new Result(true,listByService,"查询成功");
        } catch (Exception e) {
            e.printStackTrace();
           return new Result(false,"查询失败");
        }
    }
    @RequestMapping("/course/update")
    public Result updateCourse(@RequestBody Course course,HttpSession session)throws Exception{
        try {
            courseService.updateCourseByDao(course);

            User user = (User) session.getAttribute(Constants.Constants_mm_loginuser);
            String context="course:*****update*****"+course.getName()+"***by***"+user.getUsername()+"******";
            ChangeLogDate changeLogDate=new ChangeLogDate(user.getUsername(),DateUtils.parseDate2String(new Date()),context);
            LogUtils.addLogDate(changeLogDate);
            return new Result(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
           return new Result(false,"修改失败");
        }
    }

    @RequestMapping("/course/delete")
    public Result deleteCourse(int id,HttpSession session)throws Exception {
        try {
            courseService.deleteCourseByService(id);

            User user = (User) session.getAttribute(Constants.Constants_mm_loginuser);
            String context="course:*****delete***id="+id+"***by***"+user.getUsername()+"*****";
            ChangeLogDate changeLogDate=new ChangeLogDate(user.getUsername(),DateUtils.parseDate2String(new Date()),context);
            LogUtils.addLogDate(changeLogDate);
            return new Result(true,"删除成功");
        } catch (Exception e) {
            e.printStackTrace();
          return new Result(false,e.getMessage());
        }
    }
}
