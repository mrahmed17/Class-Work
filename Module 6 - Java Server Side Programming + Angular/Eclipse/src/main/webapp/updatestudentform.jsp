<%@page  import="model.Student"%>

<%@page  import="dao.StudentDao"%>


<%
String id=request.getParameter("id");

Student s=StudentDao.getById(Integer.parseInt(id));

%>

<jsp:include page="header.jsp" />



<div class="container">

	<form action="updatestudent.jsp" method="post">
	
		<input type="hidden" name="id" value="<%=s.getId()%>">
		<div class="mb-3">
			<label for="exampleInputEmail1" class="form-label">Name</label> <input
				type="text" class="form-control" id="exampleInputEmail1"
				aria-describedby="emailHelp" name="name" value="<%=s.getName()%>">

		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Email</label> <input
				type="email" class="form-control" id="exampleInputPassword1" name="email"  value="<%=s.getEmail()%>">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Address</label>
			<input type="text" class="form-control" id="exampleInputPassword1" name="address" value="<%=s.getAddress()%>">
		</div>
		<div class="mb-3">
			<label for="exampleInputPassword1" class="form-label">Cell
				Number</label> <input type=""text"" class="form-control"
				id="exampleInputPassword1" name="cell" value="<%=s.getCell()%>">
		</div>

		<button type="submit" class="btn btn-primary">Submit</button>
	</form>
</div>





<jsp:include page="footer.jsp" />
