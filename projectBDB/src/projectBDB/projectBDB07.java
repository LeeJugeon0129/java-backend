package projectBDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class projectBDB07 {

	public static void main(String[] args) {
		Connection conn = null;
		ResultSet rs = null;
		PreparedStatement pstmt = null;
		
		String dbURL = "jdbc:mariadb://127.0.0.1:3306/user";
		String dbID = "user";
		String dbPassword = "123456";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
//			String SQL = "SELECT * "
//					+ "FROM book "
//					+ "WHERE price BETWEEN ? AND ?";
			String SQL = "SELECT * "
					+ "FROM book "
					+ "WHERE publisher IN (?,?)";
			
			pstmt = conn.prepareStatement(SQL);
//			pstmt.setInt(1, 7000);
//			pstmt.setInt(2, 20000);
			pstmt.setString(1, "굿스포츠");
			pstmt.setString(2, "대한미디어");
			
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println("-------------------");
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
			}
			pstmt.close();
			conn.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
