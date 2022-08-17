package projectA15;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

class CollectionsEx{
	static void printList(LinkedList<String> I) {
		Iterator<String> iterator = I.iterator();
		while(iterator.hasNext()) {
			String e = iterator.next();
			String separator;
			if(iterator.hasNext()) {
				separator = "->";
			}
			else {
				separator = "\n";
			}
			System.out.print(e+separator);
		}
	}
}

public class projectA1509 {

	public static void main(String[] args) {
		LinkedList<String> myList = new LinkedList<>();
		myList.add("트랜스포머");
		myList.add("스타워즈");
		myList.add("매트릭스");
		myList.add(0,"터미네이터");
		myList.add(2,"아바타");
		
		Collections.sort(myList); //요소정렬
		CollectionsEx.printList(myList);
		
		Collections.reverse(myList);//요소의 순서를 반대로
		CollectionsEx.printList(myList);
		
		int index = Collections.binarySearch(myList, "아바타")+1;
		System.out.println("아바타는 "+index+"번째 요소입니다.");
		
	}

}