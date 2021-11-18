<%@page import="blogFormation.models.Formation"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Les formations</h1>
	<ul>
		<li>
			Titre : <b>${formation.getTitle()}</b>
		</li>
		<li>
			Programme : <b>${formation.getProgram()}</b>
		</li>
		<li>
			Nombre d'étudiants : <b>${formation.getStudentNumber()}</b>
		</li>
	</ul>
	
</body>
</html>