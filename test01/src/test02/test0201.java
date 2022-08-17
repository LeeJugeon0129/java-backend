package test02;

public class test0201 {

	public static void main(String[] args) {
		int sum=0;
		for(int i=1;i<=300;i++) {
			if(i%2!=0) {
				sum = sum+i;
			}
		}
		System.out.println("300까지 홀수의 합: "+ sum);
	}

}
