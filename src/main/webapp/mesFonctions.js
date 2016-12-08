
var init = function(Monscope, Monhttp) {
    console.log('init()');

    var url = 'http://localhost:8080/WebMail/app/rest/user/';
    Monhttp.get(url).then(function(resp) {
        Monscope.users = resp.data;
       Monscope.user = {};
    });

}


var saveUser = function(Monscope, Monhttp) {
	
    var url = 'http://localhost:8080/WebMail/app/rest/user/add';
    
    Monhttp.post(url,Monscope.user).then(function() {
    	console.log('test');
       init(Monscope,Monhttp)
    });
}

var saveMail = function(Monscope, Monhttp) {
	
    var url = 'http://localhost:8080/WebMail/app/rest/user/sendmail'+10;
    
    Monhttp.post(url,Monscope.mail).then(function() {
    	console.log('test');
       init(Monscope,Monhttp)
    });
}
var displayMail = function(Monscope, Monhttp) {
	var url = 'http://localhost:8080/WebMail/app/rest/user/mails';
	Monhttp.get(url).then(function(resp2) {
	    Monscope.mails = resp2.data;
	    Monscope.mail = {};
	});
}




