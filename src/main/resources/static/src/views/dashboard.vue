<script setup>

import MapContainer from "@/components/MapContainer.vue";

const customColors = [
  { color: '#f56c6c', percentage: 20 },
  { color: '#e6a23c', percentage: 40 },
  { color: '#5cb87a', percentage: 60 },
  { color: '#1989fa', percentage: 80 },
  { color: '#6f7ad3', percentage: 100 },
]

</script>

<template style="padding: 20px">

  <div class="d_content">
    <h1>总览界面</h1>

    <el-row>
      <el-col :span="12">

        <el-card class="box-card">
          <template #header>
            <div class="card-header">
              <span style="color: #f2f2f2">我的飞行器</span>
            </div>
          </template>
          <div>
            <el-row>
              <el-col :span="12" style="text-align:center">
                <el-progress type="circle" :percentage="10"  :color="customColors "/>
              </el-col>
              <el-col :span="12" style="color: #f2f2f2">
                <p>飞机温度: 16°C</p>
                <p>飞机海拔: 820m</p>
                <p>位置: 河北省张家口市</p>

              </el-col>
            </el-row>
            <el-row>
              <el-col :span="12" style="text-align:center"> <p style="color: #f2f2f2">电池电量</p></el-col>
              <el-col :span="12"></el-col>
            </el-row>
          </div>
        </el-card>

        <el-card class="box-card" style="  margin-top: 10px;">
          <template #header>
                <div class="card-header">
                  <span style="color: #f2f2f2">天气状况</span>
                </div>
              </template>
              <div >
                <p style="font-size: 20px;color: #f2f2f2">秦皇岛市 海港区</p>
                <p style="font-size: 16px;color: #f2f2f2">-6 °C 晴朗</p>
                <p style="font-size: 16px;color: #f2f2f2">西北风 3级</p>


              </div>
            </el-card>






      </el-col>
      <el-col :span="12">

        <MapContainer/>







      </el-col>
    </el-row>





  </div>




</template>

<style scoped>
.d_content{

  margin: 10px;




}
.card-header {
  font-size: 15px;
  height: 15px;
}

.box-card {
  padding: 5px;
  background: #F4A261;
  width: 450px;

}



</style>