package com.stu.knl.comn;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ComnController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

}
