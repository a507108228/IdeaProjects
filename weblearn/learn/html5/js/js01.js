/**
 * @author: a5071
 * @date: 2021/6/1 15:51
 * @description:
 */



/*
var a = 12;
var b = "12";
//t
alert(a == b);
//f
alert(a === b);
//undefine
alert(typeof(i));
//假  0 , undefine , null , 空串都为假
var a = 0;
if (a){
    alert("零为真")
} else {
    alert("假")
}
*/

//&&运算 当表达式全真 返回最后一个表达式的值；
//       有一个为假返回第一个为假的值

/*
var a = 11;
var b = true;
var c = null;
var d = false;

alert(a && b);//    都是真b
alert(b && c);//    一真一假 返回c
alert(c && d);//    都是假 返回c

alert(a || b);//    11
alert(b || c);//    t
alert(c || d);//    f

alert(!a);
alert(!b);
alert(!c);//    取反还是false
alert(!d);
*/

/*
//    数组
var arr = [];
arr[0] = 1;
arr[1] = 2;
arr[2] = 3;
alert(arr[0]);
alert(arr.length);
// alert(arr.fill(12))
alert(arr.length)
for (var i = 0; i < arr.length; i++) {
    alert(arr[i]);
}

function f() {
    alert("wucanhanshu")
}
f();

function f1(a,b) {
    alert("youcanhanshu")
}
f1(11,"12")
*/

function onblurFun(){
    console.log("静态注册失去焦点事件")
}

window.onload = function () {
    var ps = document.getElementById('pas');
    ps.onblur = function () {
        console.log("失去焦点事件")
    }
    
}
