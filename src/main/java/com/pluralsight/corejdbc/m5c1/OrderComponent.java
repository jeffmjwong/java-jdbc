package com.pluralsight.corejdbc.m5c1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class OrderComponent {
	public void updateOrderQuantity(int orderNumber, String productCode, int newQuantity) throws Exception {
		final String query = "UPDATE orderdetails SET quantityOrdered = ? WHERE orderNumber = ? AND productCode = ?";

		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=pluralsight&serverTimezone=UTC");
				PreparedStatement statement = connection.prepareStatement(query)
		) {
			statement.setInt(1, newQuantity);
			statement.setInt(2, orderNumber);
			statement.setString(3, productCode);

			statement.executeUpdate();
		}
	}
}
