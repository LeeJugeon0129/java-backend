package test03;
//*****
public class test0305 {

	public static void main(String[] args) {
		for(int i=1;i<=9;i++) {
			if(i==2) {continue;}
			for(int j=1;j<=i;j++) {
				if(j%3==0) {
					System.out.print(0);
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		for(int i=8;i>=1;i--) {
			for(int j=1;j<=i;j++) {
				if(j%3==0) {
					System.out.print(0);
				}else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
	}

}
