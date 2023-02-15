package controller;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import dao.EmployeeDa0;
import dto.Employee;

public class Class extends GenericServlet {

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String s1=arg0.getParameter("empid");
		int empid=Integer.parseInt(s1);
		String empname=arg0.getParameter("empname");
		Employee employee=new Employee();
		employee.setEmpid(empid);
		employee.setEmpname(empname);
		EmployeeDa0 employeeDa0=new EmployeeDa0();
		employeeDa0.insert(employee);
		
		
	}

}
