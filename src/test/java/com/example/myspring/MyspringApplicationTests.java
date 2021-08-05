package com.example.myspring;

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
        UserService service = new UserServiceImpl();
        service.getUser();
    }
}
