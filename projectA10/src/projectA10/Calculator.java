package projectA10;

public class Calculator {
	//인스턴스 멤버 변수 //인스턴스마다 각각 하나씩 따로 만들어짐
	int intValue = 0;
	
	//클래스 멤버 변수 //인스턴스마다 각각 따로 만들어지지 않고 하나만 만들어져서 공유됨.
	static double PI = 3.14159;
	static int sintValue = 0;
	
	//클래스 멤버 메소드
	public static int plus(int x, int y) {
		return x+y;
	}
	
	//클래스 멤버 메소드
	public static int minus(int x, int y) {
		return x-y;
	}
	
}
