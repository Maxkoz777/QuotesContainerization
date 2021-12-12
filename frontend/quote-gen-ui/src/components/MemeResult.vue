<template>
  <div class="result-container">
    <div class="search" @click="generateJoke">
      <span style="cursor: pointer; background-color: #D83F87; padding: 2%">
      Generate joke!
      </span>
    </div>
    <div style="padding: 5%">
      <transition name="slide-fade">
        <div v-if="joke" class="result-text">
          {{ joke }}
        </div>
      </transition>
    </div>
  </div>
</template>

<script>
import {HTTP} from "@/http-common";

export default {
  name: "MemeResult",
  data() {
    return {
      joke: null
    }
  },
  methods: {
    async generateJoke() {
      this.joke=null
      let res = await HTTP.get(`joke`)
      this.joke = res.data.text
    }
  }
}
</script>

<style lang="scss" scoped>
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

.result-text {
  opacity: 0.9;
  color: whitesmoke;
  font-size: 1.1em;
  padding: 2%;
  background-color: #A4B3B6;
}

span .e :hover {
  color: #2A1B3D;
}

.slide-fade-enter-active {
  transition: all .3s ease;
}
.slide-fade-leave-active {
  transition: all .8s cubic-bezier(1.0, 0.5, 0.8, 1.0);
}
.slide-fade-enter, .slide-fade-leave-to
  /* .slide-fade-leave-active до версии 2.1.8 */ {
  transform: translateX(10px);
  opacity: 0;
}
</style>