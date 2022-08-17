package test01;

public class test0101 {

	public static void main(String[] args) {
		for(int i=1;i<10;i=i+2) {
			for(int j=1;j<i+1;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		for(int i=7;i>=1;i=i-2) {
			for(int j=i+1;j>1;j--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
