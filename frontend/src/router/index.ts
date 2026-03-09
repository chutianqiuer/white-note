import { createRouter, createWebHistory } from 'vue-router'
import Login from '../views/Login.vue' // 确保路径正确

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/login',
      name: 'login',
      component: Login
    },
    {
      path: '/',
      redirect: '/login' // 默认访问根路径时跳转到登录
    }
  ],
})

export default router
