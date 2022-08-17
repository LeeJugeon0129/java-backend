package test01;

public class test0102 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i=i+2) {
			for(int j=8;j>i-1;j=j-2) {
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=1;i<10;i=i+2) {
			for(int j=1;j<=i;j=j+2) {
				System.out.print(" ");
			}
			for(int k=8;k>i;k--) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		
	}

}
