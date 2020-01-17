<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="UTF-8">
        <title>登录/注册</title>
        <meta name="viewport" content="initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">

        <!-- bootstrap framework -->
        <link href="${pageContext.request.contextPath }/css/bootstrap.min.css" rel="stylesheet" media="screen">
        <!-- elegant icons -->
        <link href="${pageContext.request.contextPath }/css/style.css" rel="stylesheet" media="screen">
        <!-- main stylesheet -->
		<link href="${pageContext.request.contextPath }/css/main.min.css" rel="stylesheet" media="screen">

        <!-- jQuery -->
        <script src="${pageContext.request.contextPath }/js/jquery.min.js"></script>

    </head>
    <body class="login_page">
        <div class="login_header">
        </div>
        <div class="login_register_form">
            <div class="form_wrapper animated-short" id="login_form">
                <h3 class="sepH_c"><span>Login</span> \ <a href="javascript:void(0)" class="form-switch" data-switch-form="register_form">Register</a></h3>
                <form id="loginFrom" action="${pageContext.request.contextPath }/userLogin" method="post">
                    <div class="input-group input-group-lg sepH_a">
                        <span class="input-group-addon"><span class="icon_profile"></span></span>
                        <input type="text" class="form-control" placeholder="Username" name="username">
                    </div>
                    <div class="input-group input-group-lg">
                        <span class="input-group-addon"><span class="icon_key_alt"></span></span>
                        <input type="password" class="form-control" placeholder="Password" name="password">
                    </div>
                    
                    <div>
                        <a id="errorMsg" href="javascript:void(0)" style="color: red">${errorMsg}</a>
                    </div>
                    
                    <div class="sepH_c text-right">
                        <a href="javascript:void(0)" class="small">Forgot password?</a>
                    </div>
                    <div class="form-group sepH_c">
                        <a href="javascript:doucment:loginFrom.submit()" class="btn btn-lg btn-primary btn-block">Log in</a>
                    </div>
                </form>
            </div>
            <div class="form_wrapper animated-short" id="register_form" style="display:none">
                <h3 class="sepH_c"><span>Register</span> \ <a href="javascript:void(0)" class="form-switch" data-switch-form="login_form">Login</a></h3>
                <form name = "registerForm" action="${pageContext.request.contextPath}/userRegister" method="post">
                    <div class="input-group input-group-lg sepH_a">
                        <span class="input-group-addon"><span class="icon_profile"></span></span>
                        <input type="text" class="form-control" placeholder="Username" name="username">
                    </div>
                    <div class="input-group input-group-lg sepH_a">
                        <span class="input-group-addon"><span class="icon_key_alt"></span></span>
                        <input type="password" class="form-control" placeholder="Password" name="password">
                    </div>
                    <div class="input-group input-group-lg sepH_c">
                        <span class="input-group-addon"><span class="icon_mail_alt"></span></span>
                        <input type="email" class="form-control" placeholder="Email" name="email">
                    </div>
                    <div class="form-group sepH_c">
                        <a href="javascript:doucment:registerForm.submit()" class="btn btn-lg btn-success btn-block">Register</a>
                    </div>
                </form>
            </div>
        </div>

        <script>
            $(function () {
                $('.form-switch').on('click', function (e) {
                    e.preventDefault();

                    var $switchTo = $(this).data('switchForm'),
                        $thisForm = $(this).closest('.form_wrapper');

                    $('.form_wrapper').removeClass('fadeInUpBig');
                    $thisForm.addClass('fadeOutDownBig');

                    setTimeout(function () {
                        $thisForm.removeClass('fadeOutDownBig').hide();
                        $('#' + $switchTo).show().addClass('fadeInUpBig');
                    }, 300);

                });
            });
        </script>
    </body>
</html>