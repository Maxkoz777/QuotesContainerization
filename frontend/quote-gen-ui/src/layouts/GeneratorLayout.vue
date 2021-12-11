<template>
  <div class="generator-container">
    <div class="quote-container">
      <quote-result/>
    </div>
    <div class="meme-container">
      <meme-result/>
    </div>
  </div>
</template>

<script>
import QuoteResult from "@/components/QuoteResult";
import MemeResult from "@/components/MemeResult";

export default {
  name: "GeneratorLayout",
  components: {MemeResult, QuoteResult}
}
</script>

<style scoped>
.generator-container {
  display: grid;
  grid-template-columns: 50% 50%;
}

.quote-container {
  background: no-repeat url("../assets/images/480e8645-fc3f-48dc-b17a-e81038d3ee97.jpg");
  background-size: 100% 100%;
}

.meme-container {
  background: url("../assets/images/unnamed.jpg");
  background-size: 100% 100%;
}
</style>