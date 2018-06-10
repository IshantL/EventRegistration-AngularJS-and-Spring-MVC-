var app = angular.module("EventApp",['ngRoute','angularUtils.directives.dirPagination']);

app.config(function($routeProvider){

	$routeProvider.when (
	'/', {
			templateUrl : "partialPages/home.html",
			controller : ""
			}		
	)
	.when('/registerUser',{
		templateUrl : "partialPages/Registration.html",
		controller : "EventCtrl"
			
	})
	.when('/adminLogin',{
		templateUrl : "partialPages/AdminLogin.html",
		controller : "EventCtrl"
			
	})
	.otherwise({redirectTo : '/'});
});

app.directive("fileread", [
                           function() {
                             return {
                               scope: {
                                 fileread: "="
                               },
                               link: function(scope, element, attributes) {
                                 element.bind("change", function(changeEvent) {
                                   var reader = new FileReader();
                                   reader.onload = function(loadEvent) {
                                     scope.$apply(function() {
                                       scope.fileread = loadEvent.target.result;
                                     });
                                   }
                                   reader.readAsDataURL(changeEvent.target.files[0]);
                                 });
                               }
                             }
                           }
                         ]);