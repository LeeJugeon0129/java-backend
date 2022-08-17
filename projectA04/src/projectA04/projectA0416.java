package projectA04;

import java.util.Scanner;

public class projectA0416 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		char grade;
		System.out.println("점수를 입력하세요(0~100) : ");
		int score = in.nextInt();
		
		switch(score/10) {
		case 10://100
		case 9://99~90
			grade = 'A';
			break;
		case 8://89~80
			grade = 'B';
			break;
		case 7://79~70
			grade = 'C';
			break;
		case 6://69~60
			grade = 'D';
			break;
		default:
			grade = 'F';
			break;
		}
		System.out.println("학점은 "+grade+"입니다.");
		in.close();
	}

}
