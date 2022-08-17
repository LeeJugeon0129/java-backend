package projectA06;

import java.util.Scanner;

public class projectA0610 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		System.out.println("두수를 입력하세요: ");
		int num1 = in.nextInt();
		int num2 = in.nextInt();
		
		//두수 사이의 수를 출력하시오.
		int i=num1;
		while(i>=num1 && i<=num2) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		//두수 사이의 합
		int sum=0;
		i=num1;
		while(i>=num1 && i<=num2) {
			sum = sum+i;
			i++;
		}
		System.out.println("두수 사이의 합: "+sum);
		
		//두수 사이의 홀수의 합(1)
		i=num1;
		sum=0;
		while(i>=num1 && i<=num2) {
			if(i%2!=0) {
				sum = sum + i;
			}
			i++;
		}
		System.out.println("두수 사이의 홀수의 합: "+sum);
		
		//두수 사이의 짝수의 합
		i=num1;
		sum=0;
		while(i>=num1 && i<=num2) {
			if(i%2==0) {
				sum = sum+i;
			}
			i++;
		}
		System.out.println("두수 사이의 짝수의 합: "+sum);
		
		
		in.close();
	}
	

}
