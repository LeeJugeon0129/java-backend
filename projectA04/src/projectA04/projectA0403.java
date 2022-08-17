package projectA04;

import java.util.Scanner;

public class projectA0403 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("5를 입력하세요.");
		int n = in.nextInt();
		
		if(n == 5) {
			System.out.println("5입니다.");
		}
		System.out.println("기타입니다.");
		
		if(n==3) {
			System.out.println("3입니다.");
		}
		System.out.println("기타입니다.");
		in.close();
	}

}
