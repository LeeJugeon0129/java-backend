package projectA08;

public class projectA0815 {

	static Object[] makeObj() {
		Object[] obj = new Object[5];
		
		obj[0] = 10;
		obj[1] = 3.14;
		obj[2] = "Java";
		obj[3] = 1000;
		obj[4] = new String("Programming");
		
		return obj;
	}
	
	public static void main(String[] args) {
		Object[] obj = makeObj();
		
		int intValue = (int)obj[0];
		double doubleValue = (double)obj[1];
		String str1 = (String)obj[2];
		int intValue2 = (int)obj[3];
		String str2 = (String)obj[4];
		
		System.out.println(intValue+" "+doubleValue+" "+str1+" "+intValue2+" "+str2);
	}

}
