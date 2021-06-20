import Vue from 'vue'
import Vuex from 'vuex'

Vue.use(Vuex)

const state = {
    isLoggedIn: false,
    currentUser: '',
}


export default new Vuex.Store({
    state
})