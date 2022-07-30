package day8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class Q6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		6) Write a program for batch proceesing using
//		statement and prepared statement.
		
		// statement batch
		Connection con = null;
		Statement stmt = null;
		PreparedStatement pstmt = null;

		String sql = "INSERT INTO day8hw.character VALUES (?,?,?,?)";

		try {

			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8hw", "root", "root");
			stmt = con.createStatement();

			stmt.addBatch("INSERT INTO day8hw.character VALUES (1, 'Kaeya', 'Mondstadt', 'cryo')");
			stmt.addBatch("INSERT INTO day8hw.character VALUES (2, 'Lisa', 'Mondstadt', 'electro')");
			stmt.addBatch("INSERT INTO day8hw.character VALUES (3, 'Jean', 'Mondstadt', 'anemo')");
			stmt.addBatch("INSERT INTO day8hw.character VALUES (4, 'Amber', 'Mondstadt', 'pyro')");
			
			stmt.executeBatch();
			
			//prepared statement batch

			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 5);
			pstmt.setString(2, "Jean");
			pstmt.setString(3, "Mondstadt");
			pstmt.setString(4, "anemo");
			pstmt.addBatch();
			
			pstmt.executeBatch();
			
			pstmt.close();


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
				con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		

	}

}
