package com.zpj.blog.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

public class ArticleInfo {

    private int id;
    private String title;
    private List<String> tags;
//    private List<ArticleTag> tags;
    private String summary;
    private Date postTime;
    private int commentCount = 100;
    private int viewCount = 1000;

//    public ArticleInfo(int id) {
//        this.id = id;
////        tags.add("tag1");
////        tags.add("tag2");
//        postTime = new Date();
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//    public List<ArticleTag> getTags() {
//        return tags;
//    }
//
//    public void setTags(List<ArticleTag> tags) {
//        this.tags = tags;
//    }

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }


    public Date getPostTime() {
        return postTime;
    }

    public void setPostTime(Date postTime) {
        this.postTime = postTime;
    }

    public int getCommentCount() {
        return commentCount;
    }

    public void setCommentCount(int commentCount) {
        this.commentCount = commentCount;
    }

    public int getViewCount() {
        return viewCount;
    }

    public void setViewCount(int viewCount) {
        this.viewCount = viewCount;
    }
}
