package projectA09S01;

public class projectA0902 {

	public static void main(String[] args) {
		Student student = new Student();
		
		student.setName("홍길동");
		student.setKor(100);
		student.setEng(100);
		student.setMath(100);
		
		student.studentInfo();
		System.out.println();
		
		Student pstStudent = new Student();
		pstStudent.setName("척준경");
		pstStudent.setKor(90);
		pstStudent.setEng(100);
		pstStudent.setMath(80);
		
		pstStudent.studentInfo();
		System.out.println();
		
		Student saStudent = new Student();
		saStudent.setName("남길동");
		saStudent.setKor(88);
		saStudent.setEng(90);
		saStudent.setMath(70);
		
		saStudent.studentInfo();
		System.out.println();
		
		System.out.println("국어 평균: "+(student.getKor()+pstStudent.getKor()+saStudent.getKor())/3);
		
	}

}
