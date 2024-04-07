<template >

    <div class="common-layout">
      <el-container style="height: 100%">
        <el-header style="background: #E76F51">
          <dHeader></dHeader>

        </el-header>
        <el-container style="height: 100%">
          <el-aside style="width: 200px;">
              <el-menu
                  active-text-color="#003366"
                  background-color="#F4A261"
                  class="el-menu-vertical-demo"
                  default-active="1"
                  text-color="#003366"
                  router = "true"
                  @select = "handleSelect"
                  style="height: 100%"
              >

                <el-menu-item index="/">
                  <el-icon><icon-menu /></el-icon>
                  <span>总览</span>
                </el-menu-item>
                <el-sub-menu index="2">
                  <template #title>
                    <el-icon><location /></el-icon>
                    <span>飞行搜救</span>
                  </template>
                  <el-menu-item index="/FindView">人员搜救</el-menu-item>
                  <el-menu-item index="2-2">环境评估</el-menu-item>
                  <el-menu-item index="2-3">等等等待</el-menu-item>
                </el-sub-menu>

                <el-sub-menu index="3">
                  <template #title>
                    <el-icon><location /></el-icon>
                    <span>开发和传感器</span>
                  </template>
                  <el-menu-item index="/developSenior">传感器开发</el-menu-item>
                  <el-menu-item index="/SeniorTable">传感器管理</el-menu-item>
                  <el-menu-item index="3-3">等等等待</el-menu-item>
                </el-sub-menu>

                <el-menu-item index="4" >
                  <el-icon><document /></el-icon>
                  <span>飞行数据(黑匣子)</span>
                </el-menu-item>
                <el-menu-item index="5">
                  <el-icon><setting /></el-icon>
                  <span>自由飞行</span>
                </el-menu-item>
              </el-menu>


          </el-aside>
          <el-container>
            <el-main class="main_con" >


              <router-view></router-view>


              <el-footer>
                <div style="height: 100% ;width: 100% ;text-align: center"><p>河北科技师范学院 物联网工程 2024 高旭阳 本科毕业设计</p>  </div>

              </el-footer>


            </el-main>

          </el-container>
        </el-container>
      </el-container>
    </div>


</template>

<script lang="ts" setup>
import dHeader from './components/Header.vue'
import { ref } from 'vue'
import {
  Document,
  Menu as IconMenu,
  Location,
  Setting,
} from '@element-plus/icons-vue'
import Header from "@/components/Header.vue";


const handleSelect = (index: string, indexPath: string ,routeResult: string) => {
  console.log(index, index,routeResult)
}



</script>

<style scoped>

body {
  margin: 0;
  padding: 0;
}



.main_con{
  background: antiquewhite;
  width: 100%;
  height: 100%;
  padding: 0;

}
.common-layout{

  height:  100vh;;

}
</style>
