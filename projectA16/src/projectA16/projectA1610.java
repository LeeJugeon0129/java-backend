package projectA16;

class TRTH01 extends Object implements Runnable{
	@Override
	public void run() {
		int i=0;
		do { //Runnable
			System.out.println("Read");
			i++;
		}while(i<1000);
	}
}
class TRTH02 extends Thread{
	@Override
	public void run() {
		int i=0;
		do {//Thread
			System.out.println("Write");
			i++;
		}while(i<1000);
	}
}
class TRTH03 extends Object implements Runnable{
	@Override
	public void run() {
		int i=0;
		do {//Runnable
			System.out.println("Send");
			i++;
		}while(i<1000);
	}
}

public class projectA1610 {

	public static void main(String[] args) {
		Thread the01 = new Thread(new TRTH01());
		Thread the02 = new TRTH02();
		Thread the03 = new Thread(new TRTH03());
		
		the01.start();
		the02.start();
		the03.start();
	}

}
