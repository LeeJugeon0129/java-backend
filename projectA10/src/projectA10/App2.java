package projectA10;

import java.util.Scanner;

public class App2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Person person1 = new Person("김태민");
		person1.Info();
		
		Person person2 = new Person("장길산",30,"산지기");
		person2.Info();
		
		Person[] personModel = new Person[10];
		int i=0;
		while(i<personModel.length) {
			//인스턴스화
			personModel[i] = new Person();
			
			//한줄을 입력받아 인스턴스 멤버 변수를 호출하여 값을 설정: 이름 지정
			System.out.println("이름: ");
			personModel[i].setName(in.nextLine());
			
			//한줄을 입력받아 인스턴스 멤버 변수를 호출하여 값을 설정: 나이 지정
			System.out.println("나이: ");
			personModel[i].setAge(Integer.parseInt(in.nextLine()));
			
			//한줄을 입력받아 인스턴스 멤버 변수를 호출하여 값을 설정: 직업 지정
			System.out.println("직업: ");
			personModel[i].setJob(in.nextLine());
					
			i++;
		}
		i=0;
		while(i<personModel.length) {
			personModel[i].Info();
			i++;
		}
	}

}
