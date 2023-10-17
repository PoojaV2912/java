package com.xworkz.policeStation.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(urlPatterns="/station",loadOnStartup = 2)
public class PoliceStationResource extends HttpServlet {
public PoliceStationResource() {
	System.out.println("Creating PoliceSation");
}
@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.print("Running service in PoliceStation");
		String stationNalnme=req.getParameter("stationName");
		String location=req.getParameter("location");
		String Inspector=req.getParameter("inspector");
		String SIName=req.getParameter("sIName");
		String HeadConstable=req.getParameter("headConstable");
		String aCommissioner=req.getParameter("aCommissioner");
		String noOfCells=req.getParameter("noOfCells");
		String pcases=req.getParameter("pcases");
		String painted=req.getParameter("painted");
		System.out.println("Station Name:"+stationNalnme);
		System.out.println("Location :"+location);
		System.out.println("Inspector Name:"+Inspector);
		System.out.println("SIName Name:"+SIName);
		System.out.println("HeadConstable :"+HeadConstable);
		System.out.println(" Assistant Commissioner:"+aCommissioner);
		System.out.println("No Of Cells :"+noOfCells);
		System.out.println("Pending cases :"+pcases);
		System.out.println("Painted :"+painted);
		int convertedCellNo=Integer.parseInt(noOfCells);
		int convertedPCases=Integer.parseInt(pcases);
		boolean convertPainted=Boolean.parseBoolean(painted);
		
		
		
		resp.setContentType("Text/html");
		
		PrintWriter writer=resp.getWriter();
		writer.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<meta name=\"viewpoint\" content=\"width=device-width, intial-scale=1\">\r\n"
				+ "<title>X-workz</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<script src=\"https://cdn..net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<form action=\"station\">\r\n"
				+ "<nav class=\"navbar\" style=\"background-color: blue;\">\r\n"
				+ "<h3>X-workz</h3>\r\n"
				+ "<a href=\"index.html\">Home</a><br>\r\n"
				+ "<a href=\"policeStation.html\">Police Station</a>\r\n"
				+ "\r\n"
				+ "</nav>\r\n"
				+ "<h1>Police Station Information</h1>\r\n"
				+ "\r\n");
		writer.print("</br>\n Station Name :"+stationNalnme);
		writer.print("</br>\n Locatiin  :"+location);
		writer.print("</br>\n Inspector  :"+Inspector);
		writer.print("</br>\n SI Name :"+SIName);
		writer.print("</br>\n Head Constable  :"+HeadConstable);
		writer.print("</br>\n Assistant commissioner :"+aCommissioner);
		writer.print("</br>\n No of cells  :"+noOfCells);
		writer.print("</br>\n Pending cases :"+pcases);
		writer.print("</br>\n Painted Name :"+painted);



		if(convertedPCases>100) {
			writer.print("<span style=color:red></br>\n Too many cases pending</span>");
		}
		else {
			writer.print("<span style=color:green></br>\n less cases pending</span>");
		}
			
		if(convertedCellNo>5) {
			writer.print("<span style=color:green></br>\n Big station</span>");
		}
		else {
			writer.print("<span style=color:red></br>\n Small station</span>");
		}
		if(convertPainted) {
			writer.print("<span style=color:green></br>\n Clean</span>");
		}
		else {
			writer.print("<span style=color:red></br>\n Dirty</span>");
		}
		
				 writer.print("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/@popperjs/core@2.11.8/dist/umd/popper.min.js\" integrity=\"sha384-I7E8VVD/ismYTF4hNIPjVp/Zjvgyol6VFvRkX/vR+Vc4jQkC+hVqc2pM8ODewa9r\" crossorigin=\"anonymous\"></script>\r\n"
				+ "<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.min.js\" integrity=\"sha384-BBtl+eGJRgqQAUMxJ7pMwbEyER4l1g+O15P+16Ep7Q9Q+zqX6gSbd85u4mG4QzX+\" crossorigin=\"anonymous\"></script>\r\n"
				+ "</body>\r\n"
				+ "</html>");
		
}

			
		}

		
	

 