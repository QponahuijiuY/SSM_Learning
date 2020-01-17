<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
		<meta charset="UTF-8">
		<title>商品管理后台</title>
        <meta name="viewport" content="initial-scale=1.0,maximum-scale=1.0,user-scalable=no">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
  		 <!-- bootstrap framework -->
		<link href="css/bootstrap.min.css" rel="stylesheet" media="screen">
		<!-- main stylesheet -->
		<link href="css/main.min.css" rel="stylesheet" media="screen" id="mainCss">
		<!-- elegant icons -->
        <link href="css/style.css" rel="stylesheet" media="screen">

    </head>
    <body class="side_menu_active side_menu_expanded">
        <div id="page_wrapper">

            <!-- header -->
            <header id="main_header">
                <div class="container-fluid">
                	<!--logo-->
                    <div class="brand_section">
                        <a href="dashboard.html"><img src="picture/logo.png" alt="site_logo" width="63" height="26"></a>
                    </div>
                    <div class="header_user_actions dropdown">
                        <div data-toggle="dropdown" class="dropdown-toggle user_dropdown">
                            <div class="user_avatar">
                                <img src="picture/avatar08_tn.png" alt="" title="Carrol Clark (carrol@example.com)" width="38" height="38">
                            </div>
                            <span class="caret"></span>
                        </div>
                        <ul class="dropdown-menu dropdown-menu-right">
                            <li><a href="#">个人中心</a></li>
                            <li><a href="#">注销</a></li>
                        </ul>
                    </div>
                </div>
            </header>

            <!-- main content -->
            <div id="main_wrapper">
                <div class="container-fluid">
                    <div class="row">
                    	<p class="text-center"><h1>欢迎进入商品后台管理系统</h1></p>
                    	
                    </div>
                </div>  
            </div>
            
            <!-- main menu -->
            <nav id="main_menu">
                <div class="menu_wrapper">
                    <ul>
                        <li class="first_level">
                            <a href="javascript:void(0)">
                                <span class="icon_document_alt first_level_icon"></span>
                                <span class="menu-title">商品管理</span>
                            </a>
                            <ul>
                                <li class="submenu-title">商品管理</li>
                                <li><a href="#" data-toggle="modal" data-target="#addLayer">商品添加</a></li>
                                <li><a href="${pageContext.request.contextPath }/goodsQuery">商品列表</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                <div class="menu_toggle">
                    <span class="icon_menu_toggle">
                        <i class="arrow_carrot-2left toggle_left"></i>
                        <i class="arrow_carrot-2right toggle_right" style="display:none"></i>
                    </span>
                </div>
            </nav>

        </div>

        <!-- jQuery -->
        <script src="js/jquery.min.js"></script>
        <!-- jQuery Cookie -->
        <script src="js/jquerycookie.min.js"></script>
        <!-- Bootstrap Framework -->
        <script src="js/bootstrap.min.js"></script>
        <!-- retina images -->
        <script src="js/retina.min.js"></script>
        <!-- switchery -->
        <script src="js/switchery.min.js"></script>
        <!-- typeahead -->
        <script src="js/typeahead.bundle.min.js"></script>
        <!-- fastclick -->
        <script src="js/fastclick.min.js"></script>
        <!-- match height -->
        <script src="js/jquery.matchheight-min.js"></script>
        <!-- scrollbar -->
        <script src="js/jquery.mcustomscrollbar.concat.min.js"></script>
		<!-- moment.js (date library) -->
        <script src="js/moment-with-langs.min.js"></script>
        <!-- Yukon Admin functions -->
        <script src="js/yukon_all.min.js"></script>
	    <!-- page specific plugins -->
        <!-- footable -->
        <script src="js/footable.min.js"></script>
        <script src="js/footable.paginate.min.js"></script>
        <script src="js/footable.filter.min.js"></script>

            <script>
                $(function() {
                    // footable
                    yukon_footable.goodslist();
                })
            </script>
    </body>
</html>