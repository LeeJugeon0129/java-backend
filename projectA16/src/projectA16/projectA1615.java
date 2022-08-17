package projectA16;
//작업 3개
//1 : 1~1000 3의 배수
//2 : 1~1000 4의 배수
//3 : 1~1000 5의 배수

class TheThreadT extends Thread{
	int tag = 0;
	TheThreadT(int tag){
		this.tag = tag;
	}
	@Override
	public void run() {
		if(tag==3) { //3의 배수
			int sum=0;
			for(int i=1;i<=1000;i++) {
				if(i%3==0) {
					sum = sum + i;
				}
			}
			System.out.println("3의 배수: "+sum);
		}else if(tag==4) { //4의 배수
			int sum=0;
			for(int i=1;i<=1000;i++) {
				if(i%4==0) {
					sum = sum + i;
				}
			}
			System.out.println("4의 배수: "+sum);
		}else if(tag==5) { //5의 배수
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

public class projectA1615 {

	public static void main(String[] args) {
		TheThreadT tThread3 = new TheThreadT(3);
		TheThreadT tThread4 = new TheThreadT(4);
		TheThreadT tThread5 = new TheThreadT(5);
		
		tThread3.start();
		tThread4.start();
		tThread5.start();
	}

}
