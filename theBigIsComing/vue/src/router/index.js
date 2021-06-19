import Vue from 'vue';
import VueRouter from "vue-router";

import Jumbotron from "@/components/Jumbotron";
import AllBooks from "@/components/AllBooks";
Vue.use(VueRouter)

export default
new VueRouter({
    routes: [

        {
            path: '/',
            redirect: '/login'
        },
        {
            path: '/login',
            name:'home',
            component: Jumbotron
        },
        {
            path:'/books',
            name:'AllBooks',
            component: AllBooks
        },
        {
            path: '/login/success',
            name:'successLogin',
            component: AllBooks
        }

    ]
})