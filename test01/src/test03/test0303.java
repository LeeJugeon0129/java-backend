package test03;

import java.util.Scanner;

public class test0303 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int x = in.nextInt();
		int sum =0;
		
		for(int i=1;i<=100;i++) {
			if(i%x==0) {
				sum = sum+i;
			}
		}
		System.out.println("1~100까지 "+x+"의 배수 합 : "+sum);
		
		in.close();
	}

}
