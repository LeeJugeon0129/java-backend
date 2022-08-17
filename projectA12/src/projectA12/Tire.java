package projectA12;

public class Tire {
	//인스턴스 멤버 변수
	public int maxRotation;//최대 회전수(최대 수명)
	public int accumalatedRotation;//누적 회전 수
	public String location;
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	public boolean roll() {
		++accumalatedRotation;
		if(accumalatedRotation < maxRotation) {
			System.out.println(location+" Tire 수명: "+ (maxRotation-accumalatedRotation));
			return true;
		}else {
			System.out.println("*** "+ location+" Tire 펑크 ***");
			return false;
		}
	}
}
