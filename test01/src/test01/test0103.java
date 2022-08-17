package test01;

public class test0103 {

	public static void main(String[] args) {
		for(int i=1;i<10;i=i+2) {
			for(int j=1;j<=9-i;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<8;i=i+2) {
			for(int j=8;j>i;j--) {
				System.out.print("*");
			}
			for(int k=2;k<=i+2;k++) {
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
