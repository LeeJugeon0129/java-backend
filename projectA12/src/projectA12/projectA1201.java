package projectA12;

public class projectA1201 {

	public static void main(String[] args) {
		Driver driver = new Driver();
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		//다형성
		driver.drive(bus);
		driver.drive(taxi);
	}

}
