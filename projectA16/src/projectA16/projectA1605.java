package projectA16;

class TTh01 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<100;i++) {
			System.out.println("안녕하세요");
		}
	}
}
class TTh02 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<200;i++) {
			System.out.println("Hi");
		}
	}
}
class TTh03 implements Runnable{
	@Override
	public void run() {
		for(int i=0;i<300;i++) {
			System.out.println("반가워요");
		}
	}
}
public class projectA1605 {

	public static void main(String[] args) {
		TTh01 th01 = new TTh01();
		TTh02 th02 = new TTh02();
		TTh03 th03 = new TTh03();
		
		Thread rth01 = new Thread(th01); //Thread : start()메소드를 직접 호출할 수 있다.
		Thread rth02 = new Thread(th02); //Runnable : Runnable형 인자를 받는 생성자를 통해 별도의 Thread 객체를 생성 후, start()메소드를 호출해야 한다.
		Thread rth03 = new Thread(th03);
		
		rth01.start();
		rth02.start();
		rth03.start();
	}

}
