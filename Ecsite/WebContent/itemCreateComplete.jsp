<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
<meta http-equiv="Content-Style-Type" content="text/css"/>
<meta http-equiv="Content-Script-Type" content="text/javascript"/>
<meta http-equiv="imagetoolbar" content="no">
<meta name="description" content=""/>
<meta name="keywords" content=""/>
<title>itemCreatecomplete画面</title>

<style type="text/css">
body{
margin:0;
padding:0;
line-height:1.6;
letter-spacing:1px;
font-family:Verdana,Helvetica,sans-serif;
font-size:12px;
color:#333;
backgrount:#fff;
}

table{
text-align:center;
margin:0 auto;
}

#top{
width: 780px;
    font-weight: 800;
    font-size: 20px;
    margin: 30px auto;
    border: 3px solid;
    border-radius: 10px;
}

#header{
width:100%;
height:80px;
background-color:black;
}

#main{
width:100%;
height:500px;
text-align:center;
}

#footer{
width:100%;
height:80px;
background-color:black;
clear:both;
}

#text-center{
displey:inline-block;
text-align:center;
}

</style>
</head>
<body>

<div id="header">
<div id="pr">
</div>
</div>
<div id="main">
<div id="top">
<p>ItemCreateComplete</p>
</div>
<div>
<h3>商品登録が完了しました。</h3>
<div>
<a href='<s:url action="AdminAction"/>'>管理者画面へ</a>
</div>
</div>
</div>
<div id="footer">
<div id="pr"></div>
</div>
</body>
</html>