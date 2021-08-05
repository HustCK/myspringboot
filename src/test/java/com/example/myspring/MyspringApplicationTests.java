package com.example.myspring;

import com.example.myspring.Model.Hello;
import com.example.myspring.Service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootTest
class MyspringApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    void test() {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyspringApplication.class);
        UserService userService = context.getBean(UserService.class);
        userService.getUser();
    }

}
