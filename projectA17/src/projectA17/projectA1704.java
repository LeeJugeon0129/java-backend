package projectA17;

class CalcThread extends Thread{
	public CalcThread(String name) {
		this.setName(name);
	}
	
	public void run() {
		for(int i=0;i<2000000000;i++) {
			
		}
		try {
			Thread.sleep(2000);
		}catch(InterruptedException e) {
			
		}
		System.out.println(this.getName());
	}
}

public class projectA1704 {
	
	public static void main(String[] args) {
		for(int i=1;i<=10;i++) {
			Thread thread = new CalcThread("thread"+i);
			if(i!=10) {
				thread.setPriority(Thread.MIN_PRIORITY); //우선순위 설정
			}else {
				thread.setPriority(Thread.MAX_PRIORITY);
			}
			thread.start();
		}
	}

}
