package projectA13;

public class AAAA {
	int field1;
	void method1() {
	}
	
	static int field2;
	static void method2() {
	}
	
	class BBBB{
		void method() {
			field1 = 10;
			method1();
			
			field2 = 20;
			method2();
		}
	}
	static class CCCC{
		void method() {
			field2 = 10; //static만 사용할 수 있다.
			method2();
		}
	}
}
