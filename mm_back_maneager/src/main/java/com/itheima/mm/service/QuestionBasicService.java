package com.itheima.mm.service;

import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.pojo.Course;
import com.itheima.mm.pojo.Question;

import java.util.List;

public interface QuestionBasicService {
    List<Course> findAllCourse(int status);

    PageResult findQuestionList(QueryPageBean queryPageBean);

    void addQuestionAll(Question question) throws Exception;
}
