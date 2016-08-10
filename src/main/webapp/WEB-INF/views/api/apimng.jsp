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
    <style>
    </style>
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

            <ul class="nav">
                <li class="active">
                    <a href="#">
                        <i class="ti-panel"></i>
                        <p>Dashboard</p>
                    </a>
                </li>
                <li>
                    <a href="http://14.32.66.116:19000/singleLife_web/src/index.html">
                        <i class="ti-panel"></i>
                        <p>SingleLife</p>
                    </a>
                </li>
            </ul>
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
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-warning text-center">
                                            <i class="ti-server"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Capacity</p>
                                            105TB
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr/>
                                    <div class="stats">
                                        <i class="ti-reload"></i> Updated now
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-success text-center">
                                            <i class="ti-wallet"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Revenue</p>
                                            $0
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr/>
                                    <div class="stats">
                                        <i class="ti-calendar"></i> Last day
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-danger text-center">
                                            <i class="ti-pulse"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Errors</p>
                                            0
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr/>
                                    <div class="stats">
                                        <i class="ti-timer"></i> In the last hour
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="col-lg-3 col-sm-6">
                        <div class="card">
                            <div class="content">
                                <div class="row">
                                    <div class="col-xs-5">
                                        <div class="icon-big icon-info text-center">
                                            <i class="ti-twitter-alt"></i>
                                        </div>
                                    </div>
                                    <div class="col-xs-7">
                                        <div class="numbers">
                                            <p>Followers</p>
                                            +455
                                        </div>
                                    </div>
                                </div>
                                <div class="footer">
                                    <hr/>
                                    <div class="stats">
                                        <i class="ti-reload"></i> Updated now
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="col-md-12">
                    <div class="card ">
                        <div class="header">
                            <h4 class="title">SingleLife per Hour</h4>
                            <p class="category">All products</p>
                        </div>
                        <div class="content">
                            <div id="chart1" class='with-transitions'>
                                <svg></svg>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="col-md-6">
                        <div class="card ">
                            <div class="header">
                                <h4 class="title">Weekly Usage</h4>
                                <p class="category">All products</p>
                            </div>
                            <div class="content">
                                <!-- 월간 -->
                                <div id="lineMonth"></div>
                            </div>
                        </div>
                    </div>
                    <div class="col-md-6">
                        <div class="card">
                            <div class="header">
                                <h4 class="title">Total Usage</h4>
                                <p class="category">All products</p>
                                <div id="dayDiv"></div>
                            </div>
                            <div class="content">
                                <!-- 1일 사용량 -->
                                <div id="donutToday"></div>
                            </div>
                        </div>
                    </div>
                </div>

                <footer class="footer">
                    <div class="container-fluid">
                        <nav class="pull-left">
                            <ul>

                                <li>
                                    <a href="http://www.creative-tim.com">
                                        Creative Tim
                                    </a>
                                </li>
                                <li>
                                    <a href="http://blog.creative-tim.com">
                                        Blog
                                    </a>
                                </li>
                                <li>
                                    <a href="http://www.creative-tim.com/license">
                                        Licenses
                                    </a>
                                </li>
                            </ul>
                        </nav>
                        <div class="copyright pull-right">
                            &copy;
                            <script>document.write(new Date().getFullYear())</script>
                            , made with <i class="fa fa-heart heart"></i> by <a href="http://www.creative-tim.com">Creative
                            Tim</a>
                        </div>
                    </div>
                </footer>
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

<script type="text/javascript">
    $(document).ready(function () {
    	
        demo.initChartist();

        $.notify({
            icon: 'ti-gift',
            message: "Welcome to <b>Paper Dashboard</b> - a beautiful Bootstrap freebie for your next project."

        }, {
            type: 'success',
            timer: 4000
        });

    });
</script>
<script src="http://cdnjs.cloudflare.com/ajax/libs/raphael/2.1.0/raphael-min.js"></script>
<script src="http://code.jquery.com/jquery-1.8.2.min.js"></script>
<script src="http://cdn.oesmith.co.uk/morris-0.4.1.min.js"></script>
<script>
var email = $("#email").val();
    var json = (function () {
        var json = null;
        $.ajax({
            data:{ email : email},
            async: false,
            global: false,
            url: 'http://192.168.0.18:8000/controller/api/selectWeekend',
            dataType: 'json',
            success: function (data) {
                json = data;
            }
        });
        return json;
    })();
    Morris.Line({
        element: 'lineMonth',
//        resize : true,
        data: json,
        xkey: 'regdate',
        ykeys: ['webtoon', 'youtube', 'game', 'cvs', 'parcel', 'recipe', 'restaurant', 'prod', 'travel'],
        xLabels: 'day',
        hideHover : 'auto',
        labels: ['WebToon', 'YouTube', 'Game', 'CVS', 'Parcel', 'Recipe', 'Restaurant', 'Product', 'Travel'],
        xLabelFormat: function (d) {
            return d.getFullYear() + " / " + (d.getMonth() + 1) + " / " + d.getDate()
        }
    });
</script>

