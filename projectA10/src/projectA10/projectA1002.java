package projectA10;

class ACircle{
	int radius;
	
	//생성자
	public ACircle(int radius) {
		this.radius = radius;
	}
	//멤버 메소드
	public void setRadius(int radius) {
		this.radius = radius;
	}
}


public class projectA1002 {

	public static void main(String[] args) {
		ACircle ob1 = new ACircle(1);
		ACircle ob2 = new ACircle(2);
		ACircle ob3 = new ACircle(3);
		
		System.out.println("ob1.radius = "+ob1.radius+" ob2.radius = "+ob2.radius+" ob3.radius = "+ob3.radius);
		
		ob1.setRadius(4);
		ob2.setRadius(5);
		ob3.setRadius(6);
		
		System.out.println("ob1.radius = "+ob1.radius+" ob2.radius = "+ob2.radius+" ob3.radius = "+ob3.radius);
		
	}

}
