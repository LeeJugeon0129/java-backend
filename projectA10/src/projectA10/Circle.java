package projectA10;

public class Circle {
	//멤버 변수
	int radius;
	/*static*/ String name;
	
	public Circle() {//디폴트 생성자
		this.radius = 1;
		this.name = "";
	}
	public Circle(int r, String n) {//생성자 파라미터 2개인 생성자
		this.radius = r;
		this.name = n;
	}
	//멤버 메소드
	public double getArea() {
		return 3.14*radius*radius;
	}
	
	public static void main(String[] args) {
		//인스턴스화
		Circle pizza = new Circle(10,"페페로니아피자");//생성자 호출
		
		//멤버 메소드 호출
		double area = pizza.getArea();//면적을 구함
		System.out.println(pizza.name+"의 면적은 "+area);
		
		Circle donut = new Circle(); //default 생성자 호출
		donut.name = "도넛피자";
		
		//멤버 메소드 호출
		area = donut.getArea();//면적을 구함
		System.out.println(donut.name+"의 면적은 "+area);
	}

}
