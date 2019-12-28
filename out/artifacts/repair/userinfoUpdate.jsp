<%--
  Created by IntelliJ IDEA.
  User: 74798
  Date: 2019/7/13
  Time: 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<html>--%>
<%--<head>--%>
<%--<title>设备维修</title>--%>
<%--</head>--%>
<%--<body>--%>
<%--<form action="InsertUserinfoServlet" method="post" align="center">--%>

<%--<input type="text" name="username" placeholder="用户名"> <br/>--%>
<%--<input type="text" name="password" placeholder="密码"> <br/>--%>
<%--<input type="text" name="position" placeholder="账户类型"> <br/>--%>
<%--&lt;%&ndash;    改成下拉框&ndash;%&gt;--%>

<%--<input type="submit" value="注册">--%>
<%--<input type="reset" value="重置">--%>
<%--</form>--%>
<%--</body>--%>
<%--</html>--%>


!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <title>吉尼泰美</title>
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0, user-scalable=no">
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-touch-fullscreen" content="yes">
    <meta name="description" content="Avalon Admin Theme">
    <meta name="author" content="The Red Team">

    <link href='http://fonts.googleapis.com/css?family=Source+Sans+Pro:300,400,400italic,700' rel='stylesheet' type='text/css'>

    <!--[if lt IE 10]>
    <script src="assets/js/media.match.min.js"></script>
    <script src="assets/js/placeholder.min.js"></script>
    <![endif]-->

    <link href="assets/fonts/font-awesome/css/font-awesome.min.css" type="text/css" rel="stylesheet">
    <link href="assets/css/styles.css" type="text/css" rel="stylesheet">

    <link href="assets/plugins/jstree/dist/themes/avalon/style.min.css" type="text/css" rel="stylesheet">
    <link href="assets/plugins/codeprettifier/prettify.css" type="text/css" rel="stylesheet">
    <link href="assets/plugins/iCheck/skins/minimal/blue.css" type="text/css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries. Placeholdr.js enables the placeholder attribute -->
    <!--[if lt IE 9]>
    <link href="assets/css/ie8.css" type="text/css" rel="stylesheet">
    <script type="text/javascript" src="http://cdnjs.cloudflare.com/ajax/libs/respond.js/1.1.0/respond.min.js"></script>
    <script type="text/javascript" src="assets/plugins/charts-flot/excanvas.min.js"></script>
    <script type="text/javascript" src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->
    <!-- The following CSS are included as plugins and can be removed if unused-->

    <link href="assets/plugins/form-daterangepicker/daterangepicker-bs3.css" type="text/css" rel="stylesheet">    	<!-- DateRangePicker -->
    <link href="assets/plugins/switchery/switchery.css" type="text/css" rel="stylesheet">        					<!-- Switchery -->
    <link href="assets/plugins/fullcalendar/fullcalendar.css" type="text/css" rel="stylesheet"> 						<!-- FullCalendar -->
</head>





