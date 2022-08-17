package projectA04;

import java.util.Scanner;

public class projectA0410 {

	public static void main(String[] args) {
		/*
		 * 
		 */
		Scanner in = new Scanner(System.in); //new는 연산자. 키워드 아니다.
		System.out.println("정수를 입력하세요 : ");
		
		int number = in.nextInt();
		
		if(number%10==0) {
			System.out.println("10의 배수입니다.");
		}
		else {
			System.out.println("10의 배수가 아닙니다.");
		}
		in.close();
	}

}
