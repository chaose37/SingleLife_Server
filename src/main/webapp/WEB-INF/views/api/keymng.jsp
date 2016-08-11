<!doctype html>
<html>
<head>
    <meta charset="utf-8"/>
    <link rel="apple-touch-icon" sizes="76x76" href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/img/apple-icon.png">
    <link rel="icon" type="image/png" sizes="96x96" href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/img/favicon.png">
    <meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1"/>

    <title>Paper Dashboard by Creative Tim</title>

    <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0' name='viewport'/>
    <meta name="viewport" content="width=device-width"/>


    <!-- Bootstrap core CSS     -->
    <link href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/css/bootstrap.min.css" rel="stylesheet"/>

    <!-- Animation library for notifications   -->
    <link href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/css/animate.min.css" rel="stylesheet"/>

    <!--  Paper Dashboard core CSS    -->
    <link href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/css/paper-dashboard.css" rel="stylesheet"/>


    <!--  CSS for Demo Purpose, don't include it in your project     -->
    <link href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/css/demo.css" rel="stylesheet"/>


    <!--  Fonts and icons     -->
    <link href="http://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css" rel="stylesheet">
    <link href='https://fonts.googleapis.com/css?family=Muli:400,300' rel='stylesheet' type='text/css'>
    <link href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/css/themify-icons.css" rel="stylesheet">
    
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.css">
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert-dev.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/sweetalert/1.1.3/sweetalert.min.js"></script>
    
    
    </head>
<body>

<div class="wrapper">
    <div class="sidebar" data-background-color="white" data-active-color="danger">
        <!--
            Tip 1: you can change the color of the sidebar's background using: data-background-color="white | black"
            Tip 2: you can change the color of the active button using the data-active-color="primary | info | success | warning | danger"
        -->
		<input type="hidden" value="${email}" id="email">
        <div class="sidebar-wrapper">
            <div class="logo">
                <a href="http://www.creative-tim.com" class="simple-text">
                    Creative Tim
                </a>
            </div>

            <ul class="nav" id="sideBar">
                <li>
                    <a href="http://14.32.66.116:11001/controller/api/apimng">
                        <i class="ti-panel"></i>
                        <p> Api Manager </p>
                    </a>
                </li>
                <li class="active">
                    <a href="#">
                        <i class="ti-panel"></i>
                        <p> Key Manager </p>
                    </a>
                </li>
                <li>
                    <a href="http://14.32.66.116:19000/singleLife_web/src/index.html">
                        <i class="ti-panel"></i>
                        <p> Single Life </p>
                    </a>
                </li>
            </ul>
            <form method="post" id="postMove">
            	<input type="hidden" id="emailHidden" name="email">
            </form>
        </div>
    </div>

    <div class="main-panel">
        <nav class="navbar navbar-default">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle">
                        <span class="sr-only">Toggle navigation</span>
                        <span class="icon-bar bar1"></span>
                        <span class="icon-bar bar2"></span>
                        <span class="icon-bar bar3"></span>
                    </button>
                    <a class="navbar-brand" href="#">Dashboard</a>
                </div>
                <div class="collapse navbar-collapse">
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="ti-panel"></i>
                                <p>Stats</p>
                            </a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                                <i class="ti-bell"></i>
                                <p class="notification">5</p>
                                <p>Notifications</p>
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li><a href="#">Notification 1</a></li>
                                <li><a href="#">Notification 2</a></li>
                                <li><a href="#">Notification 3</a></li>
                                <li><a href="#">Notification 4</a></li>
                                <li><a href="#">Another notification</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="#">
                                <i class="ti-settings"></i>
                                <p>Settings</p>
                            </a>
                        </li>
                    </ul>

                </div>
            </div>
        </nav>


        <div class="content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-5 col-sm-6 ">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-warning text-center">
                                            <i class="ti-user"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Email</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr/>
                                    <div class="stats">
                                        <i class="ti-star"></i> ${empty email ? 'Admin' : email}
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-5 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-success text-center">
                                            <i class="ti-key"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>My Key</p>
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr/>
                                    <div class="stats">
                                        <i class="ti-direction"></i>
                                        <span id="keySpan">
                                        ${empty email ? 'Admin' : ''}
                                        </span>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                <div class='row' style="text-align: right;">
               	 	<div class="col-lg-10 col-sm-6">
               	 		<button class="btn btn-success" id="registKey"> Regist Key </button>
               	 		<button class="btn btn-danger" id="deleteKey" style="display:none;"> Delete Key </button>
                	</div>
                </div>
                <div class="row">
             
                <footer class="footer">
                    <div class="container-fluid">
                        <div class="copyright pull-right">
                            &copy;
                            <script>document.write(new Date().getFullYear())</script>
                            , made with <i class="fa fa-heart heart"></i> by Team RollBack
                        </div>
                    </div>
                </footer>
                </div>
            </div>
        </div>

