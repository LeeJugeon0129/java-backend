package projectA04;

import java.util.Scanner;

public class projectA0419 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("첫번째 수를 입력하세요 : ");
		int a=in.nextInt();
		System.out.println("두번째 수를 입력하세요 : ");
		int b=in.nextInt();
		
		switch((a+b)/10) {
		case 1:
			System.out.println("기초 단위 입니다.");
			break;
		case 2:
			System.out.println("A단위입니다.");
			break;
		case 3:
			System.out.println("A+단위입니다.");
			break;
		case 4:
			System.out.println("A++단위입니다.");
			break;
		case 5:
			System.out.println("A+++단위입니다.");
			break;
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
			System.out.println("A++++단위입니다.");
			break;
		default:
			System.out.println("단위가 없는 것이군요.");
			break;		
		}
		in.close();
	}

}
