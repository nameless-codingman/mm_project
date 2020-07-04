package com.itheima.mm.service;

import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.pojo.Course;

public interface CourseService {
    void addCourseByDao(Course course);
    PageResult findListByService(QueryPageBean queryPageBean);
    void updateCourseByDao(Course course);
    void deleteCourseByService(int id);
}
