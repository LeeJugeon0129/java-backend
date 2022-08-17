package projectA12;

public class GoodCalc extends Calculator {

	@Override
	public int add(int a, int b) {
		return a+b;
	}

	@Override
	public int sub(int a, int b) {
		return a-b;
	}

	@Override
	public double avg(int[] a) {
		double sum = 0;
		for(int i=0;i<a.length;i++) {
			sum = sum + a[i];
		}
		
		return sum/a.length;
	}

}
