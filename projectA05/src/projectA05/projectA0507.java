package projectA05;

public class projectA0507 {

	public static void main(String[] args) {
		for(int i=1; i<=9;i++) {
			System.out.printf("\n** %d단 **\n", i);
			for(int j=1;j<=9;j++) {
				System.out.printf("%d x %d = %d\n", i, j, i*j);
			}
		}
	}

}
