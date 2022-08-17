package projectA11;

public class ColorPoint extends Point {
	private String color; //점의 색을 지정
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public void showColorPoint() {
		System.out.print(this.color);
		showPoint();
	}
}
