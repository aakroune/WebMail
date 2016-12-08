console.log('start ng script');

var myApp = angular.module("myApp", []);


myApp.controller("myCtrl", function($scope, $http) {
init($scope, $http);
console.log ("bonjour");
	$scope.addUser = function(user) {
		$scope.user = user;
		saveUser($scope, $http);
	};
	
	$scope.addMail = function(mail) {
		$scope.mail = mail;
		saveMail($scope, $http);
	};
	$scope.showMail = function(mail){
		displayMail($scope, $http);
	};
})
//	$scope.avenger = {};
//	
//	$scope.remove = function(id) {
//		deleteAvenger(id, $http, $scope);
//	}


//	$scope.show = function(id) {
//		getAvenger(id, $scope, $http);
//	}

	//	$scope.order = function(prop) {
//		$scope.sortType = prop;
//		console.log(prop);
//	}



//myApp.config(function($routeProvider) {
//	 console.log($routeProvider) ;
//	$routeProvider
//       .when('/listeAvenger',  {
//        templateUrl:'partials/listeAvenger.html'
//    })
//    .when('/ajouterUser',  {
//        templateUrl:'partials/ajouterUser.html'
//    })
//    .when('/listeAgent',  {
//        templateUrl:'partials/listeAgent.html'
//    });


//} );

// myApp.controller("myCtrl2", function($scope, $http) {
// getAvenger(194, $scope, $http);
//
// });
//myApp.filter('myFormat', function() {
//	return function(x) {
//		var i, c, txt = "";
//
//		for (i = 0; i < x.length; i++) {
//			txt += i % 2 == 0 ? x[i].toUpperCase() : x[i]
//			// c =x[i];
//			// if (i % 2 == 0){
//			// c =c.toUpperCase();
//			// }
//			// txt += c
//		}
//		;
//		return txt
	
//});
