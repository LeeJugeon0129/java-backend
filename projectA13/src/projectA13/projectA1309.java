package projectA13;

interface Calculatable{
	public int sum();
}
class GoodCals{
	private int field = 10;
	public void method(int...value) {
		
		Calculatable calc = new Calculatable() {
			public int sum() {
				int sum=0;
				for(int i:value) {
					sum = sum + i;
				}
				return sum+field;
			}
		};
		System.out.println(calc.sum());
	}
	public void method2(int[] value) {
		Calculatable calc = new Calculatable() {
			public int sum() {
				int sum=0;
				for(int i:value) {
					sum = sum + i;
				}
				return sum+field;
			}
		};
		System.out.println(calc.sum());
	}
}

public class projectA1309 {

	public static void main(String[] args) {
		GoodCals gcals = new GoodCals();
		gcals.method(1,2,3,4,5,6,7,8,9,10);
		gcals.method2(new int[] {1,2,3,4,5,6,7,8,9,10});
		
	}

}
