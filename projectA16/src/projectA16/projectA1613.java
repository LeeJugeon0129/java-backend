package projectA16;

//Thread 2개를 만드는데 하나는 thread 만들어 생성자로 입력 받은 값까지 출력하고
//다른 하나는 생성자로 입력 받은 값은 -1씩 줄여가며 1까지 출력하도록 하시오.
//2개를 동시에 실행

class Thread01 implements Runnable{
	int cnt = 0;
	Thread01(int cnt){
		this.cnt = cnt;
	}
	
	@Override
	public void run() {
		for(int i=0;i<=this.cnt;i++) {
			System.out.println(i);
		}
	}
}
class Thread02 implements Runnable{
	int cnt = 0;
	Thread02(int cnt){
		this.cnt = cnt;
	}
	
	@Override
	public void run() {
		for(int i=this.cnt;i>=1;i--) {
			System.out.println(i);
		}
	}
}

public class projectA1613 {

	public static void main(String[] args) {
		Thread01 th01 = new Thread01(100);
		Thread02 th02 = new Thread02(200);
		
		Thread t01 = new Thread(th01);
		Thread t02 = new Thread(th02);
		
		t01.start();
		t02.start();
	}

}
