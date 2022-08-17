package projectA12;

public class Bus extends Vehicle {
	@Override
	public void run() { //다형성
		System.out.println("버스가 달립니다.");
	}
}
