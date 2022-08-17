package projectA10;

import java.util.Scanner;

public class App1 {

	public static void main(String[] args) {
		//인스턴스화 배열로 생성
		Student[] students = new Student[5]; //객체 배열
		
		//표준입력으로 입력을 받기 위해 생성
		Scanner in = new Scanner(System.in);
		
		for(int i=0;i<students.length;i++) {
			//인스턴스화
			students[i] = new Student();
			
			System.out.println("이름: ");
			//한줄을 입력 받음
			String name = in.nextLine();
			//입력받은 값을 멤버 메소드를 사용하여 설정한다: 이름 지정
			students[i].setName(name);
			
			System.out.println("국어점수: ");
			String kor = in.nextLine();
			//입력받은 값을 멤버 메소드를 사용하여 설정한다: 국어점수 지정
			students[i].setKor(Integer.parseInt(kor));
			
			System.out.println("영어점수: ");
			String eng = in.nextLine();
			//배열의 인스턴스 변수를 선언하여 인스턴스 멤버 메소드를 사용하여 영어 점수를 설정한다
			students[i].setEng(Integer.parseInt(eng));
			
			System.out.println("수학점수: ");
			String math = in.nextLine();
			//인스턴스 변수를 사용하여 인스턴스 멤버 메소드를 호출하여 수학 점수를 설정한다.
			students[i].setMath(Integer.parseInt(math));
		}
		
		for(int i=0;i<students.length;i++) {
			System.out.println("이름: "+students[i].getName()); //인스턴스 멤버 메소드를 사용하여 이름을 가지고 온다.
			System.out.println("국어점수: "+students[i].getKor()); //인스턴스 멤버 메소드를 사용하여 국어점수를 가지고 온다.
			System.out.println("영어점수: "+students[i].getEng()); //인스턴스 멤버 메소드를 사용하여 영어점수를 가지고 온다.
			System.out.println("수학점수: "+students[i].getMath()); //인스턴스 멤버 메소드를 사용하여 수학점수를 가지고 온다.
		}
		
		
	}

}
