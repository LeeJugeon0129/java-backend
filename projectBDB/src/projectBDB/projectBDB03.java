package projectBDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.DriverManager;

public class projectBDB03 {

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
			
			String SQL = "CREATE TABLE projecttable ( "
					+ "	id INT, "
					+ "	projectname VARCHAR(255), "
					+ "	projectday INT, "
					+ "	projectcontent VARCHAR(4000) "
					+ ")";
			pstmt = conn.prepareStatement(SQL);
			int result = pstmt.executeUpdate();
			System.out.println("결과: "+ result);
			
			pstmt.close();
			conn.close();
		}catch (Exception e) {
			e.printStackTrace();
		}
		
	}

}
