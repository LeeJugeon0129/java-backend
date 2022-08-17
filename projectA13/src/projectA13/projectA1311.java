package projectA13;

public class projectA1311 {

	public static void main(String[] args) {
		int n = 10;
		Integer intObject = n; //auto boxing
		
		System.out.println(intObject);
		
		int m = intObject + 10; //auto unboxing
		System.out.println(m);
		
		Float fObject = 3.14f;
		float f = fObject + 4.14f;
		System.out.println(f);
	}

}
