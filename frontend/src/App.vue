<script setup lang="ts"></script>
import { RouterView } from 'vue-router'

<template>
  <header>
    <nav v-if="$route.path !== '/login'">
      <RouterLink to="/index">首页</RouterLink>
    </nav>
  </header>

  <RouterView /> 
</template>

<style scoped></style>
