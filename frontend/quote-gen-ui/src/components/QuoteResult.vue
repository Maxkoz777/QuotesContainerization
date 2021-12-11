<template>
  <div class="result-container">
    <div class="search">
      <span style="cursor: pointer; background-color: #D83F87; padding: 2%">
      Generate quote!
      </span>
    </div>
    <div>
      result
    </div>
  </div>
</template>

<script>
export default {
  name: "QuoteResult"
}
</script>

<style scoped>
.result-container {
  height: 100%;
  width: 100%;
  display: grid;
  grid-template-rows: 30% 70%;
}

.search {
  color: white;
  font-weight: 500;
  font-size: 1.3em;
  display: flex;
  flex-direction: row;
  justify-content: center;
  align-items: center;
}
</style>