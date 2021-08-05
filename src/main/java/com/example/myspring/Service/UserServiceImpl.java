package com.example.myspring.Service;

import com.example.myspring.Dao.UserDao;
import com.example.myspring.Dao.UserDaoImpl;

public class UserServiceImpl implements UserService {
    private UserDao userDao = new UserDaoImpl();

    @Override
    public void getUser() {
        userDao.getUser();
    }
}