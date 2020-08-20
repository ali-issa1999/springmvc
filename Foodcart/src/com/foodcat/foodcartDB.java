package com.foodcat;


import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

//nes7ab info men database

public class foodcartDB  {
  public static List<Food> getFoodlist() throws ClassNotFoundException,SQLException
  {
	   String url="jdbc:postgresql://localhost:5432/postgres"; 
	   String user ="postgres";
	   String password="0000";
	  ArrayList<Food> food=new ArrayList();
	
 //load mysql driver
	  
	  Class.forName("org.postgresql.Driver");
	  
	  //get the connection
	   Connection con= DriverManager.getConnection(url,user,password);
	  
	  //create a statement 
	  Statement stmt =con.createStatement();
	   
	   
  //execute the statement and loop over the result set
	 ResultSet rs = stmt.executeQuery("select * from Food;");
	  
	   while (rs.next()) {
		 int id =  rs.getInt(1);
		 String item=rs.getString(2);
		 float price=rs.getFloat(3);
		 
		 Food f=new Food(id,item,price);
		 food.add(f);
		 
	  }
	  return food;
  }
}
  
//		 
//	  }
//	  return food;
//		 
//	  }
//		  
//	  }
//	 String url="jdbc:postgresql://localhost/postgres"; 
//    String user ="";
//   String password="0000";
//	
//	private void connect() throws SQLException {
//		try(Connection connection = DriverManager.getConnection(url,user,password);){
//			if(connection!=null) {
//				System.out.println("connectetd succ");
//			}else {
//				System.out.println("not connectetd succ");
//			}
//		} catch(SQLException e) {
//			 e.printStackTrace();
//		 }
//	}
//	public void main(String args[]) throws SQLException {
//		connect();
//	}
//	
//}  

