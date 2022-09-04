package projectDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class projectDB14 {

	public static void main(String[] args) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		
		String dbURL = "jdbc:mariadb://58.229.253.250:3306/student320";
		String dbID = "student320";
		String dbPassword = "1234!!";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			String SQL ="SELECT * "
					+ " FROM Book "
					+ " WHERE price >= ? AND price <= ?";
			System.out.println("가격 정보를 입력하세요. ");
			Scanner in = new Scanner(System.in);
			System.out.println("첫번째 가격: ");
			String price1 = in.nextLine();
			System.out.println("두번째 가격: ");
			String price2 = in.nextLine();
			int iprice1 = Integer.parseInt(price1);
			int iprice2 = Integer.parseInt(price2);
			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setInt(1, iprice1);
			pstmt.setInt(2, iprice2);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getInt(1));
				System.out.println(rs.getString(2));
				System.out.println(rs.getString(3));
				System.out.println(rs.getInt(4));
				System.out.println();
			}
			pstmt.close();
			conn.close();
			in.close();
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
