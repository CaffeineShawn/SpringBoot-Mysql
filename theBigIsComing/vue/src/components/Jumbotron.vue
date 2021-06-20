<template>

  <div class="container-fluid">

    <div class="jumbotron" style="padding-top: 50px;">

        <div class="row">
          <div id="Welcome" class="col">
            <h1 >Powered by Bootstrap</h1>
            <p>Used SpringBoot, Vue, JPA, MySQL for my Course Design.</p>
            <h3>@Caffeine Shawn</h3>
            <div id="more" style="padding-top: 10px">
              <p><a class="btn btn-outline-secondary" href="https://github.com/CaffeineShawn" role="button">Learn more</a></p>
            </div>

          </div>

          <div id="userinfo" class="col col-md-auto" style="margin-right: 100px">

            <user-panel>

            </user-panel>

          </div>
      </div>


    </div>
  </div>
</template>

<script>

import UserPanel from "@/components/UserPanel";

export default {
  name: "Jumbotron",
  components: {
    UserPanel
  }
}
</script>

<style scoped>

</style>