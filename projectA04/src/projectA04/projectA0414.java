package projectA04;

import java.util.Scanner;

public class projectA0414 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String grade;
		System.out.println("점수를 입력하세요 : ");
		int num = in.nextInt();
		
		if(95<=num && num<=100) {
			grade = "A++";
		}else if(90<=num && num<95) {
			grade = "A";
		}else if(85<=num && num<90) {
			grade = "B++";
		}else if(80<=num && num<85) {
			grade = "B";
		}else {
			grade = "C";
		}
		System.out.println("점수는 "+grade+"입니다.");
		in.close();
	}

}
