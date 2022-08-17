package projectA08;

import java.util.Arrays;
import java.util.Scanner;

public class projectA0808 {

	public static void main(String[] args) {
		double[][] score = {
				{0.0,0.0},
				{0.0,0.0},
				{0.0,0.0},
				{0.0,0.0}
		};
		Scanner in = new Scanner(System.in);
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				System.out.println((year+1)+"학년"+(term+1)+"학기 점수는: ");
				score[year][term] = Double.parseDouble(in.nextLine());
			}
		}
		System.out.println(Arrays.deepToString(score));
		
		//각 학년별 평균
		double[] avg = new  double[4];
		double[] sum = new  double[4];
		for(int year=0;year<score.length;year++) {
			for(int term=0;term<score[year].length;term++) {
				sum[year]=sum[year]+score[year][term];
			}
		}
		for(int i=0;i<sum.length;i++) {
			avg[i] = sum[i]/2;
		}
		for(int i=0;i<avg.length;i++) {
			System.out.println((i+1)+"학년 평균은 "+avg[i]+"입니다.");
		}
	}

}
