package com.pluralsight.corejdbc.m3c3;

import javax.enterprise.inject.Produces;
import javax.sql.DataSource;

import com.mysql.cj.jdbc.MysqlDataSource;

public class DataSourceProducer {

	public MysqlDataSource mySqldataSource = null;

	@Produces
	@MySqlDataSource
	public DataSource produceDataSource() {
		// read properties from somewhere here

		if (mySqldataSource == null) {
			mySqldataSource = new MysqlDataSource();
			mySqldataSource.setPassword("jeffpluralsight");
			mySqldataSource.setUser("root");
//			mySqldataSource.setURL("jdbc:mysql://localhost:3306/classicmodels?serverTimezone=UTC");
			mySqldataSource.setURL("jdbc:mysql://jeff-mysql-sydney.c74usuhv8zuq.ap-southeast-2.rds.amazonaws.com/classicmodels?serverTimezone=UTC");
		}
		return mySqldataSource;
	}
}
