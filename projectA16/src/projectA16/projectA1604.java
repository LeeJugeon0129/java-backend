package projectA16;

class TThread_01 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("안녕하세요");
		}
	}
	
}
class TThread_02 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println("Hi");
		}
	}
}
class TThread_03 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("반가워요");
		}
	}
}

public class projectA1604 {

	public static void main(String[] args) {
		TThread_01 th01 = new TThread_01();
		TThread_02 th02 = new TThread_02();
		TThread_03 th03 = new TThread_03();
		
		th01.start(); //run() 아니고 start()로 해야 쓰레드가 동작된다.
		th02.start();
		th03.start();
		
	}

}
