package com.pluralsight.corejdbc.m2c1;

import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
	public static void main(String[] args) throws Exception {
//		try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=pluralsight&serverTimezone=UTC")){
//
//			return conn.isValid(2);
//
//		}

		try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/classicmodels?user=root&password=pluralsight&serverTimezone=UTC")) {
			System.out.println(connection.isValid(2));
			System.out.println("The attempt to Connection was a SUCCESS");
		} catch (Exception exception) {
			util.ExceptionHandler.handleException(exception);
		}

//		try {
//			ConnectComponent comp = new ConnectComponent();
//
//			if (comp.tryConnection()) {
//				System.out.println("Demo m2c1:");
//				System.out.println("The attempt to Connection was a SUCCESS");
//			} else {
//				System.out.println("Demo m2c1:");
//				System.out.println("The attempt to Connection FAILED");
//			}
//		} catch (Exception exception) {
//			util.ExceptionHandler.handleException(exception);
//		}
	}
}
