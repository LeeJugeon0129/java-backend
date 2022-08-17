package projectA08;

import java.util.Arrays;

public class projectA0804 {

	public static void main(String[] args) {
		int[][] intArray = new int[5][100];
		//intArray[0] = 1~100
		//intArray[1] = 101~200
		//intArray[2] = 201~300
		//intArray[3] = 301~400
		//intArray[4] = 401~500
		
		for(int i=0,k=1;i<100;i++) {
			intArray[0][i]=k;
			k++;
		}
		for(int i=0,k=101;i<100;i++) {
			intArray[1][i]=k;
			k++;
		}
		for(int i=0,k=201;i<100;i++) {
			intArray[2][i]=k;
			k++;
		}
		for(int i=0,k=301;i<100;i++) {
			intArray[3][i]=k;
			k++;
		}
		for(int i=0,k=401;i<100;i++) {
			intArray[4][i]=k;
			k++;
		}
		System.out.println(Arrays.deepToString(intArray));
		
		
		for(int i=0,k=1;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				intArray[i][j]=k;
				k++;
			}
		}
		System.out.println(Arrays.deepToString(intArray));
		//1~500까지 홀수의 합
		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				if(intArray[i][j]%2!=0) {
					sum = sum+intArray[i][j];
				}
			}
		}
		System.out.println("홀수의 합: "+sum);
		
		int[] sumf = new int[10];
		//1~500까지 1의 배수 합, 2의 배수 합, 3의 배수 합, ..., 10의 배수 합
		for(int i=0,k=1;i<intArray.length;i++) {
			for(int j=0;j<intArray[i].length;j++) {
				
				if(intArray[i][j]%1==0) {
					sumf[0]=sumf[0]+intArray[i][j];
				}
				if(intArray[i][j]%2==0) {
					sumf[1]=sumf[1]+intArray[i][j];
				}
				if(intArray[i][j]%3==0) {
					sumf[2]=sumf[2]+intArray[i][j];
				}
				if(intArray[i][j]%4==0) {
					sumf[3]=sumf[3]+intArray[i][j];
				}
				if(intArray[i][j]%5==0) {
					sumf[4]=sumf[4]+intArray[i][j];
				}
				if(intArray[i][j]%6==0) {
					sumf[5]=sumf[5]+intArray[i][j];
				}
				if(intArray[i][j]%7==0) {
					sumf[6]=sumf[6]+intArray[i][j];
				}
				if(intArray[i][j]%8==0) {
					sumf[7]=sumf[7]+intArray[i][j];
				}
				if(intArray[i][j]%9==0) {
					sumf[8]=sumf[8]+intArray[i][j];
				}
				if(intArray[i][j]%10==0) {
					sumf[9]=sumf[9]+intArray[i][j];
				}
			}
		}
		for(int i=0;i<10;i++) {
			System.out.println((i+1)+"배수 합은: "+sumf[i]);
		}
	}

}
