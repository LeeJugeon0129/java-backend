package projectA12;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	//인스턴스 멤버 메소드
	@Override
	public boolean roll() {
		++accumalatedRotation;
		if(accumalatedRotation<maxRotation) {
			System.out.println(location+" KumhoTire 수명: "+ (maxRotation-accumalatedRotation));
			return true;
		}else {
			System.out.println("*** "+ location+" KumhoTire 펑크 ***");
			return false;
		}
	}
}
