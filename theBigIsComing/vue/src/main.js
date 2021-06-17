import Vue from 'vue'
import App from './App.vue'
import axios from "axios";
import {getRequest} from "./api/RESTfulAPI"
import {putRequest} from "./api/RESTfulAPI"
import {postRequest} from "./api/RESTfulAPI"
import {deleteRequest} from "./api/RESTfulAPI"
Vue.prototype.getRequest = getRequest;
Vue.prototype.deleteRequest = deleteRequest;
Vue.prototype.putRequest = putRequest;
Vue.prototype.postRequest = postRequest;

Vue.config.productionTip = false
Vue.prototype.$axios = axios
axios.defaults.baseURL = 'http://localhost:8081/'
new Vue({
  render: h => h(App)
}).$mount('#app')
