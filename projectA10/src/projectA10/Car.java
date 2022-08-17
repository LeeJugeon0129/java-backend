package projectA10;

public class Car {
	//멤버 변수
	private String name;
	private String age;
	private String speed;
	
	//생성자
	public Car() {}
	
	public Car(String name) {
		this.name = name;
	}
	
	public Car(String name, String age) {
		this(name);
		this.age = age;
		this.speed = "200";
	}
	
	//getter setter 인 멤버 메소드
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getSpeed() {
		return speed;
	}

	public void setSpeed(String speed) {
		this.speed = speed;
	}
	
	public void Info() {
		System.out.println("+++++++++++++++++++");
		System.out.println("이름: "+this.name);
		System.out.println("연식: "+this.age);
		System.out.println("속도: "+this.speed);
		System.out.println("+++++++++++++++++++");
	}
}
