console.log('start ng script');

var myApp = angular.module("myApp", ["ngRoute"]);



myApp.config(function($routeProvider) {
	$routeProvider
       .when('/inbox',  {
        templateUrl:'partials/inbox.html'
        	})
    .when('/ajouterUser',  {
        templateUrl:'partials/ajouterUser.html'
    })
    .when('/sent',  {
        templateUrl:'partials/sent.html'
    });

} );