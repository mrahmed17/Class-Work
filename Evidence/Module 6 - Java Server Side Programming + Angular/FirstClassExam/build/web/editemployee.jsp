<jsp:useBean class="model.Employee" id="e"/>
<%@page import="dao.EmployeeDAO" %>
<jsp:setProperty name="e" property="*"/>

<% 

EmployeeDAO.editEmployee(e);
response.sendRedirect("viewallemployee.jsp");

%>
