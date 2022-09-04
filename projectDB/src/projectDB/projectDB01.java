package projectDB;

//DB 연결해서 테이블 만들기

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectDB01 {

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String dbURL = "jdbc:mariadb://58.229.253.250:3306/student320";
		String dbID = "student320";
		String dbPassword = "1234!!";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword); //커넥션 생성
			String SQL = "CREATE TABLE if not exists ljg(id varchar(50),"
					+" userName varchar(50), "
					+" email varchar(50), "
					+" birthYear int(11))";
			pstmt = conn.prepareStatement(SQL);
			pstmt.execute();
			pstmt.close();
			conn.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
