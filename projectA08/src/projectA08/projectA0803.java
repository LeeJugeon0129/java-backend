package projectA08;

import java.util.Arrays;

public class projectA0803 {

	public static void main(String[] args) {
		int[][] intArray = new int[3][100];
		
		//1~300까지 저장
		for(int i=0,k=1;i<100;i++) {
			intArray[0][i] = k;
			k++;
		}
		for(int i=0,k=101;i<100;i++) {
			intArray[1][i] = k;
			k++;
		}
		for(int i=0,k=201;i<100;i++) {
			intArray[2][i] = k;
			k++;
		}
		System.out.println(Arrays.deepToString(intArray));
		
		for(int i=0,k=1;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j] = k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(intArray));
		
		//1~300까지 입력값 중에 홀수의 합은?
		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				if(intArray[i][j]%2!=0) {
					sum = sum+intArray[i][j];
				}
			}
		}
		System.out.println("홀수의 합: "+sum);
		
		//1~300까지 입력값 중에 짝수의 합은?
		sum=0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				if(intArray[i][j]%2==0) {
					sum = sum+intArray[i][j];
				}
			}
		}
		System.out.println("짝수의 합: "+sum);
		
	}

}
