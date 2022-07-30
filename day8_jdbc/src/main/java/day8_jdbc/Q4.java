package day8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.ResultSetMetaData;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		4) Write a program for Resultset metadata and
//		Database metadata
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8hw", "root", "root");
			pstmt = con.prepareStatement("select * from day8hw.character;");

			rs = pstmt.executeQuery();
			ResultSetMetaData rsmd = rs.getMetaData();
			
			System.out.println("Total columns: " + rsmd.getColumnCount());
			System.out.println("Column name of first column: " + rsmd.getColumnName(1));
			System.out.println("Column type of first column: " + rsmd.getColumnTypeName(1));


		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

	}

}
}
