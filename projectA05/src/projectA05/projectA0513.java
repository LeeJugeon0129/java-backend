package projectA05;

public class projectA0513 {

	public static void main(String[] args) {
		int sum1 = 0;//5의 배수의 합
		int sum2 = 0;//10의 배수의 합
		int sum3 = 0;//11의 배수의 합
		
		for(int i=0;i<=100;i++) {
			if(i%5==0) {
				sum1 = sum1+i;
			}if(i%10==0) {
				sum2 = sum2+i;
			}if(i%11==0) {
				sum3 = sum3+i;
			}
		}
		System.out.println("5의 배수의 합: "+sum1);
		System.out.println("10의 배수의 합: "+sum2);
		System.out.println("11의 배수의 합: "+sum3); 	
	}

}
