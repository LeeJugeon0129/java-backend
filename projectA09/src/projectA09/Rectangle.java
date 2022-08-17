package projectA09;

public class Rectangle { //생성자x -> 디폴트값으로 저절로 생김
	//필드 멤버변수
	int width;
	int height;
	
	//멤버 메소드, 면적 구하기
	public int getArea() {
		return this.width * this.height;
	}
}
