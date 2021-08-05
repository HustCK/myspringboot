package com.example.myspring;

import com.example.myspring.Dao.UserDaoMySqlImpl;
import com.example.myspring.Service.UserService;
import com.example.myspring.Service.UserServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MyspringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void test(){
        UserServiceImpl service = new UserServiceImpl();
        service.setUserDao( new UserDaoMySqlImpl() );
        service.getUser();
        //那我们现在又想用Oracle去实现呢
//        service.setUserDao( new UserDaoOracleImpl() );
//        service.getUser();
    }
}
