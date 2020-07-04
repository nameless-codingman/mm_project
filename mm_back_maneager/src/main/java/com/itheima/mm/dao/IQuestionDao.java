package com.itheima.mm.dao;

import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.pojo.Question;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface IQuestionDao {

    long findCourseByQuestion(int courseId);

    long  findCount(QueryPageBean queryPageBean);

    List<Question> findQuestionList(QueryPageBean queryPageBean);

    int addQuestion(Question question);
}
