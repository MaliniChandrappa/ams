<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
    <title>My School Education Category Bootstrap Responsive website Template | Register :: w3layouts</title>
    <!-- Meta tag Keywords -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta charset="UTF-8" />
    <meta name="keywords" content="My School Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
    <script>
        addEventListener("load", function () {
			setTimeout(hideURLbar, 0);
		}, false);

		function hideURLbar() {
			window.scrollTo(0, 1);
		}
	</script>
    <!-- //Meta tag Keywords -->

    <!-- Custom-Files -->
    <link href="css/bootstrap.css" rel='stylesheet' type='text/css' />
    <!-- Bootstrap-CSS -->
    <link href="css/style.css" rel='stylesheet' type='text/css' />
    <!-- Style-CSS -->
    <link href="css/font-awesome.min.css" rel="stylesheet">
    <!-- Font-Awesome-Icons-CSS -->
    <!-- //Custom-Files -->

    <!-- Web-Fonts -->
    <link href="//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
        rel="stylesheet">
    <link href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext" rel="stylesheet">
    <!-- //Web-Fonts -->
</head>

<body>
    <!-- header -->
    <header>
        <div class="container">
            <div class="header d-lg-flex justify-content-between align-items-center py-2 px-sm-2 px-1">
                <!-- logo -->
                <div id="logo">
                    <h1><a href="index.html">Change Password</a></h1>
                </div>
                <!-- //logo -->
                <!-- nav -->
                <div class="nav_w3ls ml-lg-5">
                    <nav>
                        <label for="drop" class="toggle">Menu</label>
                        <input type="checkbox" id="drop" />
                    </nav>
                </div>
                <!-- //nav -->
            </div>
        </div>
    </header>
    <!-- //header -->

    <!-- inner banner -->
    <div class="inner-banner-w3ls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- register  -->
            <div class="modal-body mt-md-2 mt-5">
            <h2>${msg}</h2>
                
                <form action="changePassword.ams" method="post">
                    <div class="form-group">
                        <label class="col-form-label">Email</label>
                        <input type="text" class="form-control" placeholder="email" name="email"
                            required="">
                    
                    <div class="form-group">
                        <label class="col-form-label">New Password</label>
                        <input type="password" class="form-control" placeholder="old password" name="oldPassword"
                            required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">New Password</label>
                        <input type="password" class="form-control" placeholder="New Password" name="newPassword" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Confirm Password</label>
                        <input type="password" class="form-control" placeholder="Confirm Password" name="confirmPassword" required="">
                    </div>
                    
                    <div class="sub-w3l my-3">
                        <div class="sub-w3layouts_hub">
                            <label for="brand1" class="text-li text-style-w3ls">
                                
                        </div>
                    </div>
                    <button type="submit" class="btn button-style-w3">Change</button>
                    <button type="submit" class="btn button-style-w3">Cancel</button>
                </form>
            </div>
            <!-- //register -->
        </div>
    </div>
    <!-- //inner banner -->

    

</body>

</html>