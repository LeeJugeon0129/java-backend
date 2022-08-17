package projectA15;

import java.util.Vector;

public class projectA1502 {

	public static void main(String[] args) {
		//정수 값만 다루는 벡터 생성
		Vector<Integer> v = new Vector<Integer>(); //<E> : 엘리먼트
		
		//자료 추가
		v.add(5);
		v.add(4);
		v.add(-1); // 5 4 -1
		
		//중간에 자료 추가
		v.add(2, 100); //두번째에 100 추가 -- 5 4 100 -1
		for(int i=0;i<v.size();i++) {
			int n = v.get(i);
			System.out.println(n);
		}
		System.out.println("-----------------");
		for(int i:v) {
			System.out.println(i);
		}
		int sum = 0;
		for(int i=0;i<v.size();i++) {
			int n = v.elementAt(i); //값 가져오기
			sum = sum + n;
		}
		System.out.println("합: "+ sum);
	}

}