<body class="infobar-offcanvas">
<!--顶部-->
<header id="topnav" class="navbar navbar-inverse navbar-fixed-top clearfix" role="banner">


    <a id="leftmenu-trigger" class="" data-toggle="tooltip" data-placement="right" title="Toggle Sidebar"></a>
    <a class="navbar-brand" href="index.html"></a>
    <a id="rightmenu-trigger" class="" data-toggle="tooltip" data-placement="left" title="Toggle Infobar"></a>


    <div class="yamm navbar-left navbar-collapse collapse">
        <ul class="nav navbar-nav">
            <li class="dropdown">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="fa fa-random mr5"></i>全部功能<span class="caret"></span></a>
            </li>
            <li class="dropdown" id="widget-classicmenu">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">下拉列表<span class="caret"></span></a>
            </li>
            <li><a target="_blank">前台</a></li>
            <li><a  target="_blank">登录页</a></li>
            <li><a  target="_blank">关于吉尼泰美</a></li>
            <li class="dropdown" >
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">联系我们<span class="caret"></span></a>
                <ul class="dropdown-menu" role="menu">
                    <img src="assets/demo/avatar/QRCode.png" class="mb20 img-responsive" style="width: 100%;">
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;欢迎QQ联系forforfor团队</p>
                    <p>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;我们期待您的宝贵意见！</p>
                </ul>
            </li>
        </ul>
    </div>

    <ul class="nav navbar-nav toolbar pull-right">
        <li class="dropdown">
            <a href="#" id="navbar-links-toggle" data-toggle="collapse" data-target="header>.navbar-collapse">&nbsp;</a>
        </li>

        <li class="toolbar-icon-bg demo-headerdrop-hidden">
            <a href="#" id="headerbardropdown"><span class="icon-bg"><i class="fa fa-fw fa-level-down"></i></span></i></a>
        </li>


        <li class="dropdown toolbar-icon-bg hidden-xs">
            <a href="#" class="hasnotifications dropdown-toggle" data-toggle='dropdown'><span class="icon-bg"><i class="fa fa-fw fa-tasks"></i></span><span class="badge badge-warning">5</span></a>
        </li>


        <li class="dropdown toolbar-icon-bg">
            <a href="#" class="hasnotifications dropdown-toggle" data-toggle='dropdown'><span class="icon-bg"><i class="fa fa-fw fa-bell"></i></span><span class="badge badge-alizarin">7</span></a>

        </li>

        <li class="dropdown toolbar-icon-bg hidden-xs">
            <a href="#" class="hasnotifications dropdown-toggle" data-toggle='dropdown'><span class="icon-bg"><i class="fa fa-fw fa-envelope"></i></span><span class="badge badge-info">9</span></a>
        </li>

        <li class="dropdown toolbar-icon-bg demo-search-hidden mr5">
            <a href="#" class="dropdown-toggle tooltips" data-toggle="dropdown"><span class="icon-bg"><i class="fa fa-fw fa-search"></i></span></a>

            <div class="dropdown-menu arrow search dropdown-menu-form">
                <div class="dd-header">
                    <span>Search</span>
                    <span><a href="#">Advanced search</a></span>
                </div>
                <div class="input-group">
                    <input type="text" class="form-control" placeholder="">

                    <span class="input-group-btn">

						<a class="btn btn-primary" href="#">搜索</a>
					</span>
                </div>
            </div>
        </li>

        <li class="dropdown">
            <a href="#" class="dropdown-toggle username" data-toggle="dropdown">
                <span class="hidden-xs">欢迎您！${sessionScope.user}</span>
                <img class="img-circle" src="assets/demo/avatar/timg.jpg" alt="Dangerfield" />

            </a>
        </li>
    </ul>

</header>


