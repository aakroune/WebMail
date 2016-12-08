myApp.controller("inboxCtrl", function($scope, $http) {
	console.log("inboxCtrl");
});

myApp.controller("sentCtrl", function($scope, $http) {
	console.log("sentCtrl");
	loadSent($scope,$http,10);
});