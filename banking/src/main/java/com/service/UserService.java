package com.service;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class UserService {

	private Connection connection;

	public UserService() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banking?serverTimezone=UTC", "root", "wanghao624");
			
			if (connection != null) {
				System.out.println("connection created");
			}
			
		} catch (Exception e) {
			System.out.println("connection failed");
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return connection;
	}
	
	public boolean adminLogin(String username, String password) {
		try {
			PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM USERS WHERE Username=? AND Password=?");
			preparedStatement.setString(1, username);
			preparedStatement.setString(2, password);
			System.out.println(username + password);
			ResultSet resultSet = preparedStatement.executeQuery();
			
			if (resultSet.next()) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return false;
	}

}
