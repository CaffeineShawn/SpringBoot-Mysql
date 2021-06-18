<template>
  <div id='app'>
    <AllBooks></AllBooks>
  </div>

</template>

<script>

  import AllBooks from "@/components/AllBooks";
  export default {
    name: 'App',
    components: {AllBooks}




  }


</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
