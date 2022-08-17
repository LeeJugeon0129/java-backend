package projectA04;

import java.util.Scanner;

public class projectA0409 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("수를 입력하시오 : ");
		
		int number = in.nextInt();
		
		if(number%3==0) {
			System.out.println("3의 배수입니다.");
			if(number%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}else {
			System.out.println("3의 배수가 아닙니다.");
			if(number%2==0) {
				System.out.println("짝수입니다.");
			}else {
				System.out.println("홀수입니다.");
			}
		}
		in.close();
	}

}