<!--菜单栏-->
<div id="wrapper">
    <div id="layout-static">
        <div class="static-sidebar-wrapper sidebar-default">
            <div class="static-sidebar">
                <div class="sidebar">
                    <div class="widget stay-on-collapse">
                        <div class="widget-body welcome-box tabular">
                            <div class="tabular-row">
                                <div class="tabular-cell welcome-avatar">
                                    <a href="#"><img src="assets/demo/avatar/timg.jpg" class="avatar"></a>
                                </div>
                                <div class="tabular-cell welcome-options">
                                    <span class="welcome-text">欢迎您,</span>
                                    <a href="#" class="name">${sessionScope.user}！</a>
                                </div>
                            </div>
                        </div>
                    </div>

                    <div class="widget stay-on-collapse" id="widget-sidebar">
                        <span class="widget-heading">菜单栏</span>
                        <nav role="navigation" class="widget-body">
                            <ul class="acc-menu">
                                <li><a href="index.jsp?_ijt=683ho4859aojsl55bafftvahqt"><i class="fa fa-home"></i><span>主页</span></a></li>
                                <%
                                    System.out.println(session.getAttribute("position"));
                                    int pos = (int) session.getAttribute("position");
                                    if (pos <= 2) {
                                %>
                                <li><a href="javascript:;"><i class="fa fa-columns"></i><span>客户管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="customerMain.jsp">全部客户</a></li>
                                        <li><a href="customerInsert.jsp">录入客户信息</a></li>
                                        <li><a href="customerUpdate.jsp">编辑客户信息</a></li>

                                        </li>
                                    </ul>
                                </li>
                                <%
                                    }
                                    if (pos <= 4) {
                                %>
                                <li><a href="javascript:;"><i class="fa fa-flask"></i><span>报修管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="preRepairMain.jsp">查看全部</a></li>
                                        <li><a href="preRepairUpdate.jsp">修改报修信息</a></li>
                                        <li><a href="preRepairInsert.jsp">录入报修信息</a></li>
                                    </ul>
                                </li>
                                <%
                                    }
                                    if (pos != 1) {
                                %>

                                <li><a href="javascript:;"><i class="fa fa-cogs"></i><span>维修管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="repairMain.jsp">全部维修信息</a></li>
                                        <li><a href="repairUpdate.jsp">修改维修信息</a></li>
                                    </ul>
                                </li>
                                <%
                                    }
                                    if (pos == 0 || pos == 4) {
                                %>
                                <li><a href="javascript:;"><i class="fa fa-cogs"></i><span>任务调度管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="taskQuery.jsp">待分配任务</a></li>
                                        <li><a href="taskFun.jsp">一键分配任务</a></li>
                                    </ul>
                                </li>
                                <%
                                    }
                                    if (pos <= 2 || pos == 5) {
                                %>
                                <li><a href="javascript:;"><i class="fa fa-table"></i><span>结算管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="settlementQuery.jsp">结算账单信息</a></li>
                                        <li><a href="settlementInsert.jsp">登记结算信息</a></li>

                                    </ul>
                                        <%
            }
        if(pos != 1) {
        %>
                                <li><a href="javascript:;"><i class="fa fa-random"></i><span>备件管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="GetAllSparesServlet">查看仓库信息</a></li>
                                        <li><a href="spareInsert.jsp">备件入库</a></li>
                                        <li><a href="spareLogMain.jsp">查看仓库流水</a></li>
                                    </ul>
                                </li>
                                <%
                                    }
                                    if(pos == 0 || pos == 2) {
                                %>
                                <li><a href="javascript:;"><i class="fa fa-pencil"></i><span>运营监督管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="customerMain.jsp">查询客户信息</a></li>
                                        <li><a href="repairMain.jsp">查询维修任务</a></li>
                                        <li><a href="spareMain.jsp">查询库存</a></li>
                                        <li><a href="settlementQuery.jsp">查询结算信息</a></li>
                                    </ul>
                                </li>
                                <%
                                    }
                                    if(pos == 0) {
                                %>
                                <li><a href="javascript:;"><i class="fa fa-flask"></i><span>账号管理</span></a>
                                    <ul class="acc-menu">
                                        <li><a href="userinfoMain.jsp">全部账号</a></li>
                                        <li><a href="userinfoInsert.jsp">注册账号</a></li>
                                    </ul>
                                </li>
                                <%
                                    }
                                %>
                            </ul>
                        </nav>
                    </div>
                </div>

            </div>
        </div>
        <div class="page-content">
            <div class="page-heading">
                <h1>注册账号</h1>
                <div class="options">
                    <div class="btn-toolbar">
                        <a href="#" class="btn btn-default"><i class="fa fa-fw fa-cog"></i></a>
                    </div>
                </div>
            </div>
            <ol class="breadcrumb">
                <li><a href="index.jsp">主页</a></li>
                <li><a href="#">账户管理</a></li>
                <li class="active"><a href="#">注册账号</a></li>

            </ol>
            <div class="row">
                <div class="col-xs-12">
                    <div class="panel panel-default">
                        <br class="panel-body">
                        <form action="UpdateUserinfoServlet" method="post" align="center">

                            <div class="form-group">
                                <label for="ID" class="col-sm-1 control-label">用户名</label>
                                <div class="col-sm-8">
                                    <input type="text" class="form-control" id="ID" name="username" placeholder="用户名"  required>
                                </div>
                            </div>

                            <br/><br/>
                            <div class="form-group">
                                <label for="ID" class="col-sm-1 control-label">密码</label>
                                <div class="col-sm-8">
                                    <input type="password" class="form-control" id="ID" name="password" placeholder="密码"  required>
                                </div>
                            </div>

                            <br/>
                            <div class="form-group">
                                <label for="ID" class="col-sm-1 control-label">账户类型</label>
                                <div class="col-sm-8">
                                    <select class="form-control" name="position" placeholder="账户类型">
                                        <option value ="1">客服</option>
                                        <option value ="2">运营</option>
                                        <option value="3">工程师</option>
                                        <option value="4">任务调度</option>
                                        <option value="5">财务</option>
                                        <option value="6">库管</option>
                                    </select>
                                </div>
                            </div>
                            <br/><br/><br/>


                            <div class="form-group">
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;

                                <input type="submit" value="注册">
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                                <input type="reset" value="重置">
                            </div>
                            </br>

                        </form>
                    </div>


                </div>

            </div>
        </div>
    </div>

