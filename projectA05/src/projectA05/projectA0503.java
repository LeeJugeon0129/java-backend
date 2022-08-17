package projectA05;

import java.util.Scanner;

public class projectA0503 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("메뉴를 입력하세요");
		System.out.println("1.아이스아메리카노, 2.얼그레이, 3.스무디");
		System.out.println("1,2,3 중에 입력하세요 : ");
		
		int menu = in.nextInt();
		
		switch(menu) {
		case 1:
			System.out.println("아이스아메리카노");
			break;
		case 2:
			System.out.println("얼그레이");
			break;
		case 3:
			System.out.println("스무디");
			break;
		default:
			System.out.println("메뉴에 없습니다.");
			break;
		}
		in.close();
	}

}
