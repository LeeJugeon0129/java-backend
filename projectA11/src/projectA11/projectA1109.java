package projectA11;

public class projectA1109 {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child; //child의 인스턴스를 받음
		
		parent.method1();
		
		parent.method2();
		
//		parent.method3();
	}

}