</div>

</div>
</div>










<!--换肤div-->
<div class="demo-options">
    <div class="demo-options-icon"><i class="fa fa-spin fa-fw fa-smile-o"></i></div>
    <div class="demo-heading">换肤</div>

    <div class="demo-body">
        <div class="tabular">
            <div class="tabular-row">
                <div class="tabular-cell">固定头部</div>
                <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" checked data-size="mini" data-on-color="success" data-off-color="default" name="demo-fixedheader" data-on-text="I" data-off-text="O"></div>
            </div>
            <div class="tabular-row">
                <div class="tabular-cell">框式布局</div>
                <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" data-size="mini" data-on-color="success" data-off-color="default" name="demo-boxedlayout" data-on-text="I" data-off-text="O"></div>
            </div>
            <div class="tabular-row">
                <div class="tabular-cell">折叠左栏</div>
                <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" data-size="mini" data-on-color="success" data-off-color="default" name="demo-collapseleftbar" data-on-text="I" data-off-text="O"></div>
            </div>
            <div class="tabular-row">
                <div class="tabular-cell">折叠右栏</div>
                <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" checked data-size="mini" data-on-color="success" data-off-color="default" name="demo-collapserightbar" data-on-text="I" data-off-text="O"></div>
            </div>
            <div class="tabular-row hide" id="demo-horizicon">
                <div class="tabular-cell">Horizontal Icons</div>
                <div class="tabular-cell demo-switches"><input class="bootstrap-switch" type="checkbox" checked data-size="mini" data-on-color="primary" data-off-color="warning" data-on-text="S" data-off-text="L" name="demo-horizicons" ></div>
            </div>
        </div>

    </div>

    <div class="demo-body">
        <div class="option-title">顶部颜色</div>
        <ul id="demo-header-color" class="demo-color-list">
            <li><span class="demo-white"></span></li>
            <li><span class="demo-black"></span></li>
            <li><span class="demo-midnightblue"></span></li>
            <li><span class="demo-primary"></span></li>
            <li><span class="demo-info"></span></li>
            <li><span class="demo-alizarin"></span></li>
            <li><span class="demo-grape"></span></li>
            <li><span class="demo-violet"></span></li>
            <li><span class="demo-indigo"></span></li>
        </ul>
    </div>

    <div class="demo-body">
        <div class="option-title">边栏颜色</div>
        <ul id="demo-sidebar-color" class="demo-color-list">
            <li><span class="demo-white"></span></li>
            <li><span class="demo-black"></span></li>
            <li><span class="demo-midnightblue"></span></li>
            <li><span class="demo-primary"></span></li>
            <li><span class="demo-info"></span></li>
            <li><span class="demo-alizarin"></span></li>
            <li><span class="demo-grape"></span></li>
            <li><span class="demo-violet"></span></li>
            <li><span class="demo-indigo"></span></li>
        </ul>
    </div>

    <div class="demo-body hide" id="demo-boxes">
        <div class="option-title">Boxed Layout Options</div>
        <ul id="demo-boxed-bg" class="demo-color-list">
            <li><span class="pattern-brickwall"></span></li>
            <li><span class="pattern-dark-stripes"></span></li>
            <li><span class="pattern-rockywall"></span></li>
            <li><span class="pattern-subtle-carbon"></span></li>
            <li><span class="pattern-tweed"></span></li>
            <li><span class="pattern-vertical-cloth"></span></li>
            <li><span class="pattern-grey_wash_wall"></span></li>
            <li><span class="pattern-pw_maze_black"></span></li>
            <li><span class="patther-wild_oliva"></span></li>
            <li><span class="pattern-stressed_linen"></span></li>
            <li><span class="pattern-sos"></span></li>
        </ul>
    </div>

