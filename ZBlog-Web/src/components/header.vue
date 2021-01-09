<template>
  <header class="el-header header-wraper">
    <div class="blog-header">
      <h1 class="header-title">
        <router-link to="/">Z-P-J's Blog</router-link>
      </h1>
      <nav class="header-nav">
        <el-input
          placeholder="请输入搜索内容"
          prefix-icon="el-icon-search"
          v-model="search"
          class="nav-search"
          autocomplete="off"
          name="aa"
        ></el-input>
        <ul>
          <li>
            <router-link to="/lables">标签</router-link>
          </li>
          <li>
            <router-link to="/login">新随笔</router-link>
          </li>
          <li>
            <router-link to="/about">关于</router-link>
          </li>
        </ul>
      </nav>
    </div>
  </header>
</template>
<script>
export default {
  name: "Header",
  data() {
    return {
      search: ""
    };
  }
};
</script>
<style scoped>
.header-wraper {
  position: fixed;
  top: 0;
  display: flex;
  width: 100%;
  /* height: 80px; */
  padding: 10px;
  line-height: 50px;
  border-bottom: 1px solid #eee;
  z-index: 999;
  background-color: #fff;
}
.blog-header {
  display: flex;
  width: 100%;
  margin: 0 15%;
  justify-content: space-between;
  padding: 0 15px;
}
.header-title {
  font-size: 30px;
  font-weight: 700;
}
.header-nav {
  display: -webkit-box;
  margin-right: 5rem;
}
.blog-header .header-nav ul {
  list-style: none;
}
.blog-header .header-nav li {
  display: inline-block;
}
.blog-header .header-nav li a {
  padding: 0 15px;
}
</style>
