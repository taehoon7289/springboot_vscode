package com.example.daily.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping(value = "/user")
@Controller
public class UserController {

    @ResponseBody
    @RequestMapping(value = "/")
    public String getIndex(HttpServletRequest request,HttpServletResponse response) {
        return "test";
    }

}