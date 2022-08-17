package projectA08;

import java.util.Arrays;

public class projectA0810 {

	public static void main(String[] args) {
		int[] A = {1,2,3,4,5};
		int[] B;
		B = A;
		System.out.println(Arrays.toString(A));
		
		B[0] = 99;
		System.out.println(Arrays.toString(A));
	}

}
