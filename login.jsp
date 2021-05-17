<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>login</title>
     <link rel="shortcut icon" href="picture/bitbug_favicon1.ico" />
    <style>
        *{
            margin: 0;
            padding: 0;
        }
        html{
            height: 100%;
            width: 100%;
            margin: 0;
            padding: 0;

            background: url(picture/background_img.jpg) no-repeat 0px 0px;
            background-repeat: no-repeat;/*图片保留自身大小不平铺*/

            /*图片大小设置与浏览器宽高一致，随浏览器大小缩减图片大小*/
            background-size: 100% 100%;
            -moz-background-size:100% 100%;
        }
        body{
            /*设置为弹性盒子,使diV相对于浏览器居中对齐*/
            display: flex;
            /*元素垂直对齐*/
            align-items: center;

            /*元素相对于d容器横向对齐*/
            justify-content: center;
            
            height: 100%;
        }

       /*登录框样式*/
        #login {
            width: 37%;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 400px;
            background-color: rgba(75, 81, 95, 0.3);
            box-shadow: 7px 7px 17px rgba(52, 56, 66, 0.5);
            border-radius: 5px;
           
        }

        #name_item {
            margin-left: 50px;
            color: red;
        }

        p{
            margin-top: 30px;
            margin-left: 20px;
            color:azure;
        }
        input{
            margin-left: 15px;
            border-radius: 5px;
            border-style: hidden;
            height: 30px;
            width: 140px;
            background-color: rgba(216, 191, 216, 0.5);
            /*不设置文本轮廓性*/
            outline: none;
            color: #f0edf3;
            padding-left: 10px;
        }
        
        .button{
            border-color: cornsilk;
            background-color: rgba(89, 142, 241, 0.7);
            border-style: hidden;
            border-radius: 5px;
            height: 31px;
            width: 100px;
            font-size: 15px;
        }
        #register{
            width: 100%;
            height: 20px;
            display: flex;
            justify-content: center;
            align-items: center;
        }
        a{
            text-decoration:none; 
            color: #f0edf3;
        }
       
    </style>
</head>
<body>
    <div id="login">
    <!-- <label style = "color:red">${msg}</label> -->
    
        <form action="LoginServlet" id="form">
            <h2 style="text-align: center;color:aliceblue;font-family: "微软雅黑";">Login up</h2>

            <!--输入用户名 密码 文本款-->
            <p>
                UserName : 
                <input id = "userName" type="text" name = "username">
                <label  id="name_time"></label>
            </p>
            <p>
                Password :&emsp13; 
                <input type="password" id="password" name = "passwd">
                <label id="password_item"></label>
            </p>

            <!--登录重置按钮-->
            <div style="text-align: center;margin-top: 30px;">
                <input type="submit" class="button" value="login up">
                <input type="reset" class="button 1" value="reset">
            </div>
            <div id="register">
                <p>
                    <a href="register.jsp">注册</a>
                </p>
            </div>
        </form>
    </div>
</body>
</html>