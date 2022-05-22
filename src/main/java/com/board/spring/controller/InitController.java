package com.board.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class InitController {

    @GetMapping("init")
    //@ResponseBody
    //해당 어노테이션을 추가하면 return 값이 바로 response값이 됨.
    public String init(){

        return "init";
    }
}
