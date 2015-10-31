/**
 * Created by hhildebrand on 8/24/15.
 */
var seuratApp = angular.module('seuratApp', [ 'ngRoute', 'myApp' ]);

seuratApp.config([ '$routeProvider', function($routeProvider) {
    $routeProvider.when('/customer', {
        templateUrl : 'partials/CustomerMasterDetail.html',
        controller : 'CustomerMasterDetailCtrl'
    }).otherwise({
        redirectTo : '/customer'
    });
} ]);