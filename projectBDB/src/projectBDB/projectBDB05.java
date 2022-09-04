package projectBDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;
import java.sql.DriverManager;

public class projectBDB05 {

	public static void main(String[] args) {
		System.out.println("검색할 프로젝트 명을 입력하세요: ");
		Scanner in = new Scanner(System.in);
		String searchText = in.nextLine();
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mariadb://127.0.0.1:3306/projectshow";
		String dbID = "user";
		String dbPassword = "123456";
		String SQL = "SELECT * FROM projecttable WHERE projectname LIKE ?";
				
		try {
			Class.forName("org.mariadb.jdbc.Driver"); //Class를 사용해서 Driver를 읽어옴.
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, searchText);
			rs = pstmt.executeQuery();
			
			System.out.println("검색한 결과");
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getInt(3));
				System.out.println(rs.getString(4));
				
			}
			pstmt.close();
			conn.close();
			in.close();

		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
