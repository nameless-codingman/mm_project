package com.itheima.mm.utils;

import org.apache.ibatis.session.SqlSession;


import java.lang.reflect.Proxy;

public class DaoFactoryUtils {

    public static <T> T getPoxyBean(Class<T> interfaceClass){
        return (T)Proxy.newProxyInstance(interfaceClass.getClassLoader(), new Class[]{interfaceClass}, (proxy,method,args)->{
            SqlSession sqlSession = SqlSessionFactoryUtils.openSqlSession();
            T obj = sqlSession.getMapper(interfaceClass);
            Object result = method.invoke(obj, args);
            SqlSessionFactoryUtils.commitAndClose(sqlSession);
            return result;
        });
    }
}
