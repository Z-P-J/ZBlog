package com.zpj.blog.mapper;

import com.zpj.blog.entity.ArticleInfo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author Z-P-J
 */
@Mapper
public interface HomeMapper {

    /**
     * 根据文章id查询文章信息
     * @param id 文章id
     * @return 文章信息
     */
    ArticleInfo getInfoById(int id);

    /**
     * 获取文章信息
     * @return 文章信息
     */
    List<ArticleInfo> listArticle();

    /**
     * 获取文章标签
     * @param id 文章id
     * @return 文章标签
     */
    List<String> getTags(int id);

}
