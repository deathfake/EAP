<%-- 
    Document   : newjsp
    Created on : May 27, 2018, 12:59:04 AM
    Author     : lovel
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <c:choose>
            <c:when test="${param.uname !='' && param.passwd !=''}">
                <c:out value="${param.uname}"></c:out>
                <c:out value="${param.passwd}"></c:out>   
            </c:when>
            <c:otherwise>
                <c:redirect url="/error.html"></c:redirect>
            </c:otherwise>
            </c:choose>
        <c:choose>
                <c:when test="${param.uname == 'admin'}">
                    <c:forEach var="a" begin="1" end="50">
                        <c:if test="${a%2==0}">
                              <c:out value="${a}"></c:out>
                    </c:if>
                    </c:forEach>
                    
                </c:when>
            </c:choose>
    </body>
</html>
