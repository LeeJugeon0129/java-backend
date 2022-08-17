package projectA16;

class TheRunnable implements Runnable{
	int tag = 0;
	TheRunnable(int tag){
		this.tag = tag;
	}
	@Override
	public void run() {
		if(this.tag==3) { //3의 배수
			int sum=0;
			for(int i=1;i<=1000;i++) {
				if(i%3==0) {
					sum = sum + i;
				}
			}
			System.out.println("3의 배수: "+sum);
		}else if(this.tag==4) { //4의 배수
			int sum=0;
			for(int i=1;i<=1000;i++) {
				if(i%4==0) {
					sum = sum + i;
				}
			}
			System.out.println("4의 배수: "+sum);
		}else if(this.tag==5) { //5의 배수
			int sum=0;
			for(int i=1;i<=1000;i++) {
				if(i%5==0) {
					sum = sum + i;
				}
			}
			System.out.println("5의 배수: "+sum);
		}
	}
}

public class projectA1616 {

	public static void main(String[] args) {
		TheRunnable rThread3 = new TheRunnable(3);
		TheRunnable rThread4 = new TheRunnable(4);
		TheRunnable rThread5 = new TheRunnable(5);
		
		Thread th01 = new Thread(rThread3);
		Thread th02 = new Thread(rThread4);
		Thread th03 = new Thread(rThread5);
		
		th01.start();
		th02.start();
		th03.start();
	}

}
