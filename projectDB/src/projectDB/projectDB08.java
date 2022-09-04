package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectDB08 {

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
			String SQL = "SELECT bookname, publisher " //띄어쓰기 안 하면 에러남
					+ "FROM Book " //띄어쓰기 안 하면 에러남
					+ "WHERE price >= 10000 ";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("--------------------------");
				System.out.println("bookname: "+rs.getString("bookname")); //컬럼 지정 가능
				System.out.println("publisher: "+rs.getString("publisher"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}

}
