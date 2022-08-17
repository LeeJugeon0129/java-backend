package projectA15;

import java.util.Iterator;
import java.util.Vector;

public class projectA1505 {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		v.add(5);
		v.add(4);
		v.add(-1);
		v.add(2,100);
		
		Iterator<Integer> it = v.iterator(); //인터페이스 사용 - iterator: 컬렉션에 저장되어 있는 값을 읽어 옴
		while(it.hasNext()) {
			int n = it.next();
			System.out.println(n);
		}
		
		int sum = 0;
		it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
			sum = sum+n;
			
		}
		System.out.println("합: "+sum);
	}

}
