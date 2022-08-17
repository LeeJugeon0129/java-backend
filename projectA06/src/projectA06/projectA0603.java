package projectA06;

public class projectA0603 {

	public static void main(String[] args) {
		int i=0;
		
		while(i<10) {
			System.out.print(i+" ");
			i++;
		}
		System.out.println();
		int ia=0;
		while(true) {
//			System.out.print(ia+" "); //0~100
			if(ia==100) {
				break;
			}
			System.out.print(ia+" ");//0~99
			ia++;
		}
		System.out.println();
		
	}

}
