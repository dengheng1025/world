package com.dh;

import java.io.FileNotFoundException;
import java.io.IOException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Demo3 extends HttpServlet{
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws FileNotFoundException,IOException  {
		System.out.println("һ��Ǯ һ�ֻ�");
		
	}
	
    public void doPost(HttpServletRequest req,HttpServletResponse resp) throws FileNotFoundException,IOException {
		doGet(req,resp);	
	}
}
