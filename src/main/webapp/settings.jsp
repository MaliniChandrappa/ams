<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE HTML>
<html lang="zxx">

<head>
<title>Assignment-Management</title>
<!-- Meta tag Keywords -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta charset="UTF-8" />
<meta name="keywords"
	content="My School Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
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
<link
	href="//fonts.googleapis.com/css?family=Lora:400,400i,700,700i&amp;subset=cyrillic,cyrillic-ext,latin-ext,vietnamese"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Dosis:200,300,400,500,600,700,800&amp;subset=latin-ext"
	rel="stylesheet">
<!-- //Web-Fonts -->
</head>

<body>
	<header>
        <div class="container">
            <div class="header d-lg-flex justify-content-between align-items-center py-2 px-sm-2 px-1">
                <!-- logo -->
                <div id="logo">
                    <h1><a href="index.html">Assignment-management</a></h1>
                </div>
                <!-- //logo -->
                <!-- nav -->
                <div class="nav_w3ls ml-lg-5">
                    <nav>
                        <label for="drop" class="toggle">Menu</label>
                        <input type="checkbox" id="drop" />
                        <ul class="menu">
                            <li><a href="home.jsp">Home</a></li>
                            <li><a href="upload.jsp">Upload</a></li>
                            <li>
                                <!-- First Tier Drop Down -->
                                
                                
                                <input type="checkbox" id="drop-2" />
                                
                            </li>
                            <li><a href="search.jsp">Search</a></li>
                            <li><a href="signin.ams">Signout</a></li>
                        </ul>
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
				<h3 class="title-w3 mb-5 text-center text-wh font-weight-bold">Change Settings</h3>
				<h3>${msg }</h3>
				<form action="settings.ams" method="post">

					<div class="form-group">
						<label class="col-form-label">First Name</label> <input
							type="text" class="form-control" placeholder="First Name"
							name="fName" required="" value="${user.fName }">
					</div>
					<div class="form-group">
						<label class="col-form-label">Last Name</label> <input
							type="text" class="form-control" placeholder="Last Name"
							name="lName" required="" value="${user.lName }">
					</div>
					<div class="form-group">
						<label class="col-form-label">Email</label> <input type="text"
							class="form-control" placeholder="loremipsum@email.com"
							name="email" required="" readonly="readonly" value="${user.email }">
					</div>
					<label class="col-form-label">CCode</label>
					<input type="number" rows="1" cols="2" name="cCode"/>
					<div class="form-group">
					<label class="col-form-label">Phone Number</label>
					<input type="number" class="form-control" placeholder="number"
							name="mobileNumber" required="" value="${user.mobileNumber }" >
					</div>
					<div class="sub-w3l my-3">
						<div class="sub-w3layouts_hub">
							<input type="checkbox" id="brand1" value=""> <label
								for="brand1" class="text-li text-style-w3ls"> <span></span>I
								Accept to the Terms & Conditions
							</label>
						</div>
					</div>
					<button type="submit" class="btn button-style-w3">Submit</button>
					<button type="reset" class="btn button-style-w3">Cancel</button>
				</form>
			</div>
			<!-- //register -->
		</div>
	</div>
	<!-- //inner banner -->
	<div class="fixed-footer">
		<div class="container">Copyright &copy; 2019 Your Institute</div>
	</div>


</body>

</html>