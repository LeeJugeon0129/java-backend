package projectA09S03;

public class Car {
	//멤버 변수
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	//디폴트 생성자
	Car(){
		
	}
	
	Car(String model){
		this(model,null,0);
	}
	Car(String model, String color){
		this(model, color, 0);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		
	}
	
}
