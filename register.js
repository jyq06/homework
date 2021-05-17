function checkForm(){
    //定义变量flag,用于返回值（当返回位true时才能提交）


    //调用
   checkUserName();
   checkInf();

    //密码长度必须至少6位，并且和确认的一致
    var password = document.getElementById("password").value;
    //获取确认密码并与第一次输入密码进行判断
    var surePassword = document.getElementById("repass").value;
    var passMsg = document.getElementById("surePassword_item");
    var pw = document.getElementById("password_itme");
    if(password.length!=0){
        if( password != surePassword || password==" " || surePassword==" "){
            //密码不一致，或者密码为空 弹出提示符
            passMsg.innerHTML = ("两次密码不一致!")
            return false;
        }else{
            //密码一致，无提示
            passMsg.innerHTML = ("");
        }
    }
    else{
        pw.innerHTML = ("密码不能为0");
        return false;
    }
   

    return true;
}
//检查两次密码是否一致
function checkUserName(){
    //获取用户输入密码的值
    var username = document.getElementById("userName").value;
    //密码长度
    var userlen = username.length
    //获取name_item标签元素的值
    var nameMsg = document.getElementById("name_item")
    //判断密码长度是否在6-18之间
    if (userlen<6 || userlen>18){
        //密码不在6-18位之间给出提示
        nameMsg.innerHTML = ("用户名必须大于6位或者小于18位");
        //不符合条件，页面不进行跳转，无法提交
        return false;
    }else{
        //密码符合长度无提示
        nameMsg.innerHTML = ("");
    }
}

//检查自我介绍长度
function checkInf(){
    var information = document.getElementById("introduceText").value;
    var inflen = information.length;
    var intro = document.getElementById("introduce_item");
    if(inflen >200){
        intro.innerHTML = ("最多可以打200个字！");
        return false;
    }
    else{
        intro.innerHTML = ("");
    }
}