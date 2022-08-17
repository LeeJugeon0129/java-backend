package test03;

public class test0304 {

	public static void main(String[] args) {
		for(int i=1;i<=8;i++) {
			for(int j=1;j<=i+1;j++) {
				if(i==1 && j==1) {
					continue;
				}
				System.out.print(i);
			}
			System.out.println();
		}
	}

}
