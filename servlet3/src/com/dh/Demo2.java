package com.dh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo2 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws FileNotFoundException,IOException, ServletException  {
		System.out.println("ÄãÀ´°ìÊÂ");
		ServletContext application=this.getServletContext();
		RequestDispatcher rd=application.getRequestDispatcher("/servlet3/demo3");
		rd.forward(req, resp);
		
	}
	
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws FileNotFoundException,IOException, ServletException  {
		doGet(req,resp);	
	}

	

}
