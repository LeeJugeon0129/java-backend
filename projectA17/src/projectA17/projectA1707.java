package projectA17;
//스레드 상태값 출력

class StatePrintThread extends Thread{
	private Thread targetThread;
	
	public StatePrintThread(Thread targetThread) {
		this.targetThread = targetThread;
	}
	@Override
	public void run() {
		while(true) {
			Thread.State state = targetThread.getState();
			System.out.println("타겟 스레드 상태: "+ state);
			if(state == Thread.State.NEW) { //새로운 스레드인 상태
				targetThread.start();
			}
			if(state == Thread.State.TERMINATED) { //스레드가 종료된 상태
				break;
			}
			try {
				Thread.sleep(500);//0.5초
			}catch(Exception e) {
				
			}
		}
	}
}

class TargetThread extends Thread{
	@Override
	public void run() {
		for(long i=0;i<1000000000;i++) {
			
		}
		try {
			Thread.sleep(1500);
		}
		catch(Exception e) {
			
		}
		for(long i=0;i<1000000000;i++) {
			
		}
	}
}

public class projectA1707 {

	public static void main(String[] args) {
		StatePrintThread statePrintThread = new StatePrintThread(new TargetThread());
		statePrintThread.start();
	}

}
