package com.itheima.mm.service.impl;


import com.itheima.mm.dao.ICatalogDao;
import com.itheima.mm.dao.ICourseDao;
import com.itheima.mm.dao.IQuestionDao;
import com.itheima.mm.dao.ITagDao;
import com.itheima.mm.entity.PageResult;
import com.itheima.mm.entity.QueryPageBean;
import com.itheima.mm.pojo.Course;
import com.itheima.mm.service.CourseService;
import com.itheima.mm.utils.DaoFactoryUtils;
import com.itheima.mm.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class CourseServiceImpl implements CourseService {
    @Autowired
    private ICourseDao iCourseDao;
    @Override
    public void addCourseByDao(Course course) {
            course.setCreateDate(DateUtils.parseDate2String(new Date()));
            course.setOrderNo(1);
            iCourseDao.addCourse(course);

    }
    @Override
    public PageResult findListByService(QueryPageBean queryPageBean)  {
        Long total = iCourseDao.findCount(queryPageBean);
        List<Course> rows = iCourseDao.findByCourseDao(queryPageBean);
        PageResult pageResult = new PageResult();
        pageResult.setRows(rows);
        pageResult.setTotal(total);
        return pageResult;
    }
    @Override
    public void updateCourseByDao(Course course) {
        iCourseDao.updateCourse(course);
    }
    @Override
    public void deleteCourseByService(int id) {
        if(DaoFactoryUtils.getPoxyBean(ICatalogDao.class).findCourseByCatalog(id)>0){
            throw new RuntimeException("有表关联无法删除");
        }
        if(DaoFactoryUtils.getPoxyBean(IQuestionDao.class).findCourseByQuestion(id)>0){
            throw new RuntimeException("有表关联无法删除");
        }
        if(DaoFactoryUtils.getPoxyBean(ITagDao.class).findCourseByTag(id)>0){
            throw new RuntimeException("有表关联无法删除");
        }
        iCourseDao.deleteCourse(id);
    }
}

