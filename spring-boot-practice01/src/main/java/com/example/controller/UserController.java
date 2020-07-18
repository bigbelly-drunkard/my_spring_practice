package com.example.controller;

import com.example.bean.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

/**
 * @author lenovo
 */
@Controller
public class UserController {

    @RequestMapping("/user")
    public String success(Map<String,Object> map){
        map.put("userList", generateUser());
        return "list";
    }

    public List<User> generateUser(){
        List<User> list = new ArrayList<User>();
        for(int i=0;i<10;i++){
            list.add(new User(i,"zhangsan"+i,"1501452012"+i));
        }
        return list;
    }
}
