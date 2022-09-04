package projectBDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class projectBDB06 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mariadb://127.0.0.1:3306/projectshow";
		String dbID = "user";
		String dbPassword = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "SELECT SUM(projectday) FROM projecttable";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
