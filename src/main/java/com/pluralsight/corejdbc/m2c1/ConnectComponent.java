package com.pluralsight.corejdbc.m2c1;

import java.sql.Connection;
import java.sql.DriverManager;


public class ConnectComponent {
	
	public boolean tryConnection() throws Exception{	

//		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=pluralsight&serverTimezone=UTC")){
		try (Connection conn = DriverManager.getConnection("jdbc:mysql://jeff-mysql-sydney.c74usuhv8zuq.ap-southeast-2.rds.amazonaws.com:3306/classicmodels?user=root&password=jeffpluralsight&serverTimezone=UTC")){

			return conn.isValid(2);
    				   
		}
    }

}
