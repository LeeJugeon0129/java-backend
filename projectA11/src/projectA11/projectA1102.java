package projectA11;

public class projectA1102 {

	public static void main(String[] args) {
		DmbCellPhone dmbCellPhone = new DmbCellPhone("자바폰","검정",10);
		
		//CellPhone의 인스턴스 멤버 변수로 상속 받아서 사용함
		System.out.println("모델: "+dmbCellPhone.model);
		System.out.println("색상: "+dmbCellPhone.color);
		//DmbCellPhone의 인스턴스 멤버 변수
		System.out.println("채널: "+dmbCellPhone.channel);
		
		//CellPhone
		dmbCellPhone.powerOn();
		dmbCellPhone.bell();
		dmbCellPhone.sendVoice("여보세요");
		dmbCellPhone.receiveVoice("안녕하세요!~~");
		dmbCellPhone.sendVoice("아 네 반갑습니다.");
		dmbCellPhone.hangUp();
		
		//DmbCellPhone
		dmbCellPhone.turnOnDmb();
		dmbCellPhone.chageChannelDmb(12);
		dmbCellPhone.turnOffDmb();
		
		//CellPhone
		dmbCellPhone.powerOff();
	}

}
