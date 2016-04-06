var routeTestModule = angular.module('routeTest', ['ngRoute']);

routeTestModule.controller('MainCtrl', function () {

});

//routeTestModule.config(function($routeProvider, $httpProvider, $provide)
routeTestModule.config(function($routeProvider) {

    console.log("route test config");

    $routeProvider.when('/route', {
        templateUrl : '/view/angularjs/route/routeTestHome.html',
        controller : 'routeMngCtrl',
        controllerAs : 'routeMng'
    })
    .when('/route/dashboard', {
        templateUrl : '/view/angularjs/route/dashboard.html'
        //controller : 'dashboardCtrl',
        //controllerAs : 'dashboard'
    })
    .when('/route/storyboard', {
        templateUrl : '/view/angularjs/route/storyboard.html',
        controller : 'storyboardCtrl',
        controllerAs : 'storyboard'
    })
    .when('/route/otherSite', {
        templateUrl : 'http://www.naver.com'
    })
    .otherwise({redirectTo: '/'});
});