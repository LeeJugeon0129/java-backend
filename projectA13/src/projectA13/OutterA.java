package projectA13;

public class OutterA {
	String field = "OutterA-field";
	void method() {
		System.out.println();
	}
	class Nested{
		String field = "Nested-field"; //다른 클래스라서 같은 이름 가능
		void method() {
			System.out.println("Nested-method");
		}
		void print() {
			System.out.println(this.field);
			this.method();
			System.out.println(OutterA.this.field);
			OutterA.this.method();
			
		}
	}
}
