<%-- 
    Document   : index
    Created on : 24-01-2018, 15:41:02
    Author     : alumnossur
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="javax.naming.InitialContext"%>
<%@page import="cl.beans.ServicioBeanLocal"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <%! private ServicioBeanLocal service; %>
        
          <% InitialContext ctx = new InitialContext(); 
             service = (ServicioBeanLocal)
             ctx.lookup("java:global/Miercoles/ServicioBean!cl.beans.ServicioBeanLocal");
          %>
        
          <c:set var="productos" scope="page" value="<%= service.getProductos()%>" />
        
          <c:forEach items="${pageScope.productos}" var="p">
              ${p.nombreProducto},${p.precioProducto}, ${p.categoria.nombreCategoria}
              <br><br>
          </c:forEach>
        
    </body>
</html>
