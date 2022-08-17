package projectA11S01;

public class Student extends People {
	public int studentNo;
	
	public Student(String name, String ssn, int studentNo) {
		super(name,ssn); //생성자로 호출
		this.studentNo = studentNo;
		
	}
}
