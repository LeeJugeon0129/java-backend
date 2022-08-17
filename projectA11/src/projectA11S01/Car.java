package projectA11S01;

public class Car {
	//인스턴스 멤버 변수
	public int speed;
	
	//인스턴스 멤버 메소드
	public void speedUp() {
		speed = speed + 1;
	}
	
	//final멤버 메소드 정의 -> 상속x
	public final void stop() {
		System.out.println("차를 멈춤");
		speed = 0;
	}
}
