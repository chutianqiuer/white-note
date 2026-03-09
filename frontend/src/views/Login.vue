<script setup>
import { reactive } from 'vue'
import { useRouter } from 'vue-router'
import axios from 'axios'

const router = useRouter()
const loginForm = reactive({ username: '', password: '' })

const login = async () => {
  try {
    const res = await axios.post('/api/login', {
      username: loginForm.username,
      password: loginForm.password
    })
    if (res.data.code === 200) {
      router.replace('/index')
    } else {
      alert('登录失败：' + res.data.message)
    }
  } catch (error) {
    console.error('请求失败', error)
  }
}
</script>

<template>
  <div class="login-container">
    <h2>钢板缺陷检测系统 - 登录</h2>
    <input v-model="loginForm.username" type="text" placeholder="用户名" />
    <input v-model="loginForm.password" type="password" placeholder="密码" />
    <button @click="login">登录</button>
  </div>
</template>