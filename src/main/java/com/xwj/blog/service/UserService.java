package com.xwj.blog.service;

import com.xwj.blog.entity.User;

/**
 * @author : xwj
 * @date :
 * @description: 用户的逻辑层
 **/

public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
