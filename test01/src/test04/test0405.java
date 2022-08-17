package test04;

public class test0405 {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			System.out.print("1");
			for(int j=1;j<=i*2;j++) {
				System.out.print("0");
			}
			System.out.print(i);
			System.out.println();
		}
	}

}
