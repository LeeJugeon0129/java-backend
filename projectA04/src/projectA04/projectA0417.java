package projectA04;

import java.util.Scanner;

public class projectA0417 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String input = in.nextLine();
		switch(input) {
		case "처음":
			System.out.println("처음");
			break;
		case "두번째":
			System.out.println("두번째");
			break;
		case "세번째":
			System.out.println("세번째");
			break;
		case "네번째":
			System.out.println("네번째");
			break;
		default:
			System.out.println("다시 입력하세요");
			break;
		}
		in.close();
	}

}
