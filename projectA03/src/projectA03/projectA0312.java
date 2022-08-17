package projectA03;

import java.util.Scanner;

public class projectA0312 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수를 입력하세요: ");
		int time = in.nextInt();
		
		int second = time/60;
		int minute = (time/60)%60;
		int hour = (time/60)/60;
		
		System.out.println(time+"초는 ");
		System.out.println(hour+"시간 ");
		System.out.println(minute+"분, ");
		System.out.println(second+"초입니다.");
		
		in.close();//열어준 거는 항상 닫아주기
	}

}
