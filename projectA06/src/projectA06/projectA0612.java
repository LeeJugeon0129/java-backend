package projectA06;

import java.util.Scanner;

public class projectA0612 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		
		int n = Integer.parseInt(in.nextLine());
		int sum=0;
		int count=0;
		
		while(n!=-1) {
			sum=sum+n;
			count++;
			n=Integer.parseInt(in.nextLine());
			
		}
		System.out.println("입력받은 숫자의 갯수는: "+count);
		System.out.println("입력받은 숫자의 합은: "+sum);
	}

}
