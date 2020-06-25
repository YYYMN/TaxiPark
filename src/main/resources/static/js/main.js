var userApi = Vue.resource('/user');

Vue.component('user-form', {
    props: ['users'],
    data: function () {
        return {
            text: ''
        }
    },
    template: '<div>' +
        '<input type="text" placeholder="Write here smth"/>' +
        '<input type="button" value="Save" v-on:click="save"/></div>',
    methods: {
        save: function () {
            var user = {text: this.text};

            userApi.save({}, user).then(result =>
                result.json().then(data => {
                    this.users.push(data);
                    this.text = ''
                })
            )
        }
    }

});

Vue.component('user-row', {
    props: ['user'],
    template: '<div><i>({{ user.id }})</i> {{ user.name }}</div>'
});

Vue.component('users-list', {
    props: ['users'],
    template: '<div>' +
        '<user-form :users= "users"/>' +
        '<user-row v-for="user in users" :key="user.id" :user="user" />' +
        '</div>',
    created: function () {
        userApi.get().then(result =>
            result.json().then(data =>
                data.forEach(user => this.users.push(user))
            )
        )
    }
});

var app = new Vue({
    el: '#app',
    template: '<users-list :users="users" />',
    data: {
        users: []
    }
});

