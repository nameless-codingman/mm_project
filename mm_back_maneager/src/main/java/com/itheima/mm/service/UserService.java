package com.itheima.mm.service;

import com.itheima.mm.pojo.User;

public interface UserService {
    User loginByDao(User user) throws Exception;
}
