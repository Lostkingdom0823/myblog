package com.lostkingdom.myblog;

import com.lostkingdom.myblog.entity.User;
import com.lostkingdom.myblog.mapper.UserMapper;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.transaction.annotation.Transactional;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = MyblogApplication.class)
@WebAppConfiguration
public class MyblogApplicationTests {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void contextLoads() {
    }

    @Test
    @Transactional
    public void myBatisConnectionTest() {
        Integer result = userMapper.insert("winterchen", "123456", "12345678910");
        System.out.println(result);
        User u = userMapper.findUserByPhone("12345678910");
        Assert.assertEquals("winterchen", u.getName());

    }

}
