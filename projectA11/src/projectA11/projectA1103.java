package projectA11;

class Student extends Person{
	private String work;

	public String getWork() {
		return work;
	}
	public void setWork(String work) {
		this.work = work;
	}
	public void sayAge() {
		int age = super.getAge();
		System.out.println("나이는 "+age+"입니다.");
	}
	
	@Override
	public String toString() {
		return "이름: "+super.name+" Part: "+this.part+" 하는 일: "+this.work;
	}
}
class StudentWork extends Student{
	@Override
	public String toString() {
		return super.toString();
	}
}

public class projectA1103 {

	public static void main(String[] args) {
		Person person = new Person();
		person.name = "곽정필";
		person.part = "강사";
		
		Student student = new Student();
		student.name = "홍길동";
		student.part = "강사";
		student.setAge(30);
		student.setWork("공부");
		System.out.println(student);
		student.sayAge();
		
		StudentWork studentWork = new StudentWork();
		studentWork.name = "홍길자";
		studentWork.part = "강사";
		studentWork.setAge(32);
		studentWork.setWork("학과일");
		System.out.println(studentWork);
		studentWork.sayAge();
	}

}
