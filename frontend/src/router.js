
import Vue from 'vue'
import Router from 'vue-router'

Vue.use(Router);


import ProductManager from "./components/listers/ProductCards"
import ProductDetail from "./components/listers/ProductDetail"
import MaterialManager from "./components/listers/MaterialCards"
import MaterialDetail from "./components/listers/MaterialDetail"
import ProcessManager from "./components/listers/ProcessCards"
import ProcessDetail from "./components/listers/ProcessDetail"


export default new Router({
    // mode: 'history',
    base: process.env.BASE_URL,
    routes: [
            {
                path: '/products',
                name: 'ProductManager',
                component: ProductManager
            },
            {
                path: '/products/:id',
                name: 'ProductDetail',
                component: ProductDetail
            },
            {
                path: '/materials',
                name: 'MaterialManager',
                component: MaterialManager
            },
            {
                path: '/materials/:id',
                name: 'MaterialDetail',
                component: MaterialDetail
            },
            {
                path: '/processes',
                name: 'ProcessManager',
                component: ProcessManager
            },
            {
                path: '/processes/:id',
                name: 'ProcessDetail',
                component: ProcessDetail
            },



    ]
})
