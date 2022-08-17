package test03;

import java.util.Scanner;

public class test0302 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		long x = in.nextLong();
		
		
		for(int i=1;i<=10;i++) {
			
			
			long y = x%10;
			x = x/10;
			System.out.println(y*8);
			
			
		}
		
	}

}
