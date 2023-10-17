package com.xworkz.loan.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/loan", loadOnStartup = 2)
public class LoanServlet extends HttpServlet{
	public LoanServlet() {
		System.out.println("Created LoanServlet.............");
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("running in loanServlet");
		
		String name=req.getParameter("name");
		String amount=req.getParameter("amount");
		String working=req.getParameter("working");
		String interest=req.getParameter("interest");
		String surety=req.getParameter("surety");
		String company=req.getParameter("company");
		String loanTenure=req.getParameter("loanTenure");
		String loanType=req.getParameter("loanType");
		String accepttheTerms=req.getParameter("accepttheTerms");
		
		System.out.println(name);
		System.out.println(amount);
		System.out.println(working);
		System.out.println(interest);
		System.out.println(company);
		System.out.println(loanTenure);
		System.out.println(loanType);
		System.out.println(accepttheTerms);
		
		req.setAttribute("name", name);
		req.setAttribute("amount", amount);
		req.setAttribute("working", working);
		req.setAttribute("interest", interest);
		req.setAttribute("surety", surety);
		req.setAttribute("company", company);
		req.setAttribute("loanTenure", loanTenure);
		req.setAttribute("loanType", loanType);
		req.setAttribute("accepttheTerms", accepttheTerms);
		
		RequestDispatcher dispatcher=req.getRequestDispatcher("LoanDisplay.jsp");
		dispatcher.forward(req, resp);
	}
}
