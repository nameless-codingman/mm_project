package com.itheima.mm.dao;

import com.itheima.mm.pojo.Catalog;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface ICatalogDao {

    @Select("select count(*) from t_catalog where courseId=#{courseId}")
    long findCourseByCatalog(int courseId);
    @Select("select * from t_catalog where courseId=#{courseId}")
    List<Catalog> findCourseByCatalog2(int courseId);


}
