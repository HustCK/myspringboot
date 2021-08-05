package com.example.myspring.Service;

import com.example.myspring.Dao.UserDao;
import com.example.myspring.Dao.UserDaoMySqlImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoMySqlImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}