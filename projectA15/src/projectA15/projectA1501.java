package projectA15;

public class projectA1501 {

	//상속 --> 실행시킬 때 예외 처리해줘야함.
	public void FindName() throws Exception {
		throw new Exception("이름을 찾을 수 없습니다.");
	}
	
	public static void main(String[] args) {
		try {
			int i = 10/0;
			
		}catch(ArithmeticException e) {
			System.out.println("예외 처리");
		}
	}

}
