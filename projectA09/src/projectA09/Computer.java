package projectA09;

public class Computer {
	
	int sum1(int[] value) { //sum1 메소드 생성
		int sum=0;
		for(int i=0;i<value.length;i++) {
			sum = sum + value[i];
		}
		return sum;
	}
	
	int sum2(int ... value) { //파라미터를 무한으로 받아옴
		int sum=0;
		for(int i=0;i<value.length;i++) {
			sum = sum + value[i];
		}
//		for(int i:value) {//for - each문
//			sum = sum+i;
//		}
		return sum;
	}
}
