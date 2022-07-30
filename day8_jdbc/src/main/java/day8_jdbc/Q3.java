package day8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import java.sql.CallableStatement;

public class Q3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		3) Write a program for calling a procedure.
		Connection con = null;

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8hw", "root", "root");

			CallableStatement cstmt = con.prepareCall("{call getCharacter(?)}");
			cstmt.setInt(1, 1);
			cstmt.execute();
			System.out.println("Success");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {

				con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
