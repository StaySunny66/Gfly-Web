// router/index.js
import { createRouter, createWebHistory } from 'vue-router';
import Home from './views/Home.vue';
import About from './views/Next.vue';
import Dashboard from "./views/dashboard.vue";
import DevelopSenior from "@/views/DevelopSenior.vue";
import SeniorTable from "@/views/SeniorTable.vue";
import FindView from "@/views/FindView.vue";
const routes = [
    { path: '/', component: Dashboard },
    { path: '/about', component: About },
    { path: '/developSenior', component: DevelopSenior},
    { path: '/SeniorTable', component: SeniorTable},
    { path: '/FindView', component: FindView},
];

const router = createRouter({
    history: createWebHistory(),
    routes,
});

export default router;
