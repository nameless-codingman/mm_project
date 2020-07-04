package com.itheima.mm.service.impl;

import com.itheima.mm.dao.ICourseDao;
import com.itheima.mm.dao.IQuestionDao;
import com.itheima.mm.dao.IQuestionOptionDao;
import com.itheima.mm.dao.ITagDao;
import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.pojo.Course;
import com.itheima.mm.pojo.Question;
import com.itheima.mm.service.QuestionBasicService;
import com.itheima.mm.utils.SqlSessionFactoryUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
@Service
public class QuestionBasicServiceImpl implements QuestionBasicService {
    @Autowired
    private ICourseDao iCourseDao;
    @Autowired
    private IQuestionDao iQuestionDao;
    @Override
    public List<Course> findAllCourse(int status) {
        List<Course> courseList = iCourseDao.findByStatus(status);
        return courseList;
    }
    @Override
    public PageResult findQuestionList(QueryPageBean queryPageBean) {
        long count = iQuestionDao.findCount(queryPageBean);
        List<Question> rows = iQuestionDao.findQuestionList(queryPageBean);
        return new PageResult(count,rows);
    }
    @Override
    public void addQuestionAll(Question question) throws Exception {
        SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
        IQuestionOptionDao questionItemDao = sqlSession.getMapper(IQuestionOptionDao.class);
        IQuestionDao questionDao = sqlSession.getMapper(IQuestionDao.class);
        ITagDao iTagDao = sqlSession.getMapper(ITagDao.class);
        HashMap<String, Object> map = new HashMap<>();
        questionDao.addQuestion(question);//返回是直接回到封装里面的id
        map.put("questionId",question.getId());
        map.put("questionItemList",question.getQuestionItemList());
        questionItemDao.addQuestionOption(map);
        map.put("TagList",question.getTags());
        iTagDao.addTagList(map);
        SqlSessionFactoryUtils.commitAndClose(sqlSession);
    }
}
