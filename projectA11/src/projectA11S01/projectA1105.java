package projectA11S01;

public class projectA1105 {

	public static void main(String[] args) {
		int r = 10;
		
		Calculator calculator = new Calculator();
		System.out.println("원의 면적: "+calculator.areaCircle(r));
		System.out.println();
		
		Computer computer = new Computer();
		System.out.println("원의 면적: "+computer.areaCircle(r));
		System.out.println();
		
	}

}
