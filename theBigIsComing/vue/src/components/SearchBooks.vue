<template>
  <div align="center" class="container-fluid">
    <form class="form-control col">
  <input v-model="titleLike" v-on:input="titleLike=$event.target.value" class="input-group-text" id="titleLike" type="text" placeholder="请输入要搜索的图书名">
  <button @click="search"  class="btn btn-outline-secondary">搜索</button>
    </form>

    <div >
      <table class=" table row-md-8">
        <thead>
        <tr>
          <th scope="col">ID</th>
          <th scope="col">Author</th>
          <th scope="col">Title</th>
          <th scope="col">Quantity</th>

        </tr>
        </thead>

        <tbody>

        <tr v-for="book in books" :key="book.id" >
          <th scope="row">{{  book.id  }}</th>
          <td >{{  book.author  }}</td>
          <td >{{  book.title  }}</td>
          <td >{{  book.quantity }}</td>

        </tr>
        </tbody>




      </table>
      <!--    <a @click="queryAuth">kkp</a>-->
    </div>
    <div class="row-md-4">
      <router-view></router-view>

    </div>
  </div>

</template>

<script>
import {getRequest} from "@/api/RESTfulAPI";

export default {
  name: "searchForBook",
  data() {
      return {
        titleLike:'',
        books: {

        }
      }

  },
  methods: {
    getBooks() {
      let _this = this;
      this.getRequest('/books')
          .then(function (response) {
            _this.books= response.data;
            console.log(_this.books)
          })
    },
    search() {
      let _this = this
      getRequest('/books/titles/' + _this.titleLike)
          .then(res => {
            _this.books = res.data
            console.log(res.data)
          }).catch(err => {
        console.log(err);
      });
    }
  },
  created() {
    this.getBooks()
  }

}
</script>

<style scoped>

</style>