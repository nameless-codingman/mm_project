package com.itheima.mm.dao;

import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.pojo.Course;

import java.util.List;

public interface ICourseDao {
    void addCourse(Course course);

    Long findCount(QueryPageBean queryPageBean);

    List<Course> findByCourseDao(QueryPageBean queryPageBean);

    void updateCourse(Course course);

    void deleteCourse(int id);

    List<Course> findByStatus(int status);
}
