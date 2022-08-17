package projectA05;

public class projectA0514 {

	public static void main(String[] args) {
		int sum1 = 0;//7의 배수의 합
		int sum2 = 0;//8의 배수의 합
		int sum3 = 0;//9의 배수의 합
		
		for(int i=0;i<=1000;i++) {
			if(i%7==0) {
				sum1 = sum1 +i;
			}if(i%8==0) {
				sum2 = sum2 +i;
			}if(i%9==0) {
				sum3 = sum3 +i;
			}
		}
		System.out.println("7의 배수의 합: "+ sum1);
		System.out.println("8의 배수의 합: "+ sum2);
		System.out.println("9의 배수의 합: "+ sum3);
	}

}
