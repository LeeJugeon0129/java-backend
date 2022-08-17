package projectA11;

public class DmbCellPhone extends CellPhone {
	//인스턴스 멤버 변수
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//인스턴스 멤버 메소드
	void turnOnDmb() {
		System.out.println("채널 "+this.channel+"번 DMB방송 수신을 시작합니다.");
	}
	void chageChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널 "+this.channel+"번으로 바꿉니다.");
	}
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 멈춥니다.");
	}
	
}
