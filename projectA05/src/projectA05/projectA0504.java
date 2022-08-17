package projectA05;

public class projectA0504 {

	public static void main(String[] args) {
		for(int i=0;i<10;i++) { //i : for문 안에서만 사용 가능
			System.out.print(i+" ");
		}
		System.out.println();
		
		int j; //j : for문 밖에서도 사용 가능
		for(j=0;j<10;j++) {
			System.out.print(j+" ");
		}
		System.out.println();
		
		int sum=0;
		for(int i=0;i<=10;i++) {
			sum = sum+i;
		}
		System.out.println("0부터 10까지의 합: "+sum);
		
		sum = 0;
		for(int i=0;i<=100;i++) {
			sum = sum + i;
		}
		System.out.println("0부터 100까지의 합: "+sum);
		
		sum = 0;
		for(int i=0;i<=100;i++) {
			if(i==100) {
				System.out.print(i+"=");
			}else {
				System.out.print(i+"+");
			}
			sum = sum + i;
		}
		System.out.print(sum);
		System.out.println();
	}

}
