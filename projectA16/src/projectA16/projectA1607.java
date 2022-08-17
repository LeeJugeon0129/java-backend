package projectA16;

class Value{
	static int i=0; //static - 하나의 값이 전체적으로 공유
	
	public synchronized void method() {
		i=0;
	}
}
class The01 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Test"+i);
			i++;
		}
	}
}
class The02 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Send"+i);
			i++;
		}
	}
}
class The03 extends Thread{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Read"+i);
			i++;
		}
	}
}

public class projectA1607 {//public은 파일 하나에 하나만 가능

	public static void main(String[] args) {
		The01 th01 = new The01();
		The02 th02 = new The02();
		The03 th03 = new The03();
		
		th01.start();
		th02.start();
		th03.start();
	}

}
