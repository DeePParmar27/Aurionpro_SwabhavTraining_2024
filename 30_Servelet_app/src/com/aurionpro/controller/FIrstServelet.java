package com.aurionpro.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FIrstServelet")
public class FIrstServelet extends HttpServlet {
    public FIrstServelet() {
        super();
        
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter write = response.getWriter();
//		int num1 = Integer.parseInt(request.getParameter("number1"));
//		int num2 = Integer.parseInt(request.getParameter("number2"));
//		int result = num1 + num2 ;
//		
//		write.print("<b>Addition is:"+result+"</b>");
		
		String[] colors = request.getParameterValues("colors");
		
		for(String color : colors) {
			write.print(color);
		}

		

		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
