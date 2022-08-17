package projectA11S01;

public class projectA1106 {

	public static void main(String[] args) {
		Airplane airplane = new Airplane();
		
		airplane.takeOff();
		airplane.fly();
		airplane.land();
		
		SupersonicAriplane sa = new SupersonicAriplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAriplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAriplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
