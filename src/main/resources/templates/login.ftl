<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
    <title>登录</title>
    <link rel="icon" href="/images/favicon.ico" type="image/ico">
    <meta name="author" content="yinqi">
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/materialdesignicons.min.css" rel="stylesheet">
    <link href="/css/style.min.css" rel="stylesheet">
    <style>
        .lyear-wrapper {
            position: relative;
        }

        .lyear-login {
            display: flex !important;
            min-height: 100vh;
            align-items: center !important;
            justify-content: center !important;
        }

        .login-center {
            background: #fff;
            min-width: 38.25rem;
            padding: 2.14286em 3.57143em;
            border-radius: 5px;
            margin: 2.85714em 0;
        }

        .login-header {
            margin-bottom: 1.5rem !important;
        }

        .login-center .has-feedback.feedback-left .form-control {
            padding-left: 38px;
            padding-right: 12px;
        }

        .login-center .has-feedback.feedback-left .form-control-feedback {
            left: 0;
            right: auto;
            width: 38px;
            height: 38px;
            line-height: 38px;
            z-index: 4;
            color: #dcdcdc;
        }

        .login-center .has-feedback.feedback-left.row .form-control-feedback {
            left: 15px;
        }
    </style>
</head>

<body>
<div class="row lyear-wrapper">
    <div class="lyear-login">
        <div class="login-center">
            <br/>
            <form action="/user/login" method="post">
                <div class="form-group has-feedback feedback-left">
                    <#if loginError??>
                        <h4><font color="red">${loginError}</font></h4>
                    </#if>
                </div>
                <div class="form-group has-info feedback-left">
                    <input type="text" placeholder="请输入您的用户名" class="form-control my-form-control" name="userName" id="username"/>
                    <span class="mdi mdi-account form-control-feedback" aria-hidden="true"></span>
                </div>
                <div class="form-group has-info feedback-left">
                    <input type="password" placeholder="请输入密码" class="form-control my-form-control" id="password" name="pwd"/>
                    <span class="mdi mdi-lock form-control-feedback" aria-hidden="true"></span>
                </div>
                <div class="form-group pull-right">
                    <#--                    <button class="btn btn-block btn-primary" type="button" onclick="location.href='index.html'">立即登录</button>-->
                    <input class="btn btn-lg btn-primary" type="submit" value="立即登录"/>
                </div>
            </form>
            <#--            <hr>-->
            <footer class="col-sm-12 text-center">
                <#--                <p class="m-b-0">Copyright © 2019 <a href="http://lyear.itshubao.com">IT书包</a>. All right reserved</p>-->
                <p></p>
            </footer>
        </div>
    </div>
</div>
<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
</body>
</html>