</body>

<!--   Core JS Files   -->
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/jquery-1.10.2.js" type="text/javascript"></script>
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/bootstrap.min.js" type="text/javascript"></script>

<!--  Checkbox, Radio & Switch Plugins -->
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/bootstrap-checkbox-radio.js"></script>

<!--  Charts Plugin -->
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/chartist.min.js"></script>

<!--  Notifications Plugin    -->
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/bootstrap-notify.js"></script>

<!--  Google Maps Plugin    -->
<script type="text/javascript" src="https://maps.googleapis.com/maps/api/js"></script>

<!-- Paper Dashboard Core javascript and methods for Demo purpose -->
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/paper-dashboard.js"></script>

<!-- Paper Dashboard DEMO methods, don't include it in your project! -->
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/demo.js"></script>

<script>

$("#sideBar").on("click","a",function(e){
	e.preventDefault();
	var form = $("#postMove");
	var value = $("#emailHidden")
	value.val($("#email").val());
	form.attr("action",$(this).attr("href"));
	form.submit();
})
$(document).ready(function(){
	$.ajax({
		url:"http://192.168.0.18:8000/controller/api/getapikey",
		data:{email:$("#email").val()},
		success:function(data)
		{
			if(data != "Fail")
			{
				$("#deleteKey").css("display","inline-block");
				$("#registKey").css("display","none");
			}
			else
				data=''				
			$("#keySpan").append(data);
		}
	
	});
	
	$("#deleteKey").click(function(){
		
	swal(
			{
				title : "Are you sure?",
				text : "You will not be able to recover this imaginary file!",
				type : "warning",
				showCancelButton : true,
				confirmButtonColor : "#DD6B55",
				confirmButtonText : "Yes, delete it!",
				cancelButtonText : "No, cancel plx!",
				closeOnConfirm : false,
				closeOnCancel : false
			},
			function(isConfirm) {
				if (isConfirm) {
					$.ajax({
						url:"http://192.168.0.18:8000/controller/api/deletekey",
						data:{email:$("#email").val()},
						type:"post",
						success:function()
						{
							swal(
								"Deleted!",
								"Delete key to success!",
								"success");
							
						setTimeout(reload,1500);
						}
					})
				} else {
					swal(
					"Cancelled",
					"Cancelled",
					"error");
				}
			});
		})
		$("#registKey").click(function() {
		var filter = /^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$/;
		swal({
			title : "Insert IP Address!",
			text : "Write something interesting:",
			type : "input",
			showCancelButton : true,
			closeOnConfirm : false,
			animation : "slide-from-top",
			inputPlaceholder : "Write something"
			},
			function(inputValue) {
				if (inputValue === false)
					return false;
				if (inputValue === "") {
					swal.showInputError("You need to write something!");
					return false
				}
				if (filter.test(inputValue) == false)
				{
					swal.showInputError("Invalid IP address");
					return false	
				}
				$.ajax({
					url:"http://192.168.0.18:8000/controller/api/registkey",
					data:{ip:inputValue,
						email:$("#email").val()},
					type:"post",
					success: function(data)
					{
						swal(
								"Nice!",
								"Your Key : "+data,
								"success");
						setTimeout(reload,1500);
					}
				})

			});
		});

		});
		
function reload()
{
	location.reload();
	}
</script>

</html>