<script>
    var json = (function () {
        var json = null;
        $.ajax({
            async: false,
            global: false,
            data:{ email : email},
            url: 'http://192.168.0.18:8000/controller/api/selectDaily',
            dataType: 'json',
            success: function (data) {
            	console.dir(data)
            	if(!data.length)
            		$("#donutToday").append("There is no data");
                json = data;
            },
            error: function()
            {
            	alert("error");
            }
        });
        return json;
    })();
    Morris.Donut({
        element: 'donutToday',
        parseTime: false,
        data: json
    });
</script>



<link href="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/css/nv.d3.css" rel="stylesheet" type="text/css">
<script src="https://cdnjs.cloudflare.com/ajax/libs/d3/3.5.2/d3.min.js" charset="utf-8"></script>
<script src="https://cdn.rawgit.com/kokk9239/singleLife_server/master/src/main/webapp/resources/js/nv.d3.js"></script>



<script>

    var json = (function () {
        var json = null;
        $.ajax({
            async : false,
            global : false,
            data:{ email : email},
            url : 'http://192.168.0.18:8000/controller/api/selectHourly',
            data : {email : email},
            dataType : 'json',
            success : function (data) {
                json = data;
            }
        });
        return json;
    })();

    nv.addGraph(function() {
        var chart = nv.models.lineChart();
        var fitScreen = false;
        var width = 1200;
        var height = 600;
        var zoom = 1;

        chart.useInteractiveGuideline(true)
                .showLegend(true)       //Show the legend, allowing users to turn on/off line series.
                .showYAxis(true)        //Show the y-axis
                .showXAxis(true);        //Show the x-axis

        chart.forceX([0,23]);
        chart.xAxis
                .axisLabel('Hour')
                .tickFormat(d3.format(',r'));

        chart.lines.dispatch.on("elementClick", function(evt) {
            console.log(evt);
        });

        chart.yAxis
                .axisLabel('Count')
                .tickFormat(d3.format(',.2'));


        d3.select('#chart1 svg')
                .attr('perserveAspectRatio', 'xMinYMid')
                .attr('width', width)
                .attr('height', height)
                .datum(sinAndCos());

        setChartViewBox();
        resizeChart();

        nv.utils.windowResize(resizeChart);


        function setChartViewBox() {
            var w = width * zoom,
                    h = height * zoom;

            chart
                    .width(w)
                    .height(h);

            d3.select('#chart1 svg')
                    .attr('viewBox', '0 0 ' + w + ' ' + h)
                    .transition().duration(500)
                    .call(chart);
        }


        // This resize simply sets the SVG's dimensions, without a need to recall the chart code
        // Resizing because of the viewbox and perserveAspectRatio settings
        // This scales the interior of the chart unlike the above
        function resizeChart() {
            var container = d3.select('#chart1');
            var svg = container.select('svg');

            if (fitScreen) {
                // resize based on container's width AND HEIGHT
                var windowSize = nv.utils.windowSize();
                svg.attr("width", windowSize.width);
                svg.attr("height", windowSize.height);
            } else {
                // resize based on container's width
                var aspect = chart.width() / chart.height();
                var targetWidth = parseInt(container.style('width'));
                svg.attr("width", targetWidth);
                svg.attr("height", Math.round(targetWidth / aspect));
            }
        }
        return chart;
    });
    function sinAndCos() {
        var webtoon = [],
                youtube = [],
                game = [],
                cvs = [],
                prod = [],
                parcel = [],
                recipe = [],
                restaurant = [],
                travel = []
                ;

        for (var i = 0; i < json.length; i++) {
            var j = json[i];
            webtoon.push({x: j.regdate, y: j.webtoon });
            youtube.push({x: j.regdate, y: j.youtube });
            game.push({x: j.regdate, y: j.game });
            cvs.push({x: j.regdate, y: j.cvs });
            parcel.push({x: j.regdate, y: j.parcel });
            recipe.push({x: j.regdate, y: j.recipe });
            restaurant.push({x: j.regdate, y: j.restaurant });
            prod.push({x: j.regdate, y: j.prod });
            travel.push({x: j.regdate, y: j.travel });

        }
        var size = 5;

        return [
            {
                values: webtoon,
                key: "WebToon",
                strokeWidth: size,
                color: "#ff7f0e"
            },
            {
                values: youtube,
                key: "YouTube",
                strokeWidth: size,
                color: "#2ca02c"
            },
            {
                values: game,
                key: "Game",
                strokeWidth: size,
                color: "#ffccdd"
            },
            {
                values: cvs,
                key: "cvs",
                strokeWidth: size,
                color: "#ccddff"
            },
            {
                values: parcel,
                key: "Parcel",
                strokeWidth: size,
                color: "#ccccdd"
            },
            {
                values: recipe,
                key: "Recipe",
                strokeWidth: size,
                color: "#00ffdd"
            },
            {
                values: restaurant,
                key: "restaurant",
                strokeWidth: size,
                color: "#996622"
            },
            {
                values: prod,
                key: "ProdInfo",
                strokeWidth: size,
                color: "#1199ff"
            },
            {
                values: travel,
                key: "Travel",
                strokeWidth: size,
                color: "#3366aa"
            }
        ];
    }


</script>

</html>
