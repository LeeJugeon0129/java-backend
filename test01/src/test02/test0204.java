package test02;

public class test0204 {

	public static void main(String[] args) {
		for(int i=2;i<10;i++) {
			for(int j=1;j<=i;j++) {
				if(i==2 && j==2) {
					continue;
				}
				System.out.print(j);
			}
			System.out.println();
		}
		
	}

}
