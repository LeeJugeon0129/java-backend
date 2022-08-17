package test03;

import java.util.Scanner;

public class test0301 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int sum=0;
		
		System.out.println("정수를 입력해주세요: ");
		int x = in.nextInt();
		for(int i=1;i<=500;i++) {
			if(i%x==0) {
				sum = sum+i;
			}
		}
		System.out.println("1부터 500까지 "+x+"의 배수의 합: "+sum);
		
	}

}
