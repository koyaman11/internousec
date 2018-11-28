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
<title>ItemList画面</title>

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
width:780px;
margin:30px auto;
border:1px solid #333;
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
<p>ItemList</p>
</div>
<div>

<div>
<h3>登録は以下になります</h3>
<table border="1">
<tr>
<th>商品</th>
<th>値段</th>
<th>個数</th>
<th>登録日</th>
</tr>
<s:iterator value="itemListDTO">
<tr>
<td><s:property value="itemName"/></td>
<td><s:property value="itemPrice"/><span>円</span></td>
<td><s:property value="itemStock"/><span>個</span></td>
<td><s:property value="insert_date"/></td>
</tr>
</s:iterator>
</table>
<s:form action="ItemListDeleteConfirmAction">
  <s:submit value="消去"/>
  </s:form>
  </div>
  <div id="text-right">
  <p>管理者画面に戻る場合は<a href='<s:url action="AdminAction"/>'>こちら</a>

  </div>
</div>
</div>
<div id="footet">
<div id="pr"></div>
</div>
</body>
</html>