package projectA06;

import java.util.Scanner;

public class projectA0608 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.println("명령문을 입력하세요: ");
			String input = in.nextLine();
			if(input.equals("exit")) {
				System.out.println("프로그램 종료");
				break;
			}
			if(input.equals("1count")) {
				for(int i=0;i<=100;i++) {
					System.out.print(i+" ");
				}
				System.out.println();
				System.out.println("실행했습니다.");
			}
			else if(input.equals("2count")) {
				int sum=0;
				for(int i=0;i<=200;i++) {
					sum=sum+i;
				}
				System.out.println("0부터 200까지의 합은: "+sum);
			}else if(input.equals("3count")) {
				System.out.println("실행");
				continue;//바로 조건으로 넘어감.
			}
			for(int i=1;i<=10;i++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}

}
