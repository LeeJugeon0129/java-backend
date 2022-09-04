package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectDB05 {

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String dbURL = "jdbc:mariadb://58.229.253.250:3306/student320"; // 드라이브 종류:데이터베이스 종류://주소/데이터베이스 이름
		String dbID = "student320";
		String dbPassword = "1234!!";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "INSERT INTO ljgTable1 (userName, email, money) VALUES(?,?,?)";
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "홍길동2");
			pstmt.setString(2, "test@test.com");
			pstmt.setDouble(3, 1000);
			int result = pstmt.executeUpdate();
			System.out.println("결과: "+result);
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
