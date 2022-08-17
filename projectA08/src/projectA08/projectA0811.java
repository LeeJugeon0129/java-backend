package projectA08;

import java.util.Arrays;

public class projectA0811 {

	public static void main(String[] args) {
		int[] A= {1,2,3,4,5};
		int[] B;
		
		System.out.println(Arrays.toString(A));
		
		B=A.clone();//A의 값을 복사해서 B에 할당
		B[0]=99;
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(B));
		
		int[] C= new int[10];
		
		System.arraycopy(A, 0, C, 0, A.length);
		System.out.println(Arrays.toString(A));
		System.out.println(Arrays.toString(C));
	}

}
