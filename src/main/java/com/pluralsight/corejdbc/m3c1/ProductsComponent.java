package com.pluralsight.corejdbc.m3c1;

import java.sql.Connection;
import java.sql.DriverManager;

public class ProductsComponent {
	public boolean tryConnection() throws Exception {
		final String url = "jdbc:mysql://jeff-mysql-sydney.c74usuhv8zuq.ap-southeast-2.rds.amazonaws.com/classicmodels?user=root&password=jeffpluralsight&serverTimezone=UTC";

		final Connection connection = DriverManager.getConnection(url);

		final boolean isValid = connection.isValid(2);

		connection.close();

		return isValid;
    }
}

