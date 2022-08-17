package projectA05;

public class projectA0511 {

	public static void main(String[] args) {
		int sum1 = 0;//짝수 합
		int sum2 = 0;//홀수 합
		for(int i=1;i<=100;i++) {
			if(i%2==0) {
				sum1 = sum1 + i;
			}
			else {
				sum2 = sum2 + i;
			}
		}
		System.out.println("짝수 합: "+sum1);
		System.out.println("홀수 합: "+sum2);
		
		sum1 = 0;
		for(int i=0;i<101;i=i+2) {//짝수
			sum1 = sum1 + i;
		}
		sum2 = 0;
		for(int i=1;i<101;i=i+2) {//홀수
			sum2 = sum2 + i;
		}
		System.out.println("짝수 합: "+sum1);
		System.out.println("홀수 합: "+sum2);
	}
}
