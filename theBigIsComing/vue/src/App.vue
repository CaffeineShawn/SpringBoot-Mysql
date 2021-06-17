<template>
  <div id="app">
    <img alt="Vue logo" src="./assets/logo.png">
<!--    <HelloWorld msg="Welcome to Your Vue.js App"/>-->
  </div>
</template>

<script>
  import {getRequest} from "@/api/RESTfulAPI";
  import axios from "axios";
  export default {
  name: 'App',
  mounted() {
    // getRequest('')
    axios.get('http://localhost:8081/api/books')
        .then(function (response) {
          console.log(response);
        }).catch(function (err){
      console.log(err);
    });
    getRequest('')
        .then(function (response) {
          console.log('getRQ');
        }).catch(function (err){
      console.log(err);
    });


  }


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
