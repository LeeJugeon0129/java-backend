package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class projectDB09 {

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String dbURL = "jdbc:mariadb://58.229.253.250:3306/student320"; // 드라이브 종류:데이터베이스 종류://주소/데이터베이스 이름
		String dbID = "student320";
		String dbPassword = "1234!!";
		
		try {
			Scanner in = new Scanner(System.in);
			System.out.println("검색할 책의 이름은 : "); //ex> 축구 --> %축구%
			String bookname = in.nextLine();
			
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL = "SELECT bookname, price " //띄어쓰기 안 하면 에러남
					+ " FROM Book "
					+ " WHERE bookname LIKE ? "; //띄어쓰기 안 하면 에러남
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, "%"+bookname+"%"); //ex> 축구 --> %축구%
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println("--------------------------");
				System.out.println("bookname: "+rs.getString("bookname")); //컬럼 지정 가능
				System.out.println("price: "+rs.getInt("price"));
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
