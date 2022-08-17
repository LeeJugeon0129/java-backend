package projectA09;

public class projectA0903 {

	public static void main(String[] args) {
		//객체 생성, 인스턴스화, 객체화
		Car myCar = new Car();
		//필드 값 읽기
		System.out.println("제작회사: "+myCar.company);
		System.out.println("모델명: "+myCar.model);
		System.out.println("색상: "+myCar.color);
		System.out.println("최고 속도: "+myCar.maxSpeed);
		System.out.println("현재 속도: "+myCar.speed); //값 지정x -> 디폴트값 = 0
		
		//필드 값 변경
		myCar.speed = 60;
		System.out.println("수정된 속도: "+myCar.speed);
	}

}
