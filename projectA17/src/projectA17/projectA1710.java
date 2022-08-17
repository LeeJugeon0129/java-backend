package projectA17;

class WorkObject{
	public synchronized void methodA() {
		System.out.println("ThreadA의 methodA() 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
	public synchronized void methodB() {
		System.out.println("ThreadB의 methodB() 작업 실행");
		notify();
		try {
			wait();
		}catch(InterruptedException e) {
			
		}
	}
}
class ThreadA1 extends Thread{
	private WorkObject workObject;
	public ThreadA1(WorkObject workObject) {
		this.workObject = workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			this.workObject.methodA();
		}
	}
}class ThreadB1 extends Thread{
	private WorkObject workObject;
	public ThreadB1(WorkObject workObject) {
		this.workObject = workObject;
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			this.workObject.methodB();
		}
	}
}

public class projectA1710 {

	public static void main(String[] args) {
		WorkObject sharedObject = new WorkObject();
		
		ThreadA1 threadA = new ThreadA1(sharedObject);
		ThreadB1 threadB = new ThreadB1(sharedObject);
		threadA.start();
		threadB.start();
		
	}

}
