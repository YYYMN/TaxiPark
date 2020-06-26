const userApi = Vue.resource('/user');


Vue.component('user-row', {
    props: ['user'],
    template: '<div><i>id - {{ user.id }}</i> name - {{ user.name }}</div>'
});

Vue.component('users-list', {
    props: ['users'],
    template: '<div><user-row v-for="user in users" :key="user.id" :user="user" /></div>',
    created: function () {
        userApi.get().then(result =>
            result.json().then(data =>
                data.forEach(user => this.users.push(user))
            )
        )
    }
});

new Vue({
    el: '#user',
    template: '<users-list :users="users" />',
    data: {
        users: []
    }
});


const driverApi = Vue.resource('/driver');

Vue.component('driver-row', {
    props:["driver"],
    template:  '<div><i>({{ driver.id }})</i> {{ driver.name }}</div>'
});

Vue.component('drivers-list', {
    props: ['drivers'],
    template: '<div><driver-row v-for="driver in drivers" :key="driver.id" :driver="driver" /></div>',
    created: function () {
        driverApi.get().then(result =>
            result.json().then(data =>
                data.forEach(driver => this.drivers.push(driver))
            )
        )
    }
});

new Vue({
    el: '#driver',
    template: '<drivers-list :drivers="drivers" />',
    data: {
        drivers: []
    }
});

