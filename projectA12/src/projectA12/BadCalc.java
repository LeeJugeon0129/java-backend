package projectA12;

public class BadCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b+100;
	}

	@Override
	public int sub(int a, int b) {
		return a-b-100;
	}

	@Override
	public double avg(int[] a) {
		int sum=0;
		for(int i:a) {
			sum = sum+i;
		}
		return (sum/a.length)/100;
	}

}
