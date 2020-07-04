package com.itheima.mm.service.impl;

import com.itheima.mm.dao.IUserDao;
import com.itheima.mm.pojo.User;
import com.itheima.mm.service.UserService;
import com.itheima.mm.utils.DaoFactoryUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl  implements UserService {
    @Autowired
    private IUserDao iUserDao;
    @Override
    public User loginByDao(User user) throws Exception{
        User sqlUser = iUserDao.findUserNameByDao(user.getUsername());
        //不为null 就是找到了在数据库中
        if(sqlUser!=null){
            //核对 传过来的user的password和sqlUser的password
            if(sqlUser.getPassword().equals(user.getPassword())){
                return sqlUser;
            }
            throw  new RuntimeException("密码错误");
        }
        throw new RuntimeException("用户名不存在");
    }
}
