package com.gradle.springboot.manager;

import com.gradle.springboot.manager.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ManagerApplicationTests {

    @Autowired
    UserService userService;
    @Test
    public void contextLoads() {
    }
    @Test
    public void test01(){
        System.out.println(userService.findMaxIdUser());
    }

}
