window.onload = function () {
    var theinput = document.getElementById("login-pwd");
    console.log(theinput)
    var userid = theinput.getAttribute("value");
    if (userid == ""){
        console.log(userid)
    } else{
        console.log(11111111)
    }

    findById(userid);
}
function findById(userid) {
    console.log(userid);
}