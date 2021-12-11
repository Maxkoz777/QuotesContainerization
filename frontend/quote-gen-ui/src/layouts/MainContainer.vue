<template>
  <div class="main-container">
    <app-header/>
    <generator-layout/>
    <app-footer/>
  </div>
</template>

<script>

import AppHeader from "@/layouts/AppHeader";
import AppFooter from "@/layouts/AppFooter";
import GeneratorLayout from "@/layouts/GeneratorLayout";

export default {
  name: "MainContainer",
  components: {GeneratorLayout, AppFooter, AppHeader}
}
</script>

<style scoped>
.main-container {
  height: 100vh;
  background-color: aliceblue;
  display: grid;
  grid-template-rows: 15% 75% 10%;
}
</style>