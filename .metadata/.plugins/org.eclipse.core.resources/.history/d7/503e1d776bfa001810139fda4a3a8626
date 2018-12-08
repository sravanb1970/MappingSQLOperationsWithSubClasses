package com.JDBC.DBUtil;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class DBUtil {

	/*
	 * private static final String driverName="driverName"; private static final
	 * String dbuser="dbuser"; private static final String dbpassword="dbpassword";
	 * private static final String dburl="dburl";
	 */
	private static Connection connection = null;
	static {
try {			
	Properties pros=new Properties();
		pros.load(new FileInputStream("src/main/resources/DBDetails.properties"));
		Class.forName(pros.getProperty("driverName"));
connection=DriverManager.getConnection(pros.getProperty("dburl"), pros.getProperty("dbuser"),pros.getProperty("dbpassword"));

}catch(IOException | SQLException | ClassNotFoundException e) {

System.out.println(e.getMessage());
}
}
	//here we are just creating an get connection object by inserting our own details 
	//like db username, db url and password.
	public static Connection getConnection() {
		return connection;
	}
}


