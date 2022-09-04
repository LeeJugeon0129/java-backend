package projectA18;
//데몬 스레드(Daemon Thread) : 무한루프에 빠지는 것을 방지
public class DemonThread extends Thread {
	public void save() {
		System.out.println("작업 내용 저장함.");
	}
	@Override
	public void run() {
		while(true) {
			try{
				Thread.sleep(1000);
			}
			catch(InterruptedException e) {
				break;
			}
			save();
		}
	}
}
