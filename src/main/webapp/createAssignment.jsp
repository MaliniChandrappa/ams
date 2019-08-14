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
                        <h1><a href="index.html">Create New Assignment</a></h1>
                    </div>
                    <!-- //logo -->
                    <!-- nav -->
                    <h3>${pin }</h3>
                    <div class="nav_w3ls ml-lg-5">
                        <nav>
                                 <ul>
                                        <li><a href="#events" class="drop-text">Change settings</a></li>
                                        <li><a href="createAssignment.jsp" class="drop-text">Create Assignment</a></li>
                                        <li><a href="assign.jsp" class="drop-text">Assignees</a></li>
                                        <li><a href="search.jsp" class="drop-text">Search</a></li>
                                        <li><a href="signin.ams">Signout</a></li>
                                    </ul>
                    
            
                                
                        
                        </nav>
                    </div>
                    <!-- //nav -->
                </div>
            </div>
        </header>
        <!-- //header -->
    
        <!-- banner -->
        


    <!-- inner banner -->
    <div class="inner-banner-w3ls py-5" id="home">
        <div class="container py-xl-5 py-lg-3">
            <!-- register  -->
            <div class="modal-body mt-md-2 mt-5">
                
                <form action="createAssign.ams" method="post">
                    
                    <div class="form-group">
                    
                        <label class="col-form-label">Course</label>
                        <div class="col-md-10">
                            <select data-plugin-selectTwo class="form-control populate" name="course">
                                    <option value="">Select</option>
                                        <option value="Core Java">Core Java</option>
                                        <option value="Hibernate">Hibernate</option>
                                        <option value="Spring">Spring</option>
                                        <option value="SQL">SQL</option>
                                        <option value="Github">Github</option>
                                        <option value="Maven">Maven</option>
                                        <option value="RestfullWebServices">RestfullWebServices</option>
                                        <option value="Cloud">Cloud</option>
                                </select>
                    </div>
                    </div>
                    <div class="form-group">
                        <label class="col-form-label">Topic</label>
                        <div class="col-md-10">
                            <select data-plugin-selectTwo class="form-control populate" name="topic">
                                    <option value=" ">Select</option>	
                                <optgroup label="Core Java">
                                        <option value="OOPs Principals">OOPs Principals</option>
                                        <option value="Strings">Strings</option>
                                        <option value="Thread">Thread</option>
                                        <option value="Collections">Collections</option>
                                        <option value="Stream API">Stream API</option>
                                        <option value="Lambda Functions">Lambda Functions</option>
                                    </optgroup>
                                    <optgroup label="Hibernate">
                                        <option value="Component">Component</option>
                                        <option value="ORM's Problems">ORM's Problems</option>
                                        <option value="HQL">HQL</option>
                                        <option value="Custome Generator">Custome Generator</option>
                                        <option value="1st Level Catch">1st Level Catch</option>
                                        <option value="Named Queries">Named Queries</option>
                                        <option value="Hikari Configuration">Hikari Configuration</option>
                                    </optgroup>
                                    
                                    <optgroup label="Spring">
                                        <option value="Spring Architecture">Spring Architecture</option>
                                        <option value="Scope Of Bean">Scope Of Bean</option>
                                        <option value="Utilnamespace">Utilnamespace</option>
                                        <option value="Datasources">Datasources</option>
                                        <option value=">Properties file Reading">Properties file Reading</option>
                                        <option value="Spring with ORM">Spring with ORM</option>
                                        <option value="Spring-MVC">Spring-MVC</option>
                                        
                                    </optgroup>
                                </select>
                    </div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Description</label>
												<div class="col-md-6">
													
									<textarea class="form-control populate" name="descripation" rows="10" cols="100"></textarea>
												
												</div>
                    </div>
                    <div class="form-group">
                        <label class="col-md-3 control-label">Deadlines</label>
                        <div class="col-md-10">											
                                    <div class="input-group">
                                            <span class="input-group-addon">
                                                <i class="fa fa-calendar"></i>
                                            </span>
                                            <input type="date" name="deadLine" data-plugin-datepicker class="form-control">
                                    </div>
                        </div>
                        </div>
                        <div class="form-group">
                                <label class="col-md-3 control-label">Upload Type</label>
                                <div class="col-md-10">
                                        <select data-plugin-selectTwo class="form-control populate" name="uploadType">
                                                <option value="uploadType">Select</option>
                                                    <option value="ZIP">ZIP</option>
                                                    <option value="GIT">GIT</option>
                                                    
                                            </select>
                        
                           </div>
                            </div>
                    <div class="sub-w3l my-3">
                        <div class="sub-w3layouts_hub">
                            
                        </div>
                    </div>
                    <button type="submit" class="btn button-style-w3">Create</button>
                    <button type="submit" class="btn button-style-w3">Cancel</button>
                </form>
            </div>
        
            <!-- //register -->
        </div>
    </div>
    <!-- //inner banner -->

    

</body>

</html>