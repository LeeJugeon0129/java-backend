package package2;

import package1.A;

public class D extends A{
	
	public D() {
		super(); //A 호출됨
		this.field = "D value";
		this.method();
	}
	
}
