package com.itheima.mm.dao;

import com.itheima.mm.entity.ChangeLogDate;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.Date;
import java.util.List;

public interface IChangeLogDate {

    @Select("select * from t_logbook")
    List<ChangeLogDate> findAllChange();

    @Insert("insert into t_logbook values (null,#{userName},#{changeDate},#{context})")
    void addChangeLog(ChangeLogDate changeLogDate);

    @Select("select * from t_logbook where changeDate=#{date}")
    List<ChangeLogDate> findAllChangeByDate(Date date);
    @Select("select * from t_logbook where userName like concat('%',#{userName},'%')")
    List<ChangeLogDate> findAllChangeByUsername(String userName);
}
