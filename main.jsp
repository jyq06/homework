<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Journal</title>
<link rel="shortcut icon" href="picture/bitbug_favicon 2.ico" />
  <style>
        *{
            margin: 0;
            padding: 0;
        }
        html{
            height: 100%;
            width: 100%;
            /*防止溢出，修剪溢出的内容*/
            overflow:hidden;
            margin: 0;
            padding: 0%;
            
            background: url(picture/background_img7.jpg) no-repeat 0px 0px;
            background-repeat: no-repeat;
            background-size: 100% 100%;
            -moz-background-size:100% 100%;
        }
        body{
            display: flex;
            align-items: center;
            justify-content: center;
            height: 100%;
            color: #ebe9ec;
        }
        #total{
            height: 95%;
            width: 95%;
            background-color: rgba(75, 81, 95, 0.3);
            box-shadow: 7px 7px 17px  rgba(52, 56, 66, 0.5);
            border-radius: 5px;  
        }
        
        #left{
            width:20%;
            height: 100%;
            border:1px solid  rgba(216, 191, 216, 0.5);
            margin-left: 5px;
            margin-right: 2px;
            float: left;
            
        }
        #right{
            
            border:2px solid  rgba(216, 191, 216, 0.5);
            display: inline-block;
            width: 79%;
            height: 100%;
            
        }
        .userHead{
            width: 100%;
            height: 130px;
            line-height: 140px;
            vertical-align: middle;
            border:1px solid  rgba(216, 191, 216, 0.5);
            
        }
        .userHead img{
             margin: 15px 0px 0px 50px;
        }
       
        #information{
            margin-top: 5px;
            width: 100%;
            height: auto;
            background-color: rgba(110, 111, 114, 0.3);
            box-shadow: 7px 7px 17px  rgba(50, 52, 56, 0.5);
            border:1px solid  rgba(216, 191, 216, 0.5);
            border-radius: 5px;
        }

        #jounal{
            margin-top: 5px;
            height: auto;
            width: 100%;
            border-radius: 5px;
            border: 1px solid rgba(216, 191, 216, 0.5);
            background-color: rgba(110, 111, 114, 0.3);
            box-shadow: 7px 7px 17px  rgba(50, 52, 56, 0.5);
        }
        #note{
            margin-top: 5px;
            height: auto;
            width: 100%;
            border-radius: 5px;
            border: 1px solid rgba(216, 191, 216, 0.5);
            background-color: rgba(110, 111, 114, 0.3);
            box-shadow: 7px 7px 17px  rgba(50, 52, 56, 0.5);
        }
        #task{
            margin-top: 5px;
            height: auto;
            width: 100%;
            border-radius: 5px;
            border: 1px solid rgba(216, 191, 216, 0.5);
            background-color: rgba(110, 111, 114, 0.3);
            box-shadow: 7px 7px 17px  rgba(50, 52, 56, 0.5);
        }
        #function{
            margin-top: 5px;
            height: auto;
            width: 100%;
            border-radius: 5px;
            border: 1px solid rgba(216, 191, 216, 0.5);
            background-color: rgba(110, 111, 114, 0.3);
            box-shadow: 7px 7px 17px  rgba(50, 52, 56, 0.5);
        }
        h1{
            text-align: center;
            margin: 250px 0px 100px 0px;
            font-family: Arial, Helvetica, sans-serif;
            
        }
        #right p{
            text-align: center;
            font-size: 150%;
            font-weight: 5px;
        }
    </style>

</head>
<body>

<div id="total">
        <div id="left">
            <div class="userHead">
                <img src="picture/userimg.jpg" alt=""> &emsp;&emsp;${user.username}
            </div>

            <div id="information">
                <p style="margin: 8px 0px 8px 20px;">个人信息: &emsp;</p>
                <p style="margin: 0px 0px 8px 40px;">年&emsp;&emsp;龄: &emsp;${user.age }</p>
                <p style="margin: 8px 0px 8px 40px;">性&emsp;&emsp;别: &emsp;</p>
                <p style="margin: 8px 0px 8px 40px;">出生日期: &emsp;${user.brithday}</p>
                <p style="margin: 8px 0px 8px 40px;">兴趣爱好: &emsp;${user.hobby}</p>
                <p style="margin: 8px 0px 8px 40px;">电子邮箱: &emsp;${user.emial}</p>
                <p style="margin: 8px 0px 8px 40px;">自我介绍：&emsp;${user.introduce }</p>
            </div>
           
            <div id="jounal">
                <p style="margin: 8px 0px 8px 20px;">日志</p>
                <p style="margin: 0px 0px 8px 40px;">日志1</p>
            </div> 
            <div id="note">
                <p style="margin: 8px 0px 8px 20px;">笔记</p>
                <p style="margin: 0px 0px 8px 40px;">笔记1</p>
            </div>  
            <div id="task">
                <p style="margin: 8px 0px 8px 20px;">任务</p>
                <p style="margin: 0px 0px 8px 40px;">任务1</p>
            </div>
            <div id="function">
                <p style="margin: 8px 0px 8px 20px;">功能</p>
                <p style="margin: 0px 0px 8px 40px;">新建功能</p>
            </div>
        </div>
        <div id="right">
            <h1 style="font-size: 200%;">欢迎使用记录本</h1>
            <p>您可以添加喜欢的功能! 这里默认为您添加了日志、任务、笔记等功能</p>
          	<p style="margin-top:100px">祝您使用愉快!</p> 
        </div>
    </div>
</body>
</html>