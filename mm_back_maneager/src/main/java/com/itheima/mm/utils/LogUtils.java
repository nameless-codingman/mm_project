package com.itheima.mm.utils;

import com.itheima.mm.dao.IChangeLogDate;
import com.itheima.mm.entity.ChangeLogDate;


import java.util.Date;
import java.util.List;

public class LogUtils {
    private static IChangeLogDate iChangeLogDate=DaoFactoryUtils.getPoxyBean(IChangeLogDate.class);
    private LogUtils (){}
    public static void printLog(){
        List<ChangeLogDate> dateList = iChangeLogDate.findAllChange();
        for (ChangeLogDate changeLogDate : dateList) {
            System.out.println("===========================================================操作日志===============================================================");
            System.out.println("操作日期:"+changeLogDate.getChangeDate());
            System.out.println("操作者:"+changeLogDate.getUserName());
            System.out.println("操作内容:"+changeLogDate.getContext());
            System.out.println("==================================================================================================================================");
        }
    }
    public static void printLogAll(Date date){
        List<ChangeLogDate> dateList = iChangeLogDate.findAllChangeByDate(date);
        for (ChangeLogDate changeLogDate : dateList) {
            System.out.println("===========================================================操作日志===============================================================");
            System.out.println("操作日期:"+changeLogDate.getChangeDate());
            System.out.println("操作者:"+changeLogDate.getUserName());
            System.out.println("操作内容:"+changeLogDate.getContext());
            System.out.println("==================================================================================================================================");
        }
    }
    public static void printLog(String  userName){
        List<ChangeLogDate> dateList = iChangeLogDate.findAllChangeByUsername(userName);
        for (ChangeLogDate changeLogDate : dateList) {
            System.out.println("===========================================================操作日志===============================================================");
            System.out.println("操作日期:"+changeLogDate.getChangeDate());
            System.out.println("操作者:"+changeLogDate.getUserName());
            System.out.println("操作内容:"+changeLogDate.getContext());
            System.out.println("==================================================================================================================================");
        }
    }
    public static void addLogDate(ChangeLogDate changeLogDate){
        iChangeLogDate.addChangeLog(changeLogDate);
    }
}
