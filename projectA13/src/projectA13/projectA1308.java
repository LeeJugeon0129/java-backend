package projectA13;

class ButtonA{
	OnClickListenner listenner;
	
	void setOnClickListenner(OnClickListenner listenner) {
		this.listenner = listenner;
	}
	void touch() {
		this.listenner.OnClick();
	}
	
	interface OnClickListenner{
		void OnClick();
	}
}
class WindowA{
	ButtonA button1 = new ButtonA();
	ButtonA button2 = new ButtonA();
	
	ButtonA.OnClickListenner listenner = new ButtonA.OnClickListenner() {
		
		@Override
		public void OnClick() {
			System.out.println("전화를 겁니다.");
		}
	};
	WindowA(){
		button1.setOnClickListenner(listenner);
		
		button2.setOnClickListenner(new ButtonA.OnClickListenner() {//어노니머스 - 이름이 정해지지 않았다.
			
			@Override
			public void OnClick() {
				System.out.println("메시지를 보냅니다.");				
			}
		});
	}
}

public class projectA1308 {

	public static void main(String[] args) {
		WindowA w = new WindowA();
		w.button1.touch();
		w.button2.touch();
	}

}
