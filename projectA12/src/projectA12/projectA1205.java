package projectA12;

public class projectA1205 {

	public static void main(String[] args) {
		RemoteControl remocon;
		
		remocon = new Television();
		remocon.turnOn();
		remocon.setVolume(5);
		remocon.turnOff();
		
		remocon = new Audio();
		remocon.turnOn();
		remocon.setVolume(9);
		remocon.turnOff();
		
		RemoteControl rRemocon = new RemoteControl() {
			
			@Override
			public void turnOn() {
				System.out.println("켜기");
			}
			
			@Override
			public void turnOff() {
				System.out.println("끄기");
			}
			
			@Override
			public void setVolume(int volume) {
				/*
				 * 기능 정의
				 */
//				if(volume > RemoteControl.MAX_VOLUME) {
//					volume = RemoteControl.MAX_VOLUME;
//				}else if(volume < RemoteControl.MIN_VOLUME) {
//					volume = RemoteControl.MIN_VOLUME;
//				}else {
//					volume = volume;
//				}
//				System.out.println("TV의 볼륨: "+volume);
			}
		};
	}

}
