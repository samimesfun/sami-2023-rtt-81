package org.perscholas.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedConnectionExample {

	public static void main(String[] args) throws SQLException {
		String dburl = "jdbc:mysql://localhost:3306/classicmodels";
		String user = "root";
		String password = "sa0799sa";
		Connection connection = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver"); // optional;
			connection = DriverManager.getConnection(dburl, user, password);
			
			Scanner scanner=new Scanner (System.in);
			System.out.println("enter an employee first name");
			String firstname=scanner.nextLine();
			System.out.println("Enter an employee last name : ");
			String lastname = scanner.nextLine();
			
			//String sql = "Select * FROM employees where firstname= '" +fistname + "'";
			String sql = "Select * FROM employees where firstname= ? and lastname = ?";
			System.out.println(sql);
			
			// this is the secure way of creating a query
						PreparedStatement stmt = connection.prepareStatement(sql);
						// the first ? in the query is position 1
						stmt.setString(1, firstname);
						stmt.setString(2, lastname);
						System.out.println(sql);
						ResultSet result = stmt.executeQuery();
						
			while (result.next()) {
				Integer id = result.getInt("id");
				String name = result.getString("firstname");
				String email = result.getString("email");
				System.out.println(id + " | " + name + " | " + email);
			}
			result.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				connection.close();
			}
		}
	}
}