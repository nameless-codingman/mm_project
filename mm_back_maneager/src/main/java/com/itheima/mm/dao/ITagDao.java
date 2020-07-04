package com.itheima.mm.dao;

import com.itheima.mm.pojo.Tag;
import org.apache.ibatis.annotations.Select;

import java.util.HashMap;
import java.util.List;

public interface ITagDao {

    //@Select("select count(*) from t_tag where courseId=#{courseId}")
    long findCourseByTag(int courseId);

  //  @Select("select * from t_tag where courseId=#{courseId}")
    List<Tag> findCourseByTag2(int courseId);

    void addTagList(HashMap<String, Object> map);
}
