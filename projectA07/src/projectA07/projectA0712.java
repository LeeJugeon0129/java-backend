package projectA07;

public class projectA0712 {

	public static void main(String[] args) {
		int[] score = {83,90,87};
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum=sum+score[i];
		}
		System.out.println("총합: "+sum);
		double avg = (double)sum/score.length;
		System.out.println("평균: "+avg);
		
	}

}
