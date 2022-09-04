package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectDB02 {

	public static void main(String[] args) {
		Connection conn = null; //연결을 위한 것
		ResultSet rs = null; //결과를 받아오는 것
		PreparedStatement pstmt = null; //SQL을 전달하기 위한 것
		
		String dbURL = "jdbc:mariadb://58.229.253.250:3306/student320";
		String dbID = "student320";
		String dbPassword = "1234!!";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "CREATE TABLE if not exists ljgTable(id VARCHAR(50), "
					+ "userName VARCHAR(50), "
					+ "email VARCHAR(50), "
					+ "birthYear INT(11))";
			pstmt = conn.prepareStatement(SQL);
			pstmt.executeUpdate();
			pstmt.close();
			conn.close();			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
