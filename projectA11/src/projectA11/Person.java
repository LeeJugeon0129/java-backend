package projectA11;

public class Person {
	public String name;
	private int age; //private - 접근 제어
	protected String part; //protected - 
	String classPart;
	
	public String getClassPart() {
		return classPart;
	}
	public void setClassPart(String classPart) {
		this.classPart = classPart;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getPart() {
		return part;
	}
	public void setPart(String part) {
		this.part = part;
	}
	
	
}
