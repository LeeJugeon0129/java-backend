package projectA16;
/*
 * 쓰레드로 동시에 실행
 */
class Thread_01 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("작업1");
		}
	}
}
class Thread_02 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("작업2");
		}
	}
}
class Thread_03 extends Thread{
	@Override
	public void run() {
		for(int i=0;i<1000;i++) {
			System.out.println("작업3");
		}
	}
}

public class projectA1602 {

	public static void main(String[] args) {
		Thread_01 th01 = new Thread_01();
		Thread_02 th02 = new Thread_02();
		Thread_03 th03 = new Thread_03();
		
		th01.start();
		th02.start();
		th03.start();
	}

}
