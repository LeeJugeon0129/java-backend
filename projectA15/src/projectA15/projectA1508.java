package projectA15;

import java.util.HashMap;
import java.util.Scanner;

class Student{
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id;
		this.tel = tel;
	}
	public int getid() {
		return id;
	}
	public String getTel() {
		return tel;
	}
}

public class projectA1508 {

	public static void main(String[] args) {
		HashMap<String, Student> map = new HashMap<>();
		
		map.put("황기태", new Student(1,"010-111-1111"));
		map.put("이재문", new Student(2,"010-222-2222"));
		map.put("김남윤", new Student(3,"010-333-3333"));
		
		Scanner in = new Scanner(System.in);
		
		while(true) {
			System.out.print("검색할 이름: ");
			String name = in.nextLine();
			if(name.equals("exit")){
				System.out.println("프로그램 종료");
				break;
			}
			Student student = map.get(name);
			if(student == null) {
				System.out.println(name+"은 없는 사람입니다.");
			}
			else {
				System.out.println("id: "+student.getid()+", 전화: "+student.getTel());
			}
		}
		in.close();
		
	}

}
