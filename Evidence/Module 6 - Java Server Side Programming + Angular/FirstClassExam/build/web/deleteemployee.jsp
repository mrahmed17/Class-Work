<jsp:useBean class="model.Employee" id="e"/>
<%@page import="dao.EmployeeDAO" %>
<jsp:setProperty name="e" property="*"/>

<% 

EmployeeDAO.deleteEmployee(e);
response.sendRedirect("viewallemployee.jsp");

%>
