package projectA14;

public class projectA1407 {

	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("java.lang.String2"); //없는 클래스 호출 -> 예외
		}catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}finally {
			System.out.println("다시 확인하고 실행해주세요.");
		}
	}

}
