package projectA06;

public class projectA0601 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=100;i=i+2) {
			sum = sum+i;
		}
		System.out.println("홀수의 합: "+sum);
		
		sum=0;
		for(int i=0;i<=100;i=i+2) {
			sum = sum+i;
		}
		System.out.println("짝수의 합: "+sum);
	}

}
