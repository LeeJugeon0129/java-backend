package projectA13;

public class Button {
	OnClickListenner listenner;
	
	void setOnClickListenner(OnClickListenner listenner) {
		this.listenner = listenner;
	}
	void touch() {
		listenner.onClick();
	}
	
	interface OnClickListenner{
		void onClick();
	}
}
