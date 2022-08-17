package projectA04;

import java.util.Scanner;

public class projectA0420 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("무슨 커피를 드릴까요?");
		
		int price = 0;
		String order = in.next();
		switch(order) {
		case "에스프레소":
		case "카푸치노":
		case "카페라떼":
			price = 3500;
			break;
		case "아메리카노":
			price = 2000;
			break;
		default:
			System.out.println("메뉴에 없습니다.");
			break;
		}
		if(price != 0) {
			System.out.println(order+"는 "+price+"원입니다.");
		}
		in.close();
	}

}
