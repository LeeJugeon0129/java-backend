package test04;

import java.util.Scanner;

public class test0403 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		
		int a = in.nextInt();
		int b = in.nextInt();
		
		System.out.println("몫:"+a/b);
		System.out.println("나머지:"+a%b);
	
		in.close();
	}

}
