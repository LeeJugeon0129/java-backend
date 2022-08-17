package projectA07;

import java.util.Scanner;

public class projectA0716 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int[] intArray = new int[5];
		int sum = 0;
		//5개의 정수를 입력받는다
		for(int i=0;i<intArray.length;i++) {
			System.out.println("정수를 입력하세요: ");
			intArray[i] = Integer.parseInt(in.nextLine());
		}
		//크기 비교
		int max = 0;
		for(int i=0;i<intArray.length;i++) {
			if(max<intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는: "+max);
	}

}
