

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body style="color: aqua; background-color: black">
        <h1 style="text-align: center">Employee Form</h1>

        <form action="saveemployee.jsp" method="post" style="text-align: center">
            Name: <input type="text" name="name"> <br>
            Email: <input type="email" name="email"> <br>
            Address: <input type="text" name="address"> <br>

            <input type="submit" value="Save">

        </form>
    </body>
</html>
