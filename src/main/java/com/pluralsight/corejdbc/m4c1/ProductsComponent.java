package com.pluralsight.corejdbc.m4c1;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.Arrays;


public class ProductsComponent {

	public void printProductList() throws Exception {

		Connection connection = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/classicmodels?user=root&password=pluralsight&serverTimezone=UTC");
//				"jdbc:mysql://jeff-mysql-sydney.c74usuhv8zuq.ap-southeast-2.rds.amazonaws.com:3306/classicmodels?user=root&password=jeffpluralsight&serverTimezone=UTC");
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery("SELECT * FROM products");

		while (resultSet.next()) {
			String productName = resultSet.getString("productName");
			System.out.println(productName);
		}

		resultSet.close();
		statement.close();
		connection.close();
	}
}
