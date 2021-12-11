<template>
  <div class="header-container">
    <div class="app-title">
      <div style="color: aliceblue">Quote and meme  <span style="font-family: Corinthia,sans-serif; font-size: 2.0em; color: #E98074">generator</span></div>
    </div>
    <div style="color: aliceblue">
      Generate random quote and meme!
    </div>
  </div>
</template>

<script>
export default {
  name: "AppHeader"
}
</script>

<style scoped>
@import url('https://fonts.googleapis.com/css2?family=Corinthia:wght@700&family=Lato:wght@300&display=swap');
.header-container {
  display: flex;
  flex-direction: row;
  align-items: center;
  justify-content: space-between;
  padding: 2%;
  background-color: #2A1B3D;
  font-weight:500;
}

.app-title {
  font-size:1.8em;
}
</style>