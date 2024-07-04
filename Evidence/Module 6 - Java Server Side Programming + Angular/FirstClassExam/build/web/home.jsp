<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body style="color: cyan; background-color: black">
        <img src="img/logo1.png" width="150px" height="150px" alt="Logo"/>
        <h1 style="text-align: center">Evidence Practice</h1>


        <%=new java.util.Date() %>
        <br>
        <br>
        <a href="employeeaddform.jsp" style="color: aqua">Add Student</a>        <br>
        <a href="viewallemployee.jsp" style="color: aqua">View All Student</a>

    </body>
</html>
