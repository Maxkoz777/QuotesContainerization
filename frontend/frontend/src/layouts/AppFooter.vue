<template>
  <div class="footer-container">
    <div>
      <span style="font-weight: 600;">Powered by</span>: Maxim Kozhinov, Regina Khamatova, Grigorii Kostarev, Evgeny
      Afanasyev
    </div>
    <div>
        Innopolis University
    </div>
  </div>
</template>

<script>
export default {
  name: "AppFooter"
}
</script>

<style scoped>
.footer-container {
  display: flex;
  flex-direction: row;
  justify-content: space-between;
  background-color: #44318D;
  color: #A4B3B6;
  padding: 2%;
  font-size: 0.9em;
}
</style>