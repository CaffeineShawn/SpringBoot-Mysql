<template>
  <div class="row" style="margin: auto">
  <table class="table-bordered"  >
    <thead>
    <tr>
      <th >ID</th>
      <th >Author</th>
      <th >Title</th>
      <th >Operation</th>
    </tr>
    </thead>

    <tbody>

      <tr v-for="book in books" :key="book.id">
        <th >{{  book.id  }}</th>
        <th >{{  book.author  }}</th>
        <th >{{  book.title  }}</th>
        <th >
          <div class="col justify-content-center">
          <button class="btn btn-outline-dark"  type="submit" id="borrow" >borrow</button>
          <button class="btn btn-outline-light" type="submit" id="back">back</button>
          </div>
        </th>
      </tr>

    </tbody>
  </table>
  </div>
</template>

<script>


export default {
  name:'AllBooks',
  data() {
    return {
      books: null
    }
  },

  created() {
    let _this = this;
    this.getRequest('')
        .then(function (response){
          _this.books = response.data;
          console.log(_this.books)
        })
  }

}
</script>

<style scoped>

</style>