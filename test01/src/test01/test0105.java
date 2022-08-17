package test01;

public class test0105 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i=i+2) {
			for(int j=12;j>i-1;j=j-2) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
