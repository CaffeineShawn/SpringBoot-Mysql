<template>
  <div v-if="notLoggedIn">
  <form class="form-floating">
    <div class="input-group row">
      <div class="">
      <label for="username" class="form-label">Username:{{username}}</label>
      <input v-model="username" v-on:input="username=$event.target.value" type="text" class="form-control" placeholder="username" id="username"  aria-label="Username" aria-describedby="basic-addon1">
    </div>
    <div class="">
      <label for="password" style="margin-top: 5px" class="form-label">Password:{{password}}</label>
      <input v-model="password" v-on:input="password=$event.target.value" type="password-field"  class="form-control" id="password"  placeholder="请输入密码">
    </div>
    </div>

    <div id="button-group" class="col" style="margin-top: 30px">
      <button class="btn btn-outline-primary float-left" type="submit"  style="margin-right: 40px"   @click="login" id="login"  >Login</button>
      <button class="btn btn-outline-secondary"  type="submit" style="margin-left: 40px" @click="register" id="register" >Register</button>
    </div>
  </form>
  </div>
</template>

<script>

import {postRequest} from "@/api/RESTfulAPI";

export default {
  name: "UserPanel",
  data() {
    return {
      username:'',
      password:'',
      registerURL: '/user/register',
      loginURL: '/user/login',
      notLoggedIn: true
    }

  },
  methods: {
    register(){
      let _this = this;
      console.log("reg")
      postRequest(_this.registerURL, {
        username: _this.username,
        password: _this.password
      }).then(function (response){

        alert("注册成功")
        console.log(response)
      }).catch(function (err) {
        alert("注册失败，该用户名已注册")
        console.log(err)
      })

    },
    login(){
      console.log("log")
      let _this = this;
      postRequest(_this.loginURL, {
        username: _this.username,
        password: _this.password
      })
      .then(function (response){
        _this.notLoggedIn = false;
        alert("登录成功")
        console.log(response)
      }).catch(function (err) {
        alert("登录失败，请检查用户名和密码")
        console.log(err)
      })

    }

  }
}
</script>
