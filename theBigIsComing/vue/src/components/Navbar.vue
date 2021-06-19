<template>
  <nav class="navbar navbar-expand-lg navbar-light bg-light">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <a class="navbar-brand"  style="margin-right: 40px;padding-left: 20px">图书管理系统</a>
      </div>
      <div class="collapse navbar-collapse" id="navbarNavDropdown">
        <ul class="navbar-nav">
          <li class="nav-item">
            <a class="nav-link active" aria-current="page" href="#/login">Home</a>
          </li>

          <li class="nav-item">
            <a class="nav-link" href="#/books">Books</a>
          </li>
        </ul>
      </div>


      <form class="d-flex" style="padding-right: 10px">
        <input v-model="url" class="form-control me-2" type="search" placeholder="Search" aria-label="Search">
        <button class="btn btn-outline-success" type="submit">Search</button>
      </form>

    </div><!-- /.container-fluid -->


  </nav>
</template>

<script>
export default {
  name: "Navibar",
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