package projectA10;

public class Book {
	//멤버 변수
	String title;
	String author;
	
	//생성자
	public Book(String t) {
		this(t,"작자미상"); //생성자 호출하는 메소드
	}
	
	//생성자
	public Book(String title, String author) {
		//멤버 변수 호출
		this.title = title;
		this.author = author;
		
		//멤버 메소드 호출
		this.printTitle();
	}
	//멤버 메소드
	public void printTitle() {
		System.out.println(this.title);
	}
	
	public static void main(String[] args) {
		//인스턴스화
//		Book littePrice = new Book(); //디폴트 생성자가 없기 때문에 xxx	
		Book littePrice = new Book("어린왕자", "생택취페리");
		Book loveStory = new Book("춘향전");
		
		System.out.println(littePrice.title+"책의 저자는 "+littePrice.author);
		System.out.println(loveStory.title+"책의 저자는 "+loveStory.author);
		
	}

}
