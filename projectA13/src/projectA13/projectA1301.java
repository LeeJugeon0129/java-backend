package projectA13;

public class projectA1301 {

	public static void main(String[] args) {
		A a1 = new A();
		A.B b = a1.new B(); 
		b.field1 = 3;
		b.method1();
		
		A.C.field2 = 3;
		A.C.method2();
		
		A.C c1 = new A.C();
		c1.field1 = 3;
		c1.method1();
		
		
		
	}

}
