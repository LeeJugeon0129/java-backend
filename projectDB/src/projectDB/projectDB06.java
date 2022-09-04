package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectDB06 {

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
			String SQL = "SELECT * FROM ljgTable1";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("userName: "+rs.getString(1)); //컬럼은 1부터 시작
				System.out.println("email: "+rs.getString(2));
				System.out.println("money: "+rs.getDouble(3));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
