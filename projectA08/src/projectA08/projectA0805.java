package projectA08;

import java.util.Arrays;

public class projectA0805 {

	public static void main(String[] args) {
		int[][] intArray;
		
		intArray = new int[4][]; //비정형 배열
		intArray[0] = new int[1];
		intArray[1] = new int[2];
		intArray[2] = new int[3];
		intArray[3] = new int[4];
		
		intArray[0][0] = 10;
//		intArray[0][1] = 2; //안됨
		
		intArray[1][0] = 21;
		intArray[1][1] = 22;
//		intArray[1][2] = 23; //안됨
		
		intArray[2][0] = 31;
		intArray[2][1] = 32;
		intArray[2][2] = 33;
		
		intArray[3][0] = 41;
		intArray[3][1] = 42;
		intArray[3][2] = 43;
		intArray[3][3] = 44;
		
		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				sum = sum + intArray[i][j];
			}
		}
		System.out.println("합: "+sum);
		System.out.println(Arrays.deepToString(intArray));
	}

}
