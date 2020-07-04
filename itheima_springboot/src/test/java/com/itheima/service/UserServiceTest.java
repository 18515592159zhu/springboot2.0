package com.itheima.service;

import com.itheima.pojo.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest()
public class UserServiceTest {

    @Autowired
    private UserService userService;

    @Test
    public void queryById() throws Exception {
        User user = userService.queryById(1L);
        System.out.println(user);
    }

    @Test
    public void save() throws Exception {
        User user = new User();
        user.setName("test2");
        user.setUserName("test2");
        user.setPassword("123");
        user.setSex(2);
        user.setAge(22);
        user.setCreated(new Date());
        userService.save(user);
    }
}