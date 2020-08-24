package com.xwj.blog.service.impl;

import com.xwj.blog.dao.UserDao;
import com.xwj.blog.entity.User;
import com.xwj.blog.service.UserService;
import com.xwj.blog.util.MD5Util;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author : xwj
 * @date :
 * @description:
 **/

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    /**
     * @Description:
     * @Auther: ONESTAR
     * @Date: 21:25 2020/5/27
     * @Param: username:用户名；password:密码
     * @Return: 返回用户对象
     */
    @Override
    public User checkUser(String username, String password) {
        User user = userDao.findByUsernameAndPassword(username, MD5Util.code(password));
        return user;
    }
}