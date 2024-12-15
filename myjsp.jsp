<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title> My Calculate page</title>
<style >
img{
   
   height: 20%;
   width: 20%;
  margin-top: 20px;
   }
   body{
   
   background-color:white;
   text-align: center;
   }
   
   img:hover{
  -ms-transform: scale(1.1); /* IE 9 */
  -webkit-transform: scale(1.1); /* Safari 3-8 */
   transform: scale(1.1); 
}
input, button {
  font-size:40px;
  color:black;
  border-radius: 5%;
  background-color:pink; 
  border: 5px solid black;
}
  

</style>   
</head>
<body>
<img src="https://img.freepik.com/premium-photo/very-smiling-pink-face-social-media-designs-emoticons_924723-2244.jpg">
<h1>Joke of the Day!</h1>
<h2>🤣<%=request.getParameter("joke")%>😂</h2>
<form action="myproject" >
<input name="num1" placeholder="First Number"></input>
<input name="num2" placeholder="Second Number"></input>

<button name="bt1" value="1">+</button>
<button name="bt1" value="2">-</button>
<button name="bt1" value="3">*</button>
<button name="bt1" value="4">/</button>
<button name="bt1" value="5">%</button>
</form>

<h1>Ans=<%=request.getParameter("ans")%>🚩</h1>
</body>
</html>