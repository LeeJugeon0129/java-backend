package projectA18;
//데몬 스레드(Daemon Thread) : 무한루프에 빠지는 것을 방지
public class DemonExample {

	public static void main(String[] args) {
		DemonThread demonThread = new DemonThread();
		demonThread.setDaemon(true);
		demonThread.start();
		
		try {
			Thread.sleep(3000);
		}
		catch(InterruptedException e) {
			
		}
		System.out.println("메인 스레드 종료");
		
		
	}

}
