<jsp:useBean class="model.Employee" id="e"/>
<%@page  import="dao.EmployeeDAO" %>
<jsp:setProperty name="e" property="*" />


<%int i=EmployeeDAO.saveEmployee(e);

    if(i>0){
        response.sendRedirect("success.jsp");
    }
    else{
    response.sendRedirect("error.jsp");
    }


%>