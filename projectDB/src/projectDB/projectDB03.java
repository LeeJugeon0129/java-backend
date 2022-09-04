package projectDB;

//테이블에 데이터 추가하기

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class projectDB03 {

	public static void main(String[] args) {
		Connection conn = null; //연결을 위한 것
		ResultSet rs = null; //결과를 받아오는 것
		PreparedStatement pstmt = null; //SQL을 전달하기 위한 것
		
		String dbURL = "jdbc:mariadb://58.229.253.250:3306/student320";
		String dbID = "student320";
		String dbPassword = "1234!!";
		
		try {
			Class.forName("org.mariadb.jdbc.Driver");
			conn = DriverManager.getConnection(dbURL, dbID, dbPassword);
			for(int i=0;i<5;i++) { //5명의 데이터 추가
				Scanner in = new Scanner(System.in);
				System.out.println("이름을 입력하세요: ");
				String name = in.nextLine();
				System.out.println("이메일을 입력하세요: ");
				String email = in.nextLine();
				System.out.println("출생년도를 입력하세요: ");
				String year = in.nextLine();
				int birthYear = Integer.parseInt(year);
				
				String SQL = "INSERT INTO ljgTable(userName, email, birthYear) VALUES(?,?,?)";
				pstmt = conn.prepareStatement(SQL); //문장 전달
				pstmt.setString(1, name); // ? 첫번째
				pstmt.setString(2, email); // ? 두번째
				pstmt.setInt(3, birthYear); // ? 세번째
				int result = pstmt.executeUpdate(); //executeUpdate 메서드는 데이터를 추가(Insert), 삭제(Delete), 수정(Update)하는 SQL 문을 실행합니다.
													//메서드의 반환 값은 해당 SQL 문 실행에 영향을 받는 행 수를 반환합니다.
				System.out.println("결과는 :"+result);
			}
		}catch (Exception e) {
			e.printStackTrace();
		}
	}

}
