package com.pluralsight.corejdbc.m5c2;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Connection;

public class HrComponent {
	
	public int replaceSalesManager(String managerBeingReplaced, String replacementManager) throws Exception {
		final String query = "UPDATE employees SET reportsTo = ? WHERE reportsTo = ?";
		try (
				Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=pluralsight&serverTimezone=UTC");
				PreparedStatement preparedStatement = connection.prepareStatement(query)
		) {
			preparedStatement.setString(1, replacementManager);
			preparedStatement.setString(2, managerBeingReplaced);

			return preparedStatement.executeUpdate();
		}
	}
}
