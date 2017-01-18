<!DOCTYPE html>
<html lang="en">
<head>
    <title>TIY, HW05</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script>
            function validateForm() {
                var x = document.forms["MyForm"]["username"].value;
                if (x == "") {
                    alert("Name must be filled out");
                    return false;
                }
            }
    </script>
    <style>
        /* Remove the navbar's default margin-bottom and rounded borders */
        .navbar {
            margin-bottom: 0;
            border-radius: 0;
            background-color: green;
        }

        /* Set height of the grid so .sidenav can be 100% (adjust as needed) */
        .row.content {height: 450px}


        /* Set black background color, white text and some padding */
        footer {
            background-color: green;
            color: white;
            padding: 15px;
        }

        /* On small screens, set height to 'auto' for sidenav and grid */
        @media screen and (max-width: 767px) {
            .sidenav {
                height: auto;
                padding: 15px;
            }
            .row.content {height:auto;}
        }
    </style>
</head>
<body>

<nav class="navbar navbar-inverse">
    <div class="container-fluid">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a class="navbar-brand" href="home.jsp"><img src="imgs/TIY.png" style="width:40px;"></a>
        </div>
        <div class="collapse navbar-collapse" id="myNavbar">
            <ul class="nav navbar-nav">
                <li><a href="home.jsp">Home</a></li>
                <li><a href="aboutUs.jsp">About Us</a></li>
                <li class="active"><a href="changeUser.jsp">Change User</a></li>
            </ul>
            <ul class="nav navbar-nav navbar-right">
                <li><a href="/logout">Welcome&nbsp;<span class="badge"><%=request.getSession().getAttribute("user")%></span>&nbsp;<span class="glyphicon glyphicon-log-out"></span>Log Out</a></li>
            </ul>
        </div>
    </div>
</nav>

<div class="container-fluid text-center">
    <div class="row content">
        <div class="col-sm-12 text-left">
            <h2>Change Username Form:</h2>
            <form class="form-horizontal" action="/changeUserName" method="post" name="MyForm" onsubmit="return validateForm()">
                <div class="form-group">
                    <label class="control-label col-sm-2" for="username">Enter New Username:</label>
                    <div class="col-sm-4">
                        <input type="text" class="form-control" id="username" name="username" placeholder="Enter username">
                    </div>
                </div>
                <div class="form-group">
                    <div class="col-sm-offset-2 col-sm-2">
                        <button type="submit" class="btn btn-success">Change User Name</button>
                    </div>
                </div>
            </form>
            <%
                String result = (String)request.getAttribute("result");
                if(result!=null){%>
            <div class="alert alert-success">
                <strong><%=result%></strong>
            </div>
            <%
                }
            %>
        </div>
    </div>
</div>

<footer class="container-fluid text-center">
    <p>TIY, all Rights Reserved</p>
</footer>

</body>
</html>