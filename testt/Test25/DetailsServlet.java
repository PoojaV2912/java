package com.xworkz.details.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns = "/detail", loadOnStartup = 5)
	public class DetailsServlet extends HttpServlet {
		public DetailsServlet() {
			System.out.println("Creating servlet in DetailsServlet");
		}
		@Override
		protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
			System.out.println("Running doPost in DetailsServlet");
			String siNo =  req.getParameter("siNo");
String name =req.getParameter("name");
String lname =req.getParameter("lname");
String mname =req.getParameter("mname");
String email =req.getParameter("email");
String gender =req.getParameter("gender");
String contactNo =req.getParameter("contactNo");
String area =req.getParameter("area");
String district =req.getParameter("district");
String state =req.getParameter("state");
String pincode =req.getParameter("pincode");

DetailsDTO dto= new DetailsDTO(siNo, name, lname, mname, email, gender, contactNo, area, district, state, pincode);
req.setAttribute("collect", dto);

RequestDispatcher dispatcher=req.getRequestDispatcher("Details.jsp");
dispatcher.forward(req, resp);

		}
		
}
