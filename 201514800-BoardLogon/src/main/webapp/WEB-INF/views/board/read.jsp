<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	</head>
	<body>
	${boardVO.writer}
   	${boardVO.createDate}
   	${boardVO.title}
   	${boardVO.content}

   <br>
   <a href='<c:url value="/board/list"/>'>LIST</a>|
   <a href='<c:url value="/board/update?no=${boardVO.no}"/>'>UPDATE</a>|
   <a href='<c:url value="/board/delete?no=${boardVO.no}"/>'>DELETE</a>
   
	</body>
</html>