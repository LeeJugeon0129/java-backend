package projectA12;

public class HankookTire extends Tire { //is a 관계
	//생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	@Override
	public boolean roll() {
		++accumalatedRotation;
		if(accumalatedRotation<maxRotation) {
			System.out.println(location+" HankookTire 수명: "+ (maxRotation-accumalatedRotation));
			return true;
		}else {
			System.out.println("*** "+ location+" HankookTire 펑크 ***");
			return false;
		}
	}

}
