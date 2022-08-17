package projectA13;

public class Outter {
	
	//java 7 이전
	public void method1(final int arg) {
		final int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
	//java 8 이후 - final 안해도 됨.
	public void method2(int arg) {
		int localVariable = 1;
		
		class Inner{
			public void method() {
				int result = arg + localVariable;
			}
		}
	}
}
