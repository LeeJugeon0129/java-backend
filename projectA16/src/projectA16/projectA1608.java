package projectA16;

class RThe01 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Test"+i);
			i++;
		}
	}
}
class RThe02 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Send"+i);
			i++;
		}
	}
}
class RThe03 implements Runnable{
	@Override
	public void run() {
		int i=0;
		while(i<100) {
			System.out.println("Read"+i);
			i++;
		}
	}
}

public class projectA1608 {

	public static void main(String[] args) {
		Thread th01 = new Thread(new RThe01());
		Thread th02 = new Thread(new RThe02());
		Thread th03 = new Thread(new RThe03());
		
		th01.start();
		th02.start();
		th03.start();
	}

}
