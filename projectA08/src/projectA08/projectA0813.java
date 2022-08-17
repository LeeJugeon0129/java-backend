package projectA08;

import java.util.Arrays;

public class projectA0813 {

	static void makeArray(int[] array) {
		int[] intArray = new int[array.length];
		for(int i=0;i<intArray.length;i++) {
			intArray[i] = array[i];
		}
		intArray[0] = 999;
		System.out.println(Arrays.toString(intArray));
	}
	
	public static void main(String[] args) {
		int intArray[] = {1,2,3,4,5};
		
		System.out.println(Arrays.toString(intArray));
		makeArray(intArray); //intArray[]의 주소값이 넘어감.
		System.out.println(Arrays.toString(intArray));
	}

}
