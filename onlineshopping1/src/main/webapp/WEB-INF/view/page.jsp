<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
    <c:set var="contextRoot" value="${pageContext.request.contextPath}"/>
    <spring:url  value="/resources/css" var="css"></spring:url>
    <spring:url  var="js" value="/resources/js"></spring:url>
    <spring:url  var="images" value="/resources/images"></spring:url>


<!DOCTYPE html>
<html lang="en">

  <head>

    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Online Shopping - ${title}  </title>
    
    <script>
    	window.menu='${title}';
    </script>

    <!-- Bootstrap core CSS 
-->
    <link href="vendor/bootstrap/ ${ css }/bootstrap.min.css" rel="stylesheet">

<!-- <link href="css/bootstrap.min.css" rel="stylesheet">  -->
    <!-- Custom styles for this template -->
    <link href="${ css}/myapp.css" rel="stylesheet">

  </head>

  <body>

    <!-- Navigation -->
    <%@include file="shared/navbar.jsp" %>
       <!-- Page Content -->
       
       <c:if test="${userClickHome==true }">
       <%@include file="home.jsp" %>
       </c:if>
       
      <c:if test="${userClickAbout==true }">
       <%@ include file="about.jsp" %>
       </c:if>
       
       <c:if test="${userClickContact==true }">
       <%@ include file="contact.jsp" %></c:if>
        
       <!-- Footer -->
       <%@ include file="shared/footer.jsp" %>
       <!-- Bootstrap core JavaScript 
    <script src="vendor/jquery/jquery.min.js"></script>
    <script src="vendor/bootstrap/${ js} /bootstrap.bundle.min.js"></script>
-->

  <script src="${js }/jquery.js"></script>
<script src="${js}/bootstrap.min.js"></script> 

<!-- self coded javascript -->
<script src="${js}/myapp.js"></script>




  </body>

</html>
