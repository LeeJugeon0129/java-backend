package projectA07;

import java.util.Arrays;

public class projectA0717 {

	public static void main(String[] args) {
		int[] intArray = new int[100];
		
		//0~99까지 배열을 초기화 하시오. 초기화 값은 1~100
		for(int i=0,j=1;i<intArray.length;i++,j++) {
			intArray[i] = j;
		}
		//intArray 배열의 요소의 합은?
		int sum=0;
		for(int i=0;i<intArray.length;i++) {
			sum = sum + intArray[i];
		}
		System.out.println("배열의 합: "+sum);
		
		//intArray 배열에서 홀수의 값의 합은?
		int sum1=0;
		for(int i=0;i<intArray.length;i++) {
			if(intArray[i]%2!=0) {
				sum1=sum1+intArray[i];
			}
		}
		System.out.println("홀수의 합: "+ sum1);
		
		int[] intArray2 = new int[50];
		//intArray2에 intArray의 짝수 값을 읽어와 할당하시오.
		for(int i=0,j=0;i<intArray.length;i++) {
			if(intArray[i]%2==0) {
				intArray2[j]=intArray[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(intArray2));
		
		int[] intArray3 = new int[50];
		//intArray3에 intArray의 홀수 값을 읽어와 할당하시오.
		for(int i=0,j=0;i<intArray.length;i++) {
			if(intArray[i]%2!=0) {
				intArray3[j]=intArray[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(intArray3));
		
		//intArray2와 intArray3의 요소의 모든 합은?
		int sum5=0;
		for(int i=0;i<intArray2.length;i++) {
			sum5 = sum5 + intArray2[i]+intArray3[i];
		}
		System.out.println("intArray2와 intArray3의 합: "+sum5);
	}

}
