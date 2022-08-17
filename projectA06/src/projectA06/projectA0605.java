package projectA06;

public class projectA0605 {

	public static void main(String[] args) {
		int i;
		int j;
		i=2;
		j=1;
		while(i<10) {
			while(j<10) {
				System.out.println(i+"x"+j+"="+(i*j));
				j++;
			}
			System.out.println();
			i++;
			j=1;
		}
	}

}
