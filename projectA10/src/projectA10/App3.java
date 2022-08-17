package projectA10;

import java.util.Scanner;

public class App3 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		Car[] carModel = new Car[5];
		
		int i=0;
		do {
			//인스턴스화
			carModel[i] = new Car();
			System.out.println("이름: ");
			String name = in.nextLine();
			
			System.out.println("연식: ");
			String age = in.nextLine();
			
			System.out.println("속도: ");
			String speed = in.nextLine();
			
			carModel[i].setName(name);
			carModel[i].setAge(age);
			carModel[i].setSpeed(speed);
			
			i++;
		}while(i<carModel.length);
		
		i=0;
		do {
			carModel[i].Info();
			i++;
		}while(i<carModel.length);
		
	}

}
