package day8_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
//import com.mysql.cj.jdbc.Driver;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		1) Write a program for statement for doing
//	below operations
//	insert
//	select
//	Update

		Connection con = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
	
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/day8hw", "root", "root");
			stmt = con.createStatement();

			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (1, 'Kaeya', 'Mondstadt', 'cryo')");
			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (2, 'Lisa', 'Mondstadt', 'electro')");
			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (3, 'Jean', 'Mondstadt', 'anemo')");
			stmt.executeUpdate("INSERT INTO day8hw.character VALUES (4, 'Amber', 'Mondstadt', 'pyro')");

			rs = stmt.executeQuery("select * from day8hw.character;");

			while (rs.next()) {
				System.out.println(rs.getInt("idCharacter") + " " + rs.getString("Name") + " " + rs.getString("City")
						+ " " + rs.getString("Vision"));
			}

			stmt.executeUpdate("UPDATE day8hw.character SET vision = 'cryo' WHERE idCharacter = 4");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();

			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}
}
