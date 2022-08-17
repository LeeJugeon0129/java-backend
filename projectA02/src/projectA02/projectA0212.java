package projectA02;

import java.util.Scanner;

public class projectA0212 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("이름 입력 : ");
		String name = in.nextLine();
		
		System.out.println("나이 입력 : ");
		String age = in.nextLine();
		
		System.out.println("사는 곳 : ");
		String place = in.nextLine();
		
		System.out.println("이름: "+name+"\n나이: "+age+"\n사는 곳: "+place);
	}

}
