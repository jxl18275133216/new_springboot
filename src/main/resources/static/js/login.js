$(document).ready(function(){
    checkRadioStatus();

});
//检查当前被选中的radio
function checkRadioStatus(){
    var radio = $('input:radio:checked').val();
    var loginForm = $('#loginForm');
    var registerForm = $('#registerForm');
    if(radio == 'true'){//值是个字符串，不是boolean，淦
        registerForm.addClass("hidden")
        loginForm.removeClass("hidden");
    }else{
        registerForm.removeClass("hidden");
        loginForm.addClass("hidden")
    }

}
//radio点击事件
$(':radio').click(function(){
    checkRadioStatus();
})
//登录验证
$('#btn-login').click(function (e) {
    //button在form表单里面的时候会自动提交数据，需要阻止
    e.preventDefault();
    var username = $('#login-username').val();
    var password = $('#login-password').val();
    var data = {"username":username,"userpwd":password};
    console.log(data);
    //验证username及password，二期添加
    $.post('/user/findUser.do',data,function (result) {
        console.log(result)
        if(result.status == 1){
            location.href = '/';
        }else{
            console.log(result.message)
            alert('登录失败');
        }
    })
})
//注册
$('#btn-register').click(function (e) {
    e.preventDefault();
    var username = $('#reg-username').val();
    var userpwd = $('#reg-password').val();
    var data = {"username":username,"userpwd":userpwd}
    console.log(data)
    $.post('/user/addUser.do',data,function (result) {
        if(result.status == 1){
            location.href = "/";
        }else{
            console.log(result.message);
        }
    })
})
//退出登录
$('#btn-logout').click(function () {
    $.post('/clearSession.do',function () {
        console.log(1111)
        location.href = "/";
    })
})
//城市联动

//修改 or 添加 userInfo
$('#btn-addInfo').click(function (e) {
    e.preventDefault();
    var id = $('#userID').val();
    alert(id);
})




















function checkLogin() {
    var username = document.getElementById('login-username').value;
    var userpwd = document.getElementById('login-userpwd').value;
    var form = document.getElementById('login-form');
    alert(username+":"+userpwd+":"+form);
    //校验逻辑
    if(true){
        form.submit();
    }
}


function checkoutRegist() {
    var username = document.getElementsByName("username")[0].value;
    var userpwd = document.getElementsByName("userpwd")[0].value;
    console.log(username+":"+userpwd);
    var checkResutl;
    /*
    对输入的参数进行检查，检查通过才提交
     */
    document.getElementById("regist-form").submit();
    /*//检查
    findUserByName(username);
    console.log("checkResutl:"+checkResutl)
    /!*暂未开发*!/
    if(checkResutl){
        document.getElementById("regist-form").submit();
    }else{
        alert("用户名重复");
    }*/
}
function findUserByName(username) {

    checkResutl = "";
}
//ajax异步请求会导致数据还没返回，前面就已经执行了，所以需要再研究
function findUserByName_ajax(username) {
    console.log("into function findUserByName");
    //创建XMLHttpRequest对象
    //XMLHttpRequest对象用于在后台与服务器交换数据
    var ajax = new XMLHttpRequest();
    var theresult;
    //如果使用异步请求，那边会先返回
    ajax.open('POST',"/user/processCheckRegist.do",false);
    //post请求一定要添加请求头才行不然会报错
    ajax.setRequestHeader("Content-type","application/x-www-form-urlencoded");
    var data = "username="+username;
    //发送请求
    ajax.send(data);
    //注册事件 onreadystatechange 状态改变就会调用
    ajax.onreadystatechange = function () {
        if (ajax.readyState == 4 && ajax.status ==200){
            checkResutl =  ajax.response;
            console.log("checkResult:"+checkResutl);
        }else{
            console.log("ajax.status:"+ajax.status);
        }
    }
}
;

function logoutUser(){

}