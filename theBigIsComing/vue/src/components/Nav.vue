<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <a class="navbar-brand" href="#" style="padding-left: 40px;">图书管理系统</a>
      </div>


      <form class="d-flex" style="padding-right: 10px">
        <input v-model="title" v-on:input="title=$event.target.value" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">{{ title }}</button>
      </form>

    </div><!-- /.container-fluid -->
  </nav>
</template>

<script>
export default {
  name: "Navigator",
  data() {
    return {
      Title: null,
      url: null
    }
  },
  computed() {
    this.url = '/title' + this.Title;
  },
  methods() {
    this.getRequest(this.url)
        .then(function (response){
        console.log(response);
      })
  }
}
</script>

<style scoped>

</style>