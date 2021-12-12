<template>
  <div id="app">
    <main-container/>
  </div>
</template>

<script>

import MainContainer from "@/layouts/MainContainer";

export default {
  name: 'App',
  components: {
    MainContainer

  }
}
</script>

<style>
@import url('https://fonts.googleapis.com/css2?family=Lato:wght@300&display=swap');
#app {
  font-family: Lato, sans-serif;
}
body{
  padding: 0;
  margin:0;
}
</style>
