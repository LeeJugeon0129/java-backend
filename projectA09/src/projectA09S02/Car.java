package projectA09S02;

public class Car {
	//멤버 변수, 필드
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//디폴트 생성자
	//생성자의 오버로딩(overloading)                오버라이딩 = 재정의
	Car(){
		
	}
	
	Car(String model){
		this.model = model;
	}
	
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	//오버라이딩
//	@Override
//	public String toString() {
//		return super.toString();
//	}
}
