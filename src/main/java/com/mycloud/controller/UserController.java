package com.mycloud.controller;

import com.mycloud.domain.User;
import com.mycloud.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    //회원 가입
    @PostMapping(value = "/user")
    public @ResponseBody User registUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    //사용자 정보 조회
    public User selectUser(String userId){

        return null;//회원 정보 리턴
    }

}
