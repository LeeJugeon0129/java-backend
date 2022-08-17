package test02;

public class test0203 {

	public static void main(String[] args) {
		int sum1=0;
		int sum2=0;
		for(int i=1;i<=1000;i++) {
			if(i%2!=0) {
				sum1 = sum1 + i;
			}
			else if(i%2==0) {
				sum2 = sum2 + i;
			}
		}
		var sum3 = sum1 * sum2;
		System.out.println(sum1);
		System.out.println(sum2);
		System.out.println(sum3);
	}

}
