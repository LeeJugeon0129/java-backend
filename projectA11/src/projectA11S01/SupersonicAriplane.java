package projectA11S01;

public class SupersonicAriplane extends Airplane{ //is a 관계
	public static final int NORMAL=1; //final : 상수화
	public static final int SUPERSONIC=2;
	
	public int flyMode = NORMAL;
	
	@Override
	public void fly() {
		if(this.flyMode == SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			super.fly();
		}
	}
	@Override
	public void takeOff() {
		System.out.println("초음속비행 이륙");
	}
	@Override
	public void land() {
		System.out.println("초음속비행 착륙");
	}
	
}
