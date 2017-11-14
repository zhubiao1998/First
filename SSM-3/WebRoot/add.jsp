<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>
<head>
</head>
<body>
	<center>
		<form action="insert" method="post">
			<h3>添加空气质量信息</h3>
			监测区域：<select name="districtid">
				<option value="0">请选择</option>
				<c:forEach items="${all }" var="D">
					<option value="${D.did }">${D.name }</option>
				</c:forEach>
			</select><br />
		      监测日期： <input type="text" name="monitor" required="required"><br /> 
		  PM10值： <input type="text" name="pm10" required="required"><br />
		  PM2.5值： <input type="text" name="pm25" required="required"><br />
		      监测站 ：<input type="text" name="monitoring" required="required"><br />
			<input type="submit" value="保存" />
			 <a href="add"><input type="button" value="重置" /> </a>
			  <a href="getAll"><input type="button" value="返回" /> </a>
		</form>
	</center>
</body>
</html>
