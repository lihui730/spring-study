package com.shimmer.service;

import com.shimmer.dao.UserDao;
import com.shimmer.dao.UserDaoImpl;
import com.shimmer.dao.UserDaoMysqlImpl;

/**
 * Created by Hui Li on 2021/1/1 12:41
 */
public class UserServiceImpl implements UserService {

    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
