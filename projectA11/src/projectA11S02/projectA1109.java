package projectA11S02;

class Person{
	String name;
	String id;
	public Person(String name) {
		this.name = name;
	}
}
class Student extends Person{
	String grade;
	String department;
	public Student(String name) {
		super(name);
	}
}

public class projectA1109 {

	public static void main(String[] args) {
		Person p;
		Student s = new Student("홍길동");
		p = s; //업캐스트(upcast) : 자동으로 됨
		
		System.out.println(p.name);
		
		Person p1 = new Student("척준경"); //★<-- 다운캐스트
		Student s1;
		
		s1 = (Student)p1; //★<-- 다운캐스트(downcast)강제로 형 지정
		s1.grade = "A";
		s1.department = "컴퓨터공학과";
		System.out.println(s1.name);
	}

}
