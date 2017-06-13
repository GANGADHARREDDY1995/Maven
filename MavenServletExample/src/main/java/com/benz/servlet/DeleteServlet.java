package com.benz.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;

import com.benz.service.EmployeeService;

public class DeleteServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		EmployeeService service=EmployeeService.getEmployeeService();
		service.getDelectEmployee();
		request.getRequestDispatcher("/pages/Display.jsp").forward(request, response);
	}

}
