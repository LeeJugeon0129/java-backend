package projectA08;

import java.util.Arrays;

public class projectA0801 {

	public static void main(String[] args) {
		int[][] intArray = {{1,2,3},{4,5,6}};
		int[][] intArray1 = new int[2][3];
		intArray1 = new int[][] {{1,2,3},{4,5,6}};
		
		System.out.println(Arrays.deepToString(intArray1));
		
		for(int i=0;i<intArray1.length;i++) {
			for(int j=0;j<intArray1[i].length;j++) {
				System.out.print(intArray1[i][j]+" ");
			}
			System.out.println();
		}
	}	
}
