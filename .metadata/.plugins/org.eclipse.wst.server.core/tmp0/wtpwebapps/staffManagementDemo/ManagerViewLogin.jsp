<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>

<style>
body{
background: black;

}
 
/*adding a box*/
.box99{
width: 450px;
height: 450px;
background-image:url(back1.jpg);
margin: 30px auto;
box-shadow: 10px 15px 40px white;
padding: 50px;
}
/*styles for text boxes*/
.box99 input{
width: 100%;
border: 1px solid #000000;
font-size: 15px;
padding: 8px 10px; }
/*styles for lables*/
.input label{
color:white;
width: 80px;
margin-right: 10px;
font-size: 20px;
float: left;
padding-bottom: 10px;
padding-left: 8 px;
}
/*styles for forgot password*/
.forgot{
float: right;
font-size: 10px;
}
.forgot a{
color: black;
}
/*styles for login button*/
.btn1{
width: 100%;
padding: 8px 10px;
font-size: 15px;
background: #1c1f4c;
cursor: pointer;
display: inline;
float: left;
color: white;
margin-top: 30px;
border: 0;
}
.btn1:hover{
background-color: #fec20f;}
/*styles for heading*/
.header{
font-family: Arial, Helvetica, sans-serif;
color :white;
text-shadow: 5px 5px 7px #000000;
font-size: 40px;
text-transform: uppercase;
}
</style>


</head>
<body>
<div class="box99">
<h1 class="header">Login</h1>
<div class="alert-light text-danger text-center py-3"></div>



<!------------------------------login form------------------->




<form method="post" action="managerview">
<div class="input">
<label>Username</label>
<input type="text" placeholder="Username" name="username" required>
<br><br>
</div>
<div class="input">
<label>Password</label>
<input type="password" placeholder="Password" name="password" required>
<br>
</div>
<br>
<button type="submit" name="Login" class="btn1"> LOGIN </button>
</form>
</div>


</body>
</html>