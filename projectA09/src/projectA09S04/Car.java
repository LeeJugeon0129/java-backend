package projectA09S04;

public class Car {
	//멤버 변수
	int gas;
	//생성자
	
	//멤버 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;
		}else {
			System.out.println("gas가 있습니다.");
			return true;
		}
	}
	
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas 잔량: "+gas+")");
				gas = gas-1; //gas--;
			}else {
				System.out.println("멈춥니다.(gas 잔량: "+gas+")");
				return;
			}
		}
	}
}
