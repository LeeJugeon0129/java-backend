package projectA02;

public class projectA0203 {

	public static void main(String[] args) {
		int sum = 10+20; //int + int
		int value = 10; //int->int
		
		int value1 = sum + value; //int + int
		System.out.println(value1);
		
		long sum1 = (long)(10L+10L+10L+10L+10L+10L+10L+10L+2147483648L);
		long sum2 = (long)(10+10+10+10+10+10+10+10+2147483647); //int + int = int, int범위를 넘어도 저장이 된다, 오버플로우
		long sum3 = (long)(10L+10L+10L+10+10+10+10+10+2147483647); //int + long = long
		long sum4 = (long)(2147483647+10L+10L+10L+10+10+10+10+10);
		int sum5 = (10+10+10+10+10+10+10+10+2147483647); //int범위를 넘어도 저장이 된다, 오버플로우
		
		System.out.println("sum1: "+ sum1);
		System.out.println("sum2: "+ sum2);
		System.out.println("sum3: "+ sum3);
		System.out.println("sum4: "+ sum4);
		System.out.println("sum5: "+ sum5);
		
		
		
		
	}

}
