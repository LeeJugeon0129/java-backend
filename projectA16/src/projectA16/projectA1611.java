package projectA16;

class forThread01 extends Thread{
	@Override
	public void run() {
		int i=0;
		int sum=0;
		for(;;) {
			if(i==100) {
				break;
			}
			try {
				sleep(1000); //1000 = 1s //10번 반복 -> 10초 대기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			i++;
			sum=sum+i;
		}
		System.out.println("for1의 sum = "+ sum);
	}
}
class forThread02 extends Thread{
	@Override
	public void run() {
		int sum=0;
		for(int i=0;i<1000;i++) {
			sum = sum + i;
			try {
				sleep(10); //1000 = 1s //10번 반복 -> 10초 대기
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("for2의 sum = "+ sum);
	}
}

public class projectA1611 {

	public static void main(String[] args) {
		forThread01 for01 = new forThread01();
		forThread02 for02 = new forThread02();
		
		for01.start();
		for02.start();
	}

}
