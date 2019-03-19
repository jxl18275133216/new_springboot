window.onload = function aboutNav() {
    useNav();
}
function useNav(){
	var navUl =document.getElementsByClassName("nav-ul")[0];
    navUl.addEventListener("mouseover",showSubNav);
    navUl.addEventListener("mouseout",function (evt) {
        var a = document.getElementsByClassName("sub-nav");
        for (var i = 0;i<a.length;i++){
            a[i].className = "sub-nav hidden";
        }
    })
}
function showSubNav() {
    var nav = document.getElementsByClassName("nav-li");
    for (var i = 0;i<nav.length;i++){
        nav[i].addEventListener("mouseover",function (ev) {
            var bros = sibling(this);
            for (var j = 0;j<bros.length;j++){
                if (bros[j].children[1] != null) {
                    bros[j].children[1].className = "sub-nav hidden"
                }
            }
            if (this.children[1] != null)this.children[1].className = "sub-nav"
        });
    }
}

function sibling(elm) {
    var a = [];
    var p = elm.parentNode.children;
    for(var i = 0, pl = p.length; i < pl; i++) {
        if(p[i] !== elm) a.push(p[i]);
    }
    return a;
}

