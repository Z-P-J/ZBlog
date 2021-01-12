package com.zpj.blog.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zpj.blog.entity.ArticleInfo;
import com.zpj.blog.mapper.HomeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class HomeService {

    @Resource
    HomeMapper homeMapper;

    public ArticleInfo getInfoById(int id) {
        return homeMapper.getInfoById(id);
    }

    public PageInfo<ArticleInfo> getArticleInfoList(int page) {
//        List<ArticleInfo> list = new ArrayList<>();
//        for (int i = 0; i < 10; i++) {
//            list.add(new ArticleInfo(i));
//        }
//        return list;
        PageHelper.startPage(page, 5);
       return new PageInfo<>(homeMapper.listArticle());
    }

}
