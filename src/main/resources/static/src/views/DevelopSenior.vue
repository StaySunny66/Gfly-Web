<script setup>
import CodeView from "@/components/CodeView.vue";
import { Delete, Edit, Download, Share, Upload } from '@element-plus/icons-vue'

const options = [
  {
    value: 'Option1',
    label: 'Option1',
  },
  {
    value: 'Option2',
    label: 'Option2',
  },
  {
    value: 'Option3',
    label: 'Option3',
  },
  {
    value: 'Option4',
    label: 'Option4',
  },
  {
    value: 'Option5',
    label: 'Option5',
  },
]



</script>

<template>

  <el-row>
    <el-col :span="5">

      <div class="m-4" style="margin: 10px">
        <p>传感器</p>
        <el-select
            v-model="value1"
            multiple
            placeholder="Select"
            style="width: 240px"
        >
          <el-option
              v-for="item in options"
              :key="item.value"
              :label="item.label"
              :value="item.value"
          />
        </el-select>
      </div>



    </el-col>
    <el-col :span="19">
      <div class="flex" style="margin-left: 15px;margin-top: 5px">
        <el-button type="primary" >
          保存本地<el-icon class="el-icon--right"><Edit /></el-icon>
        </el-button>
        <el-button type="primary" >
          重置代码<el-icon class="el-icon--right"><Delete /></el-icon>
        </el-button>
        <el-button type="primary" >
          重新读取<el-icon class="el-icon--right"><Download /></el-icon>
        </el-button>
        <el-button type="primary">
          上传代码<el-icon class="el-icon--right"><Upload /></el-icon>
        </el-button>
      </div>
      <code-view style="height: 600px ;margin: 10px"/>


    </el-col>
  </el-row>







</template>

<style scoped>

</style>