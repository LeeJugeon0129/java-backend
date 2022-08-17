package projectA16;

class forThe01 extends Thread{
	@Override
	public void run() {
		for(int i=1;i<101;i++) {
			System.out.println(i);
		}
	}
}
class forThe02 extends Thread{
	@Override
	public void run() {
		for(int i=101;i<201;i++) {
			System.out.println(i);
		}
	}
}
class forThe03 extends Thread{
	@Override
	public void run() {
		for(int i=201;i<301;i++) {
			System.out.println(i);
		}
	}
}

public class projectA1612 {
	
	public static void main(String[] args) {
		forThe01 th01 = new forThe01();
		forThe02 th02 = new forThe02();
		forThe03 th03 = new forThe03();
		
		th01.start();
		th02.start();
		th03.start();
	}

}
