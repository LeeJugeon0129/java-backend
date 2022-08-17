package projectA16;

class TheThread extends Thread{
	int tag = 0;
	TheThread(int tag){
		this.tag = tag;
	}
	@Override
	public void run() {
		if(tag == 1) {
			int sum = 0;
			for(int i=1;i<=1000;i++) {
				if(i%2!=0) {
					sum = sum + i; //홀수 계산
				}
			}
			System.out.println("홀수는 "+sum);
		}else if(tag == 2) {
			int sum=0;
			for(int i=1;i<=1000;i++) {
				if(i%2==0) {
					sum = sum + i;
				}
			}
			System.out.println("짝수는 "+sum);
		}
	}
}

public class projectA1614 {

	public static void main(String[] args) {
		TheThread the01 = new TheThread(1);
		TheThread the02 = new TheThread(2);
		
		the01.start();
		the02.start();
		
		
	}

}
