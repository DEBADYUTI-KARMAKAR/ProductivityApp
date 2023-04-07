<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<link href="webjars/bootstrap/5.1.3/css/bootstrap.min.css"
	rel="syulesheet">
<title>Login</title>
</head>
<body>

	<div>Welcome ${name}</div>
	<hr>
	<h1>Your Todos</h1>

	<table>
		<thead>
			<tr>
				<th>id</th>
				<th>Description</th>
				<th>Targert</th>
				<th>Is Done?</th>

			</tr>
		</thead>
		<tbody>
			<c:forEach items="${todos}" var="todo">
				<tr>
					<td>${todo.id}</td>
					<td>${todo.description}</td>
					<td>${todo.targetDate}</td>
					<td>${todo.done}</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>

	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js "></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>
</body>
</html>