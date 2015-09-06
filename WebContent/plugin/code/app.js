var ringApp=angular.module('ringApp', []);


ringApp.factory('sessionInjector',['SessionService',function(SessionService){
	var sessionInjector = {
        request: function(config) {
            if (!SessionService.isAnonymus) {
                config.headers['x-session-token'] = SessionService.token;
            }
            return config;
        }
    };
    return sessionInjector;
}]);

ringApp.config(['$httpProvider',function($httpProvider){
	$httpProvider.interceptors.push('sessionInjector');
}]);
