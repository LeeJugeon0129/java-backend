package projectA17;

class ThreadA extends Thread{
	public ThreadA() {
		setName("ThreadA"); //Thread 이름 지정
	}
	@Override
	public void run() { //Thread는 run()으로 실행해야 함.
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
class ThreadB extends Thread{
	@Override
	public void run() {
		for(int i=0;i<2;i++) {
			System.out.println(getName()+"가 출력한 내용");
		}
	}
}
public class projectA1703 {

	public static void main(String[] args) {
		Thread mainThread = Thread.currentThread();
		System.out.println("프로그램 시작 스레드 이름:"+mainThread.getName());
		
		ThreadA threadA = new ThreadA();
		System.out.println("작업 스레드 이름:"+threadA.getName());
		threadA.start();
		
		ThreadB threadB = new ThreadB();
		System.out.println("작업 스레드 이름:"+threadB.getName());
		threadB.start();
	}

}
