package projectA09;

import java.util.Scanner;

public class projectA0906 {

	public static void main(String[] args) {
		Rectangle rect = new Rectangle();
		
		Scanner in = new Scanner(System.in);
		System.out.print("면적 >> ");
		rect.width = Integer.parseInt(in.nextLine());
		System.out.print("높이 >> ");
		rect.height = Integer.parseInt(in.nextLine());
		
		System.out.println("사각형의 면적은 "+rect.getArea());
		
		in.close();
	}

}
