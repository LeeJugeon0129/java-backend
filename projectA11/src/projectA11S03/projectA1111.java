package projectA11S03;

class Shape{
	public void draw() {
		System.out.println("shape draw()");
	}
}
class Line extends Shape{
	public void draw() {
		System.out.println("Line draw()");
	}
}
class Rect extends Shape{
	@Override
	public void draw() {
		System.out.println("Rect draw()");
	}
}
class Circle extends Shape{
	@Override
	public void draw() {
		System.out.println("Circle draw()");
	}
}

public class projectA1111 {
	static void paint(Shape p) {
		p.draw();
	}
	
	
	public static void main(String[] args) {
		Line line = new Line();
		paint(line);
		paint(new Shape());		
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
		
//		Line line = new Line();
//		line.draw();
//		
//		Shape shape = new Shape();
//		shape.draw();
//		
//		shape = new Line();
//		shape.draw();
//		
//		shape = new Rect();
//		shape.draw();
		
//		Rect r1 = (Rect)new Shape(); //상위값은 하위로 변형할 수 없음.
//		r1.draw();
		
	}

}
