package com.example.myspring.Service;

import com.example.myspring.Dao.UserDao;
import com.example.myspring.Dao.UserDaoMySqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    // 利用set实现
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}