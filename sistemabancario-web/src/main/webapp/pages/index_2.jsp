<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<title>Insert title here</title>
</head>
<body>

<a href="ControllerServlet">Test me!</a>

<a href="pages/home.xhtml">Test me JSF!</a>




items="${categorias}" var="categoria"

<table style="width:400px" class="pure-table">
        <thead>
            <tr>
                <th>Id</th>
                <th>Nombre</th>
                <th>Descripci&oacute;n</th>
               
            </tr>
        </thead>
    
        <tbody>
              <c:forEach begin="0" end="10" step="1"  varStatus="i" >
          <tr class="${i.index%2 == 0 ? 'pure-table-odd' : 'odd'}">
                <td><c:out value="${i.index}" /></td>
                <td><c:out value="${i.index}" /></td>
                <td><c:out value="${i.index}" /></td>
               
            </tr>
    </c:forEach>
          
   
        </tbody>
    </table>
</body>
</html>