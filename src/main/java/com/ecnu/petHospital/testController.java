package com.ecnu.petHospital;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping("/index")
    public String index(){
        return "能不能行了AAA ";
    }
}
