package com.itheima.mm.dao;

import com.itheima.mm.pojo.User;

public interface IUserDao {
    User findUserNameByDao(String username);
}
