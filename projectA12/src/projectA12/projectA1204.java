package projectA12;

public class projectA1204 {
	
	static void Calculationsum(Calculator calc) {
		calc.add(5, 5);
	}

	public static void main(String[] args) {
		GoodCalc calc = new GoodCalc();
		System.out.println(calc.add(2, 3));
		System.out.println(calc.sub(2, 3));
		System.out.println(calc.avg(new int[] {1,2,3}));
		
		BadCalc bcalc = new BadCalc();
		System.out.println(bcalc.add(2, 3));
		System.out.println(bcalc.sub(2, 3));
		System.out.println(bcalc.avg(new int[] {1,2,3}));
		
		Calculator allCalc = new GoodCalc();
		System.out.println(allCalc.add(2, 3));
		System.out.println(allCalc.sub(2, 3));
		System.out.println(allCalc.avg(new int[] {1,2,3}));
		
		allCalc = new BadCalc();
		System.out.println(allCalc.add(2, 3));
		System.out.println(allCalc.sub(2, 3));
		System.out.println(allCalc.avg(new int[] {1,2,3}));
		
		Calculationsum(new GoodCalc());
		Calculationsum(new BadCalc());
	}

}
