<%@page import="java.util.List"%>
<%@page import="com.benz.entity.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Display Employe Data</title>
</head>

<body>
	<form>
		<table>
			<tr>
				<td>Id</td>
				<td>Name</td>
				<td>father</td>
				<td>mother</td>
				<td>Address</td>
				<td>Phone</td>
				<td>Gender</td>
				<td>Select</td>
			</tr>

			<%
				List<Employee> employeelist = (List<Employee>) request
						.getAttribute("employeeList");
				for (Employee employee : employeelist) {
			%>
			<tr>
				<td><%=employee.getId()%></td>
				<td><%=employee.getName()%></td>
				<td><%=employee.getFatherName()%></td>
				<td><%=employee.getMotherName()%></td>
				<td><%=employee.getAddress()%></td>
				<td><%=employee.getPhoneNumber()%></td>
				<td><%=employee.getGender()%></td>
				<td><input type="radio" name="radio"
					value=<%=employee.getId()%>></td>
			</tr>

			<%
				}
			%>
			<tr>
				<td colspan="2" align="center">
					<a href="./pages/registration.jsp">Register New Employee</a>
				</td>
				<td colspan="2" align="center"><input type="button"
					value="Delete" name="delete" />
				<td colspan="4" align="center"><input type="button"
					value="Update" name="update" />
			</tr>
		</table>

	</form>
</body>
</html>