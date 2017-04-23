

    angular.module("homeApp", ['ngRoute'])
        .config(function ($routeProvider, $locationProvider) {
            $routeProvider
                .when('/home', {
                    templateUrl: 'home.jsp',
                    controller: 'homeCtrl',
                    controllerAs: 'home'
                })
                .when('/bodyfat', {
                    templateUrl: '/home/bodyfat.jsp',
                    controller: 'bodyFatCtrl',
                    controllerAs: 'bodyFat'
                })
                .when('/bodyfat/:param', {
	                 templateUrl: '/home/enterData.jsp',
	                 controller: 'enterDataCtrl',
	                 controllerAs: 'enterData'
                 })
                .otherwise({
                    redirectTo: '/home'
                });
        }).controller("homeCtrl", [function () {
        }])
        .controller("bodyFatCtrl", ['$scope', '$location','utilityService', function ($scope, $location, utilityService) {
            utilityService.getBodyFatUsers()
            	.then(function(response){
            		$scope.usersList = response.data;
            	}, function (error) {
            		$scope.status = error;
            	});
            
            $scope.goToEndData = function(id) {
            	console.log("id " + id);
            	$location.path("/bodyfat/" + id);
            }
        }])
        .controller("enterDataCtrl", ['$scope', 'utilityService', '$routeParams', function ($scope, utilityService, $routeParams){
        	var param = $routeParams.param;
        	utilityService.getUserStats(param)
        		.then(function(response){
        			$scope.user = response.data;
        		}, function(error){
        			$scope.status = error;
        		});
        	$scope.submitAndViewProgress = function() {
        		$scope.req = {"currentWeight": $scope.currentWeight, "currentBodyFat":$scope.currentBodyFat};
        		utilityService.updateUser($scope.req)
        		.then(function(response){
        			
        		}, function(error){
        			
        		});
        	}
        }])
        .factory('utilityService', ['$http', function ($http) {
            var service = {};

            service.getBodyFatUsers = function () {
            	return $http.get(bodyfat_users_service_getAllUsers_uri);
            }
            
            service.getUserStats = function(userID) {
            	return $http({
            	    url: bodyfat_users_service_getUserStats_uri, 
            	    method: "GET",
            	    params: {'User_ID': userID}
            	 });
            }
            service.updateUser = function(req) {
            	return $http.post(bodyfat_users_service_updateUser_uri, req);
            }
            
            return service;
        }]);
