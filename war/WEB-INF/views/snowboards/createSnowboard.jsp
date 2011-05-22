<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="javax.jdo.PersistenceManager" %>
<%@ page import="com.google.appengine.api.users.User" %>
<%@ page import="com.google.appengine.api.users.UserService" %>
<%@ page import="com.google.appengine.api.users.UserServiceFactory" %>
<%@ page import="guestbookspring.Greeting" %>
<%@ page import="guestbookspring.PMF" %>

<html>
	<head>
		<link type="text/css" rel="stylesheet" href="/stylesheets/main.css" />
	</head>
	<body>
		<h1>Create Snowboard</h1>
  
		<form action="/sign" method="post">
			<div style="float:left">Brand:</div>
			<div><input type="text" name="brand" /></div>
			<div style="float:left">Model:</div>
			<div><input type="text" name="model" /></div>
			<div><input type="submit" value="Create" /></div>
		</form>
	</body>
</html>