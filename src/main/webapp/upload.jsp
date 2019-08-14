<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="zxx">

<head>
    <title>AMS</title>
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
                    <h1><a href="index.html">Assignment Management</a></h1>
                </div>
                <!-- //logo -->
                <!-- nav -->
                <div class="nav_w3ls ml-lg-5">
                    <nav>
                        <label for="drop" class="toggle">Menu</label>
                        <input type="checkbox" id="drop" />
                        <ul class="menu">
                            <li><a href="index.jsp">Home</a></li>
                            <li><a href="signup.jsp">Signup</a></li>
                            <li>
                                <!-- First Tier Drop Down -->
                                
                                
                                <input type="checkbox" id="drop-2" />
                                
                            </li>
                            <li><a href="signin.jsp">Signin</a></li>
                            <li><a href="upload.jsp">upload</a></li>
                        </ul>
                    </nav>
                </div>
                <!-- //nav -->
            </div>
        </div>
    </header>
    <!-- //header -->
    <!-- //header -->

    <!-- inner banner -->
    <div class="inner-banner-w3ls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- register  -->
            <div class="modal-body mt-md-2 mt-5">
                <h3 class="title-w3 mb-5 text-center text-wh font-weight-bold">Upload Assignment</h3>
                <h2>${msg}</h2>
                <form action="upload.ams" method="post" enctype="multipart/form-data">
                    
                    <div class="form-group">
                        <label class="col-form-label">Email</label>
                        <input type="email" class="form-control" placeholder="" name="email"
                            required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Pin</label>
                        <input type="number" class="form-control" placeholder="" name="pin" required="">
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Git Url</label>
                        <input type="text" class="form-control" placeholder="" name="url">
                    </div>
                    <div class="form-group">
                            <label class="col-form-label">Upload File</label>
                            <input type="file" class="form-control" placeholder="" name="uploadFile"
                                required="">
                        </div>
                    <div class="sub-w3l my-3">
                        <div class="sub-w3layouts_hub">
                            
                            <label for="brand1" class="text-li text-style-w3ls"></label>
                            
                        </div>
                    </div>
                    <button type="submit" class="btn button-style-w3">Submit</button>
                    <button type="submit" class="btn button-style-w3">Cancel</button>
                </form>
            </div>
            <!-- //register -->
        </div>
    </div>
    <!-- //inner banner -->

    

</body>

</html>