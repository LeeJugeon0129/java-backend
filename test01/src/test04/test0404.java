package test04;

public class test0404 {

	public static void main(String[] args) {
		for(int i=8;i>=1;i--) {
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
