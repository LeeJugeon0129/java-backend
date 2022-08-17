package projectA05;

public class projectA0521 {

	public static void main(String[] args) {
		int sum=0;
		
		//1~100까지 홀수의 합
		for(int i=1;i<=100;i=i+2) {
			sum= sum+i;
		}
		System.out.println("홀수의 합: "+sum);
		
		int sum1 = sum;
		sum=0;
		//0~100까지 짝수의 합     나머지연산 사용x
		for(int i=0;i<=100;i=i+2) {
			sum= sum+i;
		}
		System.out.println("짝수의 합: "+sum);
		
		System.out.println("0~100까지의 합: "+(sum1+sum));
	}

}
