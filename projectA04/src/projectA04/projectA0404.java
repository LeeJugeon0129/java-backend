package projectA04;

import java.util.Scanner;

public class projectA0404 {

	public static void main(String[] args) {
		System.out.println("5의 배수를 입력하세요.");
		
		Scanner in = new Scanner(System.in);
		
		int n= in.nextInt();
		
		if(n%5==0) {
			System.out.println("5의 배수입니다.");
		}else {
			System.out.println("5의 배수가 아닙니다.");
		}
		in.close();
	}

}
