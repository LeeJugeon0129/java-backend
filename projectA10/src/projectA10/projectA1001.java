package projectA10;

public class projectA1001 {

	public static void main(String[] args) {
		//인스턴스화
		Circle bendeddk = new Circle(10, "빈대떡"); //생성자 호출
		
		//멤버 메소드를 호출해서 크기를 구함
		double area = bendeddk.getArea();
		System.out.println(bendeddk.name+"의 면적은 "+area);
		System.out.println(bendeddk.name+"의 면적은 "+bendeddk.getArea());
		
		//인스턴스화
		Circle pizza = new Circle(20,"새우피자"); //생성자를 호출
		
		//멤버 메소드를 호출해서 크기를 구함
		double area_pizza = pizza.getArea();
		System.out.println(pizza.name+"의 면적은 "+area_pizza);
		
		//클래스 변수 사용
//		Circle.name = "고래피자"; //Circle 클래스에서 static String name이라고 지정했을 때
		
	}

}
