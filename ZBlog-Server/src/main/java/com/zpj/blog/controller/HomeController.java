package com.zpj.blog.controller;

import com.github.pagehelper.PageInfo;
import com.zpj.blog.entity.ArticleInfo;
import com.zpj.blog.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Z-P-J
 * @RestController 注解相当于@ResponseBody ＋ @Controller合在一起的作用。
 */
// @RestController
@Controller
@ResponseBody
public class HomeController {

    /**
     * @Resource的作用相当于@Autowired，只不过@Autowired按byType自动注入，而@Resource默认按byName自动注入罢了。
     */
    @Resource
//    @Autowired
    private HomeService homeService;

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

    @GetMapping(value = "list_article")
    public PageInfo<ArticleInfo> getArticleList(@RequestParam(name = "page") int page) {
        System.out.println("getArticleList page=" + page);
        return homeService.getArticleInfoList(page);
    }

    @GetMapping(value = "get_article/{id}")
    public ArticleInfo getArticleInfoById(@PathVariable int id) {
        return homeService.getInfoById(id);
    }

}
