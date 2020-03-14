package com.pluralsight.corejdbc.m3c2;

import java.sql.DriverManager;
import java.sql.Connection;

public class ProductsComponent {
	public boolean tryConnection() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://jeff-mysql-sydney.c74usuhv8zuq.ap-southeast-2.rds.amazonaws.com:3306/classicmodels?user=root&password=jeffpluralsight&serverTimezone=UTC");
			
		boolean isValid = connection.isValid(2);
			
		connection.close();
		
		return isValid;
    }
}