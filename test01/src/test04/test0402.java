package test04;

public class test0402 {

	public static void main(String[] args) {
		float x = 0.1f;
		float sum = 0.0f;
		
		for(int i=1;i<=1000;i++) {
			x = x + 0.1f;
			sum = sum + x;
		}
		System.out.printf("%.1f\n", x);
		System.out.printf("%.1f\n", sum);
	}

}
