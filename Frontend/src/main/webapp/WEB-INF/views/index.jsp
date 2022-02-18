
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags"%>

<spring:url var="images" value="/rs/images" />
<spring:url var="css" value="/rs/css" />
<spring:url var="js" value="/rs/js" />

<c:set var="contextRoot" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html lang="en">

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description" content="">
<meta name="author" content="">

<title>${title}</title>

 <script>
	window.contextRoot = '${contextRoot}';
</script>

<!-- Bootstrap Core CSS -->
<link href="${css}/bootstrap.min.css" rel="stylesheet">

<!-- Bootstrap Datatable CSS -->
<link href="${css}/dataTables.bootstrap.css" rel="stylesheet">

<!-- Custom CSS -->
<link href="${css}/shop-homepage.css" rel="stylesheet">


</head>

<body>

	<!-- Navigation -->
	<%@include file="./shared/navbar.jsp"%>

	<!-- Page Content -->
	<div class="container">
		<c:if test="${userclickhomepage == true}">
			<%@include file="home.jsp"%>
		</c:if>
		
		<c:if test="${userclickaboutuspage == true}">
			<%@include file="aboutus.jsp"%>
		</c:if>
		
		<c:if test="${userclickservicespage == true}">
			<%@include file="services.jsp"%>
		</c:if>
		
		<c:if test="${userclickcontactpage == true}">
			<%@include file="contact.jsp"%>
		</c:if>
		
		<c:if test="${userclickallproduct == true || userclickcategoryproduct == true}">
			<%@include file="allproducts.jsp"%>
		</c:if>

	</div>
	<!-- /.container -->

	<div class="container">

		<hr>

		<%@include file="./shared/footer.jsp"%>

	</div>
	<!-- /.container -->

	<!-- jQuery -->
	<script src="${js}/jquery.js"></script>

	<!-- Bootstrap Core JavaScript -->
	<script src="${js}/bootstrap.min.js"></script>
	
	  <!-- Datatable Core  -->
    <script src="${js}/dataTables.bootstrap.js"></script>
    
    <!-- Datatable jquery JavaScript -->
    <script src="${js}/jquery.dataTables.js"></script>
    
    <!-- custom JavaScript -->
    <script src="${js}/myscript.js"></script>

</body>

</html>
