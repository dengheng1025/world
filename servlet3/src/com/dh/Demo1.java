package com.dh;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo1 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws FileNotFoundException,IOException  {
		String path=this.getServletContext().getRealPath("/WEB-INF/1.properties");
		System.out.println(path);
		Properties p=new Properties();
		p.load(new FileInputStream(path));
		System.out.println(p.getProperty("key"));
		
	}
	
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws FileNotFoundException,IOException {
		doGet(req,resp);	
	}


}
