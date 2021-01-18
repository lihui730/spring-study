package com.shimmer.service;

import com.shimmer.dao.UserDao;

/**
 * Created by Hui Li on 2021/1/1 12:41
 */
public interface UserService {
    void getUser();
    void setUserDao(UserDao userDao);
}
