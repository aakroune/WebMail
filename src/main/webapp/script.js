

/**
 * Created by badre on 24/11/2016.
 */
var xhr = new XMLHttpRequest();

var callback = function() {

    if(xhr.readyState == 4) {
        console.log('reponse : '+xhr.responseText);

        var user = JSON.parse(xhr.responseText);

        console.log(user.lastName);
        document.getElementById("lastname").innerHTML = avenger.lastName;
        document.getElementById("firstname").innerHTML = avenger.firstName;
        document.getElementById("power").innerHTML = avenger.power;
        document.getElementById("alias").innerHTML = avenger.alias;

    }

}

//var getAvenger = function() {
//    var id = document.getElementById('idAvenger').value;
//    var url = 'http://localhost:8080/avengers/app/rest/avengers/'+id;
//    xhr.open('get', url, true);
//    xhr.send();
//    xhr.onreadystatechange = callback;
//}
//
//var callbackSave = function() {
//    if(xhr.readyState == 4) {
//        alert('avenger sauvegardé');
//    }
//}
var saveAvenger = function() {
    var avenger ={
                    alias:document.getElementById("aliasInput").value,
                    power:document.getElementById("powerInput").value,
                    firstName:document.getElementById("firstNameInput").value,
                    lastName:document.getElementById("lastNameInput").value

                };

    var str = JSON.stringify(avenger);

    var url = 'http://localhost:8080/avengers/app/rest/avengers/';
    xhr.open('post', url, true);
    xhr.setRequestHeader("Content-Type", "application/json;charset=UTF-8");
    xhr.send(str);
    xhr.onreadystatechange = callbackSave;

}

window.onload = function() {
    document.getElementById('loadAvenger').onclick = getAvenger;
    document.getElementById('saveAvenger').onclick = saveAvenger;
}
