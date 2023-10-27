package com.xworkz.enquiry.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.Renderer;



@WebServlet(urlPatterns = "/pen", loadOnStartup = 3)
public class EnquiryServlet extends HttpServlet {
	public EnquiryServlet() {
		System.out.println("Created EnquiryServlet");
	}
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
	String name =req.getParameter("name");
	String mobileNo=req.getParameter("mobileNo");
	String eMail=req.getParameter("email");
	String dob=req.getParameter("dob");
	String location=req.getParameter("location");
	String password=req.getParameter("password");
	String confirmPassword=req.getParameter("confirm");

	EnquiryDTO dto=new EnquiryDTO(name, mobileNo, eMail, dob, location, password, confirmPassword);
	req.setAttribute("chair", dto);
	
	RequestDispatcher dispatcher=req.getRequestDispatcher("EnquirySucess.jsp");
	dispatcher.forward(req, resp);
}
}
