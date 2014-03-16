package com.jlcindia.servlet;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class LoginServlet extends HttpServlet{
	public LoginServlet() {
		System.out.println("--defalut constrtr in LoginServlet--");
	}
	public void service(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
		System.out.println("-----service of LoginServlet------- ");
		String unm=req.getParameter("uname");
		String pwd=req.getParameter("password");
		System.out.println("UserName : "+unm+"\t"+"Password : "+pwd);
		String msg="";
		if(unm.equals(pwd)){
			msg="<h1>Login Successful<br/>Welcome to Home Page</h1>";
		}else{
			msg="<h1>Login Failed<br/>Please Try Again</h1>";
		}
		res.setContentType("text/html");
		Writer wr=res.getWriter();
		wr.write(msg);
	}
}
