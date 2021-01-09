<template>
  <el-aside width="30%">
    <div class="about">
      <img class="background" src="../assets/background.png" alt="" />
      <img class="avatar" src="../assets/avatar.png" alt="" />
      <p class="name">Z-P-J</p>
      <p class="desc">Write the code, Change the World</p>
      <ul class="social">
        <li>
          <a href="https://github.com/Z-P-J" target="_blank"
            ><img src="../assets/GitHub.png" alt=""
          /></a>
        </li>
      </ul>
      <div class="line"></div>
      <h4>技能值</h4>
      <div class="progresses">
        <el-row :gutter="20">
          <el-col :span="6">
            <p class="title">Java</p>
          </el-col>
          <el-col :span="18">
            <el-progress
              :text-inside="true"
              :stroke-width="24"
              :percentage="60"
            ></el-progress>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="6">
            <p class="title">Android</p>
          </el-col>
          <el-col :span="18">
            <el-progress
              :text-inside="true"
              :stroke-width="24"
              :percentage="40"
              status="warning"
            ></el-progress>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="6">
            <p class="title">Python</p>
          </el-col>
          <el-col :span="18">
            <el-progress
              :text-inside="true"
              :stroke-width="24"
              :percentage="30"
              status="success"
            ></el-progress>
          </el-col>
        </el-row>
        <el-row :gutter="20">
          <el-col :span="6">
            <p class="title">Vue</p>
          </el-col>
          <el-col :span="18">
            <el-progress
              :text-inside="true"
              :stroke-width="24"
              :percentage="20"
              status="exception"
            ></el-progress>
          </el-col>
        </el-row>
      </div>
    </div>
  </el-aside>
</template>

<script>
export default {};
</script>

<style>
.about {
  position: relative;
  text-align: center;
  border: 1px solid #EBEEF5;
  padding-bottom: 20px;
  margin-left: 20%;
}

.about .background {
  position: absolute;
  top: 0;
  left: 0;
  right: 0;
  width: 100%;
  height: 150px;
  z-index: 1;
}

.about .avatar {
  position: relative;
  margin: 100px auto 15px;
  width: 100px;
  height: 100px;
  border: 5px solid #e8e8e8;
  border-radius: 50%;
  z-index: 9;
}

.about .name {
  font-size: 22px;
  color: #333;
  line-height: 30px;
  font-weight: 700;
}

.about .desc {
  font-size: 15px;
  color: #878d99;
  line-height: 30px;
  font-weight: 100;
}

.about .line {
  height: 1px;
  background-color: #e8e8e8;
  margin: 10px 20px;
}

.about h4 {
  font-size: 19px;
  /* margin: 30px 0 20px; */
  font-weight: 600;
}

.about .progresses {
  padding: 0 20px;
}

.about .progresses p.title {
  height: 36px;
  line-height: 36px;
  text-align: right;
}

.about .progresses .el-progress {
  margin: 6px 0;
}

.social {
  text-align: center;
  padding: 0 20px;
  margin-top: 15px;
}

.social > li {
  padding: 8px;
}

.social > li a {
  display: block;
  width: 44px;
  height: 44px;
  margin: auto;
}

.social > li a img {
  width: 100%;
}
</style>
