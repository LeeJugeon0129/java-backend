package test02;

public class test0202 {

	public static void main(String[] args) {
		int sum = 1;
		for(int i=1;i<=500;i++) {
			if(i%2!=0) {
				sum = sum*i;
			}
		}
		System.out.println("500까지 홀수의 곱: "+ sum);
	}

}
