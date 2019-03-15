function getAllByClass(e) {
    return document.getElementsByClassName("e");
}
function getOneByClass(e1,e2) {
    var a = document.getElementsByClassName("e1")[e2];
    return a;
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
function hideAll() {
    var ul = document.getElementsByClassName("nav-ul");
    ul[0].addEventListener("mouseout",function (ev) {
       for (var i = 0,arr = getAllByClass("sub-nav");i<arr.length;i++){
           arr[i].className = "sub-nav hidden";
       }
    });
}
function sibling(elm) {
    var a = [];
    var p = elm.parentNode.children;
    for(var i = 0, pl = p.length; i < pl; i++) {
        if(p[i] !== elm) a.push(p[i]);
    }
    return a;
}
showSubNav();
hideAll();