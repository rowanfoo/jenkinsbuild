package com.example.jenkinbuild;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Show {

@RequestMapping("/")
@ResponseBody

    public String gethtml(){
        return "hello";
    }



}
