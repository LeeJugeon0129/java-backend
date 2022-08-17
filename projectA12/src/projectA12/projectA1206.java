package projectA12;

public class projectA1206 {

	public static void main(String[] args) {
//		IFControl remocon = new SmartTelevision();
		
		RemoteControl rc = new SmartTelevision();
		Searchable sc = new SmartTelevision();
		rc.turnOn();
		rc.setVolume(9);
		rc.turnOff();
		sc.search("http://www.naver.com");
		
		IFControl ifc = new SmartTV();
		ifc.turnOn();
		ifc.setVolume(10);
		ifc.turnOff();
		
	}

}
