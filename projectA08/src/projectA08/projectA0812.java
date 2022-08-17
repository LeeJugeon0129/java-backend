package projectA08;

import java.util.Arrays;

public class projectA0812 {

	public static void main(String[] args) {
		int[][] A= {
				{1,2,3,4,5},
				{6,7,8,9,10}
		};
//		int[][] B=A; //xxxxx
//		int[][] B=A.clone(); //xxxxx 1차원일 때는 o, 2차원일 때는 x
		
		System.out.println(Arrays.deepToString(A));
		
//		B[0][0] = 999;
//		System.out.println(Arrays.deepToString(A));
//		System.out.println(Arrays.deepToString(B));
		
		int[][] C = new int[A.length][A[0].length];
		
		for(int i=0;i<A.length;i++) {
			System.arraycopy(A[i], 0, C[i], 0, C[i].length); //배열 복사
		}
		
		C[0][0] = 777;
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(C));
		
		int[][] D = new int[2][];
		
		for(int i=0;i<A.length;i++) { //배열 복사
			D[i] = new int[A[i].length];
			for(int j=0; j<A[i].length;j++) {
				D[i][j] = A[i][j];
			}
		}
		D[0][0] = 888;
		System.out.println(Arrays.deepToString(A));
		System.out.println(Arrays.deepToString(D));
	}

}
