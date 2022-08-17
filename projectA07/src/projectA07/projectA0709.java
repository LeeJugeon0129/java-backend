package projectA07;

public class projectA0709 {

	public static void main(String[] args) {
		int[] score;
		score = new int[] {83,90,87};
		int sum1 = 0;
		for(int i=0;i<3;i++) {
			sum1=sum1+score[i];
		}
		System.out.println("총합1: "+sum1);
		
		score = new int[] {80,90,70};
		int sum2=0;
		for(int i=0;i<3;i++) {
			sum2=sum2+score[i];
		}
		System.out.println("총합2: "+sum2);
		
		//sum1평균, sum2평균
		double avg1=(double)sum1/3;
		System.out.println("평균1: "+avg1);
		System.out.println("평균1: "+(double)(sum1/3));
		double avg2=(double)sum2/3;
		System.out.println("평균2: "+avg2);
	}

}
