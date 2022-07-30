package day8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		2) Write a program for preparedstatement for
//		doing below operations with positional param
//		inserts
//		select
//		Update
		
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "INSERT INTO day8hw.character VALUES (?,?,?,?)";
		String sql2 = "SELECT * FROM day8hw.character";
		String sql3 = "UPDATE day8hw.character SET vision = ? WHERE idCharacter = ?";
		
		try {
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8hw", "root", "root");
			pstmt = con.prepareStatement(sql);
			
			pstmt.setInt(1, 1);
			pstmt.setString(2, "Kaeya");
			pstmt.setString(3, "Mondstadt");
			pstmt.setString(4, "cryo");
			pstmt.executeUpdate();
			
			pstmt.close();

			// select
			pstmt = con.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.println(rs.getInt("idCharacter") + " " + rs.getString("Name") + " " + rs.getString("City")
						+ " " + rs.getString("Vision"));
			}
			pstmt.close();

			// update
			pstmt = con.prepareStatement(sql3);	
			pstmt.setString(1, "electro");
			pstmt.setInt(2,1);
			pstmt.executeUpdate();
			
			

			





//			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (1, 'Kaeya', 'Mondstadt', 'cryo')");
//			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (2, 'Lisa', 'Mondstadt', 'electro')");
//			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (3, 'Jean', 'Mondstadt', 'anemo')");
//			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (4, 'Amber', 'Mondstadt', 'pyro')");
//
//			rs = stmt.executeQuery("select * from day8hw.character;");

		

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				//rs.close();
				pstmt.close();
				con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}


//	3) Write a program for calling a procedure.
//	4) Write a program for Resultset metadata and
//	Database metadata
//	5) Write a program for transaction management
//	6) Write a program for batch proceesing using
//	statement and prepared statement.

		}

	}
	

}
