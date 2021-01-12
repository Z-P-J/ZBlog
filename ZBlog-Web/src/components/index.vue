<template>
  <div style="overflow: auto; overflow-x: hidden !important">
    <Header></Header>
    <el-container class="main-container">
      <About></About>
      <el-main style="padding: 0 20px">
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
                    article.postTime | formatDate("yyyy-MM-dd")
                  }}</span>
                </span>
                <span class="iconfont icon-chakantiezihuifu icons">
                  <span class="content">{{ article.commentCount }}评论</span>
                </span>
                <span class="iconfont icon-yanjing icons">
                  <span class="content">{{ article.viewCount }}阅读量</span>
                </span>
              </div>
            </li>
          </ul>
        </div>
        <el-pagination
          background
          layout="prev, pager, next"
          :total="totalCount"
          :page-size="pageSize"
          :current-page.sync="currentPage"
          @current-change="get"
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
      articleList: [],
      flag: 0,
      pageNum: 1,
      pageSize: 5,
      totalCount: 0,
      currentPage: 0,
    };
  },
  components: { Header, Footer, About },
  methods: {
    get(page) {
      console.log("page=" + page);
      this.$ajax("http://localhost:8080/list_article?page=" + page)
      .then((res) => {
      //   {
      //   total: 14,
      //   pageNum: 1,
      //   pageSize: 5,
      //   size: 3,
      //   startRow: 1,
      //   endRow: 3,
      //   pages: 3,
      //   prePage: 0,
      //   nextPage: 2,
      //   isFirstPage: true,
      //   isLastPage: false,
      //   hasPreviousPage: false,
      //   hasNextPage: true,
      //   navigatePages: 8,
      //   navigatepageNums: [1, 2, 3],
      //   navigateFirstPage: 1,
      //   navigateLastPage: 3,
      // }

        this.articleList = res.data.list;
        this.pageNum = res.data.pageNum;
        // this.currentPage = res.data.pageNum;
        this.pageSize = res.data.pageSize;
        this.totalCount = res.data.total;
        console.log(JSON.stringify(res.data));
      })
      .catch(function (error) {
        console.log(error);
      });
    }
  },
  created() {
    this.get(1);
  },
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
