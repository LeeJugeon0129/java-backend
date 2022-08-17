package projectA04;

public class projectA0415 {

	public static void main(String[] args) {
		int a=1;
		int b=2;
		int c=2;
		int d=1;
		
		if((a+b) == (c+d)) {
			System.out.println("두 수의 합이 같다.");
		}else {
			System.out.println("두 수의 합이 같지 않다.");
		}
		
		//문자 비교
		if('A' == 'B') {
			System.out.println("같은 문자입니다.");
		}else if('A' == 'A') {
			System.out.println("같은 문자입니다.");
		}
//		if("test" == "test") { //문자열 비교의 잘못된 예
//			System.out.println("test");
//		}
		if("test".equals("test")) { //문자열 비교 = .equals()
			System.out.println("문자열이 같습니다.");
		}
		String str = "ABCE";
		if(str.equals("ABCE")) {
			System.out.println("문자열이 같습니다.");
		}
	}

}
