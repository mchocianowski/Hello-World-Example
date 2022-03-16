package com.qa.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class TestConnection {
	public static final Logger LOGGER = LogManager.getLogger();
	
	private String connectionURL = "jdbc:mysql://localhost:3306/PERSONDB";
	private String username = "root";
	private String password = "pass";
	
	public void testConnection() {
		Connection conn =null;
		try {
			LOGGER.info("Attempting DB connection...");
			conn = DriverManager.getConnection(connectionURL,username, password);
			System.out.println("Connected to database");
			LOGGER.info("C");
		} catch (SQLException se) {
			LOGGER.error(se.getMessage());
		} finally {
			try {
				if (conn != null) {
					LOGGER.info("Attempting to close Connection");
					conn.close();
				}
			} catch (SQLException e) {
				LOGGER.error(e.getMessage());
			}

		}
	}
}
	

