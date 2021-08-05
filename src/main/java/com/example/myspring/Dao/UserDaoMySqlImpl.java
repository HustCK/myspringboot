package com.example.myspring.Dao;

import org.springframework.stereotype.Component;

@Component
public class UserDaoMySqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("MySql获取用户数据");
    }
}