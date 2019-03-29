package com.example.demo.user.controller;

import com.example.demo.user.bean.User;
import com.example.demo.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sun.plugin2.message.GetAppletMessage;

import java.util.List;

@RestController
@RequestMapping(value = "/api/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value = "/addUser",method = RequestMethod.POST)
    public boolean addUser(@RequestBody User user){
        return userService.addUser(user);
    }

    @RequestMapping(value = "/deleteUser", method = RequestMethod.DELETE)
    public boolean delete(@RequestParam(value = "userName", required = true) int userId) {
        System.out.println("开始删除...");
        return userService.deleteUser(userId);
    }

//    @RequestMapping(value = "/userName", method = RequestMethod.GET)
//    public User findByUserName(@RequestParam(value = "userName", required = true) String userName) {
//        System.out.println("开始查询...");
//        return userService.findUserByName(userName);
//    }

    @RequestMapping(value = "/userId", method = RequestMethod.GET)
    public User findByUserId(@RequestParam(value = "userId", required = true) int userId) {
        System.out.println("开始查询...");
        return userService.findUserById(userId);
    }


    @RequestMapping(value = "/findAll",method = RequestMethod.GET)
    public List<User> findAllUser(){
        return userService.findAll();
    }

//    @RequestMapping(value = "/userAge", method = RequestMethod.GET)
//    public User findByUserAge(@RequestParam(value = "userAge", required = true) int userAge) {
//        System.out.println("开始查询...");
//        return userService.findUserByAge(userAge);
//    }

}
