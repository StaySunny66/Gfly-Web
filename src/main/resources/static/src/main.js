import { createApp } from 'vue'
import ElementPlus from 'element-plus'
import 'element-plus/dist/index.css'
import './assets/main.css'
import router from './router.js';

import NProgress from 'nprogress';
import 'nprogress/nprogress.css';

import App from './App.vue'

const app = createApp(App)




router.beforeEach((to, from, next) => {
    // 在路由切换前，显示进度条
    NProgress.start();
    next();
});

router.afterEach(() => {
    // 在路由切换完成后，隐藏进度条
    NProgress.done();
});





app.use(ElementPlus)
app.use(router);

app.mount('#app')