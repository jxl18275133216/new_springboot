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