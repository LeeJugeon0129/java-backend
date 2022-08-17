package projectA13;

public class projectA1305 {

	public static void main(String[] args) {
		Button btn = new Button();
		
		btn.setOnClickListenner(new CallListenner());
		btn.touch();
		
		btn.setOnClickListenner(new MessageListenner());
		btn.touch();
	}

}
