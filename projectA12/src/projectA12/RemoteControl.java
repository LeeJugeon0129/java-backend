package projectA12;

public interface RemoteControl {
	//상수
	int MAX_VOLUME = 10;
	int MIN_VOLUME = 0;
	
	/*abstract* 인터페이스는 생략가능*/ void turnOn();
	/*abstract* 추상메소드*/ void turnOff();
	void setVolume(int volume);
	
	default void setMute(boolean mute) {
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	static void chargeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
