package com.foodcat;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/foodcart")
public class foodcart extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1-get the data from the database(model)
		
		//String [] fooditems= {"briyani","pizza","chicken lolypop"};
		
		try {
			
		
		 List<Food> fooditems =foodcartDB.getFoodlist();
		//send this data to jsp page
		request.setAttribute("fooditems",fooditems);
			
		}catch(ClassNotFoundException  e) {
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//send this data to jsp page
		//request.setAttribute("fooditems",fooditems);
		
		
		//2-redirect to a different page(view)
		
		//2-
		RequestDispatcher dispatcher=request.getRequestDispatcher("show-food.jsp");
		dispatcher.forward(request, response);//redirect to thispage (show food.jsp)
		
		
		
		
		
	}

}
