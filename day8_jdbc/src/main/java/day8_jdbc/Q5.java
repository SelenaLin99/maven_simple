package day8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Q5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		5) Write a program for transaction management
		Connection con = null;
		PreparedStatement pstmt = null;
		String sql = "INSERT INTO day8hw.character VALUES (?,?,?,?)";
		String sql2 = "INSERT INTO day8hw.powers VALUES (?,?,?,?)";

		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8hw", "root", "root");
			con.setAutoCommit(false);

			pstmt = con.prepareStatement(sql);

			pstmt.setInt(1, 1);
			pstmt.setString(2, "Kaeya");
			pstmt.setString(3, "Mondstadt");
			pstmt.setString(4, "cryo");

			System.out.println(pstmt.executeUpdate());
			// Submit a malformed SQL statement that breaks
			pstmt = con.prepareStatement(sql2);

			pstmt.setInt(1, 2);
			pstmt.setString(2, "Amber");
			pstmt.setString(3, "Mondstadt");
			pstmt.setString(4, "pryo");

			System.out.println(pstmt.executeUpdate());
			// If there is no error.

			con.commit();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				con.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

}
