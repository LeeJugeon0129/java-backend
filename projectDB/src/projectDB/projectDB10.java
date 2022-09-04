package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectDB10 {

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
			String SQL = "SELECT bookid, bookname, publisher, price " //띄어쓰기 안 하면 에러남
					+ " FROM Book ";
			pstmt = conn.prepareStatement(SQL);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("--------------------------");
				System.out.println("bookid: "+rs.getInt(1)); //컬럼 번호 지정
				System.out.println("bookname: "+rs.getString(2));
				System.out.println("publisher: "+rs.getString(3));
				System.out.println("price: "+rs.getInt(4));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
