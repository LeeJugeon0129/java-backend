package projectA15;

public class projectA1510q {

static class Point1{ //static?
	private int x,y;
	public void set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("("+x+","+y+")");
	}
}
static class ColorPoint1 extends Point1{ //static?
	private String color;
	public void setColor(String color) {
		this.color = color;
	}
		public void showColorPoint() {
			System.out.print(color);
			showPoint();
		
	}
}
public class ColorPointEx{
	public static void main(String[] args) {
		Point1 p = new Point1();
		p.set(1, 2);
		p.showPoint();
		
		ColorPoint1 cp = new ColorPoint1();
		cp.set(3, 4);
		cp.setColor("red");
		cp.showColorPoint();
	}
}
}


