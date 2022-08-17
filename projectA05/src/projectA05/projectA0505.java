package projectA05;

public class projectA0505 {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=0;i<=100; System.out.print(i/*증가 전 실행*/), i++ /*System.out.print(i)(증가 후 실행됨)*/) {
			sum = sum + i;
		}
		System.out.println();
		System.out.println("결과는 : " + sum);
	}

}
