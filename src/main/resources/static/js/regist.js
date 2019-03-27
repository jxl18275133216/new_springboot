function checkoutRegist() {
    var username = document.getElementsByName("username")[0].value;
    var userpwd = document.getElementsByName("userpwd")[0].value;
    var level = document.getElementsByName("level")[0].value;
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
    console.log("findUserByName");
    //创建XMLHttpRequest对象
    //XMLHttpRequest对象用于在后台与服务器交换数据
    var ajax = new XMLHttpRequest();
    //
    ajax.open('GET',"/processCheckRegist.do?username="+username,true);
    //发送请求
    ajax.send();
    //注册事件 onreadystatechange 状态改变就会调用
    ajax.onreadystatechange = function (ev) {
        if (ajax.readyState == 4 && ajax.status ==200){
            console.log(ajax.response)
            if (ajax.response){
                alert('用户名已被使用！')
                return false;
            }else{
                return true;
            }
        }
    }
}