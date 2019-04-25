function checkLogin() {
    var username = document.getElementById('login-name').value;
    var userpwd = document.getElementById('login-pwd').value;
    var form = document.getElementById('login-form');
    alert(username+":"+userpwd+":"+form);
    //校验逻辑
    if(true){
        form.submit();
    }
}