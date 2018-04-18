package com.lostkingdom.myblog.controller;

import com.lostkingdom.myblog.entity.User;
import com.lostkingdom.myblog.mapper.UserMapper;
import com.lostkingdom.myblog.utils.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/login.do",method = {RequestMethod.GET})
    public String login(@Param(value = "username") String userName,@Param(value = "password") String password){



        if(basicInfoCheck(userName,password)){

        }
        return null;
    }

    /*

     */
    private Boolean basicInfoCheck(String userName,String password){
        if(StringUtils.isNotBlank(userName)){
            if (StringUtils.isNotBlank(password)){
                return true;
            }
        }
        return false;
    }
    /**
     * check user infomation without token
     * @param userName
     * @param password
     * @return
     */
    private Boolean loginCheck (String userName,String password){
        User user = userMapper.findUserByUserName(userName);
        return user.getPassword().equals(password);
    }
}
