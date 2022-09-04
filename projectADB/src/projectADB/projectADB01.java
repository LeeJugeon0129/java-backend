package projectADB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectADB01 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mariadb://localhost:3306/user";
		String dbID = "user";
		String dbPassword = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "CREATE TABLE useratable ( "
					+ "	userName VARCHAR(50), "
					+ "	userTel VARCHAR(50), "
					+ "	userAddress VARCHAR(255) "
					+ ")";
			pstmt = conn.prepareStatement(SQL);
			int result = pstmt.executeUpdate();
			System.out.println("테이블이 생성되었습니다.");
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
