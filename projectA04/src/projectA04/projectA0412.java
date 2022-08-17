package projectA04;

import java.util.Scanner;

public class projectA0412 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String grade;
		System.out.println("점수를 입력하시요(0~100) : ");
		
		int score = in.nextInt();
		
		if(score<=100 && score>=95) {
			grade = "A++";
		}else if(score<95 && score>=90) {
			grade = "A";
		}else if(score<90 && score>=85) {
			grade="B++";
		}else if(score<85 && score>=80) {
			grade="B";
		}else if(score<80 && score>=75) {
			grade="C++";
		}else if(score<75 && score>=70) {
			grade="C";
		}else if(score<70 && score>=65) {
			grade="D++";
		}else if(score<65 && score>=60) {
			grade="D";
		}else {
			grade = "F";
		}
		System.out.println("학점은 "+grade+"입니다.");
		in.close();
	}

}