</div>



<!-- /Switcher -->
<!-- Load site level scripts -->

<script src="assets/js/jquery-1.10.2.min.js"></script> 							<!-- Load jQuery -->
<script src="assets/js/jqueryui-1.9.2.min.js"></script> 							<!-- Load jQueryUI -->
<script src="assets/js/bootstrap.min.js"></script> 								<!-- Load Bootstrap -->

<script src="assets/plugins/jquery-slimscroll/jquery.slimscroll.js"></script> 	<!-- Slimscroll for custom scrolls -->
<script src="assets/plugins/sparklines/jquery.sparklines.min.js"></script>  		<!-- Sparkline -->
<script src="assets/plugins/jstree/dist/jstree.min.js"></script>  				<!-- jsTree -->

<script src="assets/plugins/codeprettifier/prettify.js"></script> 				<!-- Code Prettifier  -->
<script src="assets/plugins/bootstrap-switch/bootstrap-switch.js"></script> 		<!-- Swith/Toggle Button -->

<script src="assets/plugins/bootstrap-tabdrop/js/bootstrap-tabdrop.js"></script>  <!-- Bootstrap Tabdrop -->

<script src="assets/plugins/iCheck/icheck.min.js"></script>     					<!-- iCheck -->

<script src="assets/js/enquire.min.js"></script> 										<!-- Enquire for Responsiveness -->

<script src="assets/plugins/bootbox/bootbox.js"></script>					<!-- BOOTBOX -->

<script src="assets/js/application.js"></script>
<script src="assets/demo/demo.js"></script>
<script src="assets/demo/demo-switcher.js"></script>

<script src="assets/plugins/simpleWeather/jquery.simpleWeather.min.js"></script>

<!-- End loading site level scripts -->

<!-- Load page level scripts-->

<script src="assets/plugins/form-daterangepicker/daterangepicker.js"></script>     	<!-- Date Range Picker -->
<script src="assets/plugins/form-daterangepicker/moment.min.js"></script>             <!-- Moment.js for Date Range Picker -->

<script src="assets/plugins/easypiechart/jquery.easypiechart.js"></script> 			<!-- EasyPieChart -->
<script src="assets/plugins/powerwidgets/js/powerwidgets.js"></script> 				<!-- PowerWidgets -->
<script src="assets/plugins/switchery/switchery.js"></script>     					<!-- Switchery -->

<script src="assets/plugins/fullcalendar/fullcalendar.min.js"></script>   			<!-- FullCalendar -->

<!-- Charts -->
<script src="assets/plugins/charts-flot/jquery.flot.min.js"></script>             	<!-- Flot Main File -->
<script src="assets/plugins/charts-flot/jquery.flot.stack.min.js"></script>       	<!-- Flot Stacked Charts Plugin -->
<script src="assets/plugins/charts-flot/jquery.flot.orderBars.min.js"></script>   	<!-- Flot Ordered Bars Plugin-->
<script src="assets/plugins/charts-flot/jquery.flot.resize.min.js"></script>          <!-- Flot Responsive -->
<script src="assets/plugins/charts-flot/jquery.flot.tooltip.min.js"></script> 		<!-- Flot Tooltips -->

<!-- Maps -->
<script src="assets/plugins/jQuery-Mapael/js/raphael/raphael-min.js"></script>        <!-- Load Raphael as Dependency -->
<script src="assets/plugins/jQuery-Mapael/js/jquery.mapael.js"></script>              <!-- jQuery Mapael -->
<!-- <script src="assets/plugins/jQuery-mousewheel/jquery.mousewheel.min.js"></script> -->     <!-- Mousewheel Support in zoomed-in maps -->
<script src="assets/plugins/jQuery-Mapael/js/maps/world_countries.js"></script>       <!-- Vector Data of World Countries -->


<script src="assets/demo/demo-index.js"></script> 									<!-- Initialize scripts for this page-->

<!-- End loading page level scripts-->

</body>
</html>

