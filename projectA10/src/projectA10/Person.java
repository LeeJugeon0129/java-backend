package projectA10;

public class Person {
	//멤버 변수
	private String name;
	private int age;
	private String job;
	
	//생성자
	public Person() {}//디폴트 생성자, 항상 만들어 주기
	
	//생성자
	public Person(String name) {
		this.name = name;
	}
	
	//생성자
	public Person(String name, int age, String job) {
		this(name);// Person(String name) 호츨
		this.age = age;
		this.job = job;
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

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}
	public void Info() {
		System.out.println("이름: "+this.name);
		System.out.println("나이: "+this.age);
		System.out.println("직업: "+this.job);
	}
}
