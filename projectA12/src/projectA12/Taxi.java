package projectA12;

public class Taxi extends Vehicle {
	@Override
	public void run() { //다형성
		System.out.println("택시가 달립니다.");
	}
}
