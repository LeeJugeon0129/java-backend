package projectADB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectADB02 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mariadb://127.0.0.1:3306/user";
		String dbID = "user";
		String dbPassword = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "INSERT INTO useratable (userName, userTel, userAddress) VALUES('홍길동','010-1234-1234','부산시 북구');";
			String SQL1 = "INSERT INTO useratable (userName, userTel, userAddress) VALUES('홍길자','010-1223-1234','부산시 북구');";
			String SQL2 = "INSERT INTO useratable (userName, userTel, userAddress) VALUES('홍길남','010-1223-1234','부산시 북구');";
			pstmt = conn.prepareStatement(SQL);
			int result = pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(SQL1);
			result = pstmt.executeUpdate();
			
			pstmt = conn.prepareStatement(SQL2);
			result = pstmt.executeUpdate();
			
			
//			System.out.println("결과: "+result);
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
