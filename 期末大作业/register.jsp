<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>register</title>
     <link rel="shortcut icon" href="picture/bitbug_favicon.ico" />
    <style>
         *{
            margin: 0;
            padding: 0;
        }
        html{
            height: 100%;
            width: 100%;
            /*防止溢出，修剪溢出的内容*/
            overflow: hidden;
            margin: 0;
            padding: 0%;
            
            background: url(picture/background_img8.jpg) no-repeat 0px 0px;
            background-repeat: no-repeat;
            background-size: 100% 100%;
            -moz-background-size:100% 100%;
        }
        /*设置元素为垂直居中对齐，并且body可弹性收缩*/
        body{
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;
        }
        #register{
            width: 37%;
            height: 650px;
            background-color: rgba(75, 81, 95, 0.3);
            box-shadow: 7px 7px 17px rgba(52, 56, 66, 0.5);
            border-radius: 5px;
            display: flex;
            justify-content: center;
            align-items: center;
           
        }
        h1{
            text-align: center;
            margin-bottom: 20px;
            margin-top: 20px;
            color: #f0edf3;
        }
        #name_item,#password_itme, #surePassword_item,#introduce_item{
            margin-left: 3px;
            color: red;
        }
        
        .sexDiv{
            width: 100%;
            height: auto;
            display: flex;
            align-items: center;  
            margin-left: 51px;
            font-size: 15px;
        }
        p,.sexDiv{
            margin-top: 10px;
            
            color: azure;
        }
        .sexDiv>input,#hobby>input{
            width: 30px;
            height: 17px;
        }
        input{
            margin-left: 15px;
            border-radius: 5px;
            height: 20px;
            width: 140px;
            background-color: rgba(216, 191, 216, 0.5);
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }
        #button>input{
            border-color: cornsilk;
            background-color:rgba(100, 149, 237, .7) ;
            color: aliceblue;
            border-style: hidden;
            border-radius: 5px;
            width: 135px;
            height: 31px;
            font-size: 10px;
        }
        .introduce{
            margin-left: 130px;
        }

        .introduce>textarea{
            background-color: rgba(216, 191, 216, 0.5);
            border-style: hidden;
            outline: none;
            border-radius: 5px;
            color: #f0edf3;

        }
        p{
            margin-left: 50px;
           
            font-size: 15px;
            font-weight: initial;
        }
        .button2{
            margin-left: 50px;
            text-align: center;
        }
    </style>
   
</head>
<body>
   <div id="register">
   <!-- register.jsp中注册时返回的相关信息 -->
   <!--  ${msg} -->
       <form action="RegisterServelet">
            <h1>注册</h1>
            <!--将光标自动定位到框内，如果框内是空的，提示这是必填内容-->
            <p>用户昵称 ：
                <input type="text" id="userName" name = "username" required autofocus onblur="checkUserName()">
                <label  id="name_item"></label>
            </p>
            <p>
                密&emsp;&emsp;码 ：
                <input type="password" name = "passwd" id="password" required >
                <label  id="password_itme"></label>
            </p>
            <p>
                确认密码 ：
                <input type="password" id="repass" required>
                <label id="surePassword_item"></label>
            </p>

            <p>
                年&emsp;&emsp;龄 ：
                <input type="text" name="age" id="age">
                <label id="type_item"></label>
            </p>

            <div class="sexDiv">
                性&emsp;&emsp;别 ：
                <input type="radio" class="userSex" name="sex" value="boy">男
                <input type="radio" class="userSex" name="sex" value="girl" checked>女
                <label  id="sex_item"></label>    
            </div>

            <p>
                出生日期 ：
                <input type="date" id="birthday" name = "birthday">
                <label  id="birthday_item"></label>
            </p>

            <p id="hobby" name = "hobby">
                兴趣爱好 ：
                <input type="checkbox" name="hobby" value="read">阅读
                <input type="checkbox" name="hobby" value="sport">运动
                <input type="checkbox" name="hobby" value="music">音乐
                <input type="checkbox"" name="hobby" value="cook">下厨
                <label id="hobby_item"></label>
            </p>

            <p>
                电子邮件 ：
                <input type="email" id="email" name = "email" required>
                <label id="email_item"></label>
            </p>

            <p>
                自我介绍：
            </p>
            <div class="introduce">
                <!--可以输入多行文本来介绍自己-->
                <textarea name="introduce" id="introduceText" cols="30" rows="10" onblur="checkInf()"></textarea>
                <label id="introduce_item"></label>
            </div>

            <p id="button">
                <!--鼠标离开提交按钮时，js检查提交内容-->
                <input type="submit"  class="button1" onclick="return checkForm()" value="提交">
                <input type="reset" class="button2" value="重置">  
                
            </p>
        </form>
   </div>
     <script src="register.js"></script>
</body>
</html>