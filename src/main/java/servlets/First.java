package servlets;

import java.io.IOException;

import jakarta.servlet.Servlet;
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;
//Below is the first method to create Servlet by implementing Servlet interface and overriding all its methods 

@WebServlet("/first")
//above annotation is used to directly map servlet with url basepath/x i.e FirstProject/first url i.e url pattern
public class First implements Servlet {
	
	private ServletConfig servletConfig ;
	
	//below three are life cycle methods
	
	@Override
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		this.servletConfig=config;
		System.out.println("First Servlet created");
	}
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("Recived a request from client on first Servlet");
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("First Servlet destroyed");
		
	}
	
	//below are non life cycle methods

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return "This is the information about servlet";
	}

	

	

}
