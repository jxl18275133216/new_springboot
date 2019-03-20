function checkoutRegist() {
    var username = document.getElementById("username").value;
    var userpwd = document.getElementById("userpwd").value;
    var level = document.getElementById("level").value;
    console.log(username+":"+userpwd+":"+level);
    var checkResutl;
    //检查
    checkResutl = findUserByName(username);
    /*暂未开发*/
    if(checkResutl){
        document.getElementById("regist-form").submit();
    }else{
        alert("用户名重复");
    }
}
function findUserByName(username) {
    console.log("findUserByName")
    /*var ajax = {
        get:function (url) {
            //XMLHttpRequest对象用于在后台与服务器交换数据
            var xhr = new XMLHttpRequest();
            xhr.open("GET",url,true);
            xhr.onreadystatechange = function () {
                //readyState = 4 表示数据交互成功
                if (xhr.readyState == 4 && xhr.status == 200 || xhr.status ==304) {
                    //处理获得的数据
                }
            }
        },
        POST:function (url) {

        }
    }*/
    //创建XMLHttpRequest对象
    //XMLHttpRequest对象用于在后台与服务器交换数据
    var ajax = new XMLHttpRequest();
    //
    ajax.open('GET',"/processCheckRegist?"+username,true);
    //发送请求
    ajax.send();
    //注册事件 onreadystatechange 状态改变就会调用
    ajax.onreadystatechange = function (ev) {
        if (ajax.readyState == 4 && ajax.status ==200){
            if (ajax.responseText != null){
                alert('用户名已被使用！')
                return false;
            }else{
                return true;
            }
        }
    }
}