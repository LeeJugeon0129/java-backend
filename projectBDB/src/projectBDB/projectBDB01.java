package projectBDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class projectBDB01 {

	public static void main(String[] args) {
		Connection conn =null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String dbURL = "jdbc:mariadb://127.0.0.1:3306/user";
		String dbID = "user";
		String dbPassword = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "SELECT DISTINCT publisher AS pub FROM book";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString(1)+" "+rs.getString("pub"));
				System.out.println();
			}
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		}catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

}
