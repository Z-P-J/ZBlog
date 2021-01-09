<template>
  <div style="overflow:auto;overflow-x: hidden !important;">
    <Header></Header>
    <el-container class="main-container">
      <About></About>
      <el-main style="padding: 0 20px;">
        <div class="blog-list">
          <ul class="list-article">
            <li
              class="article el-card"
              v-for="article in articleList"
              :key="article.id"
            >
              <div class="article-header">
                <h2 class="article-title">
                  <!-- <router-link to="{path:'/contents',query:{id:article.id}}" class="title-link">{{article.title}}</router-link> -->
                  <span class="title-link" @click="tocontent(article)">{{
                    article.title
                  }}</span>
                  <el-tag
                    size="mini"
                    hit
                    v-for="tag in article.tags"
                    :key="tag"
                    style="margin-right: 10px"
                    >{{ tag }}</el-tag
                  >
                </h2>
                <p class="article-body">
                  {{ article.summary | cutString(180) }}
                </p>
              </div>
              <div class="article-footer">
                <span class="iconfont icon-riqi icons">
                  <span class="content">{{
                    article.post_time | formatDate("yyyy-MM-dd")
                  }}</span>
                </span>
                <span class="iconfont icon-chakantiezihuifu icons">
                  <span class="content">{{ article.comment_count }}评论</span>
                </span>
                <span class="iconfont icon-yanjing icons">
                  <span class="content">{{ article.view }}阅读量</span>
                </span>
              </div>
            </li>
          </ul>
        </div>
        <el-pagination
          small
          @size-change="handleSizeChange"
          @current-change="handleCurrentChange"
          layout="prev, pager, next"
          :total="count"
          :page-size="5"
          style="text-align: center; margin: 15px auto"
        ></el-pagination>
      </el-main>
    </el-container>
    <el-footer><Footer></Footer></el-footer>
  </div>
</template>

<script>
import Header from "./header";
import Footer from "./footer";
import About from "./about";
export default {
  data() {
    return {
      articleList: [
        {
          id: 0,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 1,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 2,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 3,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 4,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 5,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 6,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 7,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 8,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
        {
          id: 9,
          title: "TitleTitleTitleTitleTitle",
          tags: ["Tag1", "Tag2"],
          summary:
            "summarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummarysummary",
          post_time: "post_time",
          comment_count: 100,
          view: 1000,
        },
      ],
      flag: 0,
      pageNum: 1,
      pageSize: 5,
      count: 0,
    };
  },
  components: { Header, Footer, About },
  methods: {},
};
</script>

<style>

.main-container {
  margin: 100px 10%;
}

.icons {
  font-size: 14px;
  color: #909399;
  margin-right: 10px;
}
.content {
  margin-left: 3px;
}

/* .blog-list {
  width: 60%;
} */

.blog-list ul {
  list-style: none;
}
.title-link {
  vertical-align: middle;
  cursor: pointer;
}
.title-link:hover {
  color: #409eff;
}

.article {
  margin: 0 0 15px;

  background-color: #fff;
  box-shadow: 0 1px 2px rgba(0, 0, 0, 0.1);
  border-radius: 0;
}
.article-header {
  padding: 10px 20px 0;
  /* border-bottom: 1px solid #f2f6fc; */
}
.article-footer {
  padding: 8px 20px;
  border-top: 1px solid #f3f3f3;
  line-height: 27px;
  overflow: hidden;
  font-size: 12px;
}

.blog-list .article .article-title {
  font-size: 20px;
  font-weight: 400;
}
.blog-list .article .article-body {
  margin: 10px 0;
  color: #666;
  word-break: break-all;
  /* overflow: hidden;
  text-overflow: ellipsis;
  display: -webkit-box;
  -webkit-line-clamp: 2;
  -webkit-box-orient: vertical; */
}
</style>
