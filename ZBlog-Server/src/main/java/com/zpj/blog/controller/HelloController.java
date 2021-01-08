package com.zpj.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Z-P-J
 * @RestController 注解相当于@ResponseBody ＋ @Controller合在一起的作用。
 */
// @RestController
@Controller
@ResponseBody
public class HelloController {

    @RequestMapping("/index")
    public String sayHello() {
        return "index";
    }

    @GetMapping(value = "list")
    public List<String> list() {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(String.valueOf(i));
        }
        return list;
    }

    @GetMapping(value = "title")
    public String getTitle() {
        return "My Blog (This msg is from server)";
    }

}
