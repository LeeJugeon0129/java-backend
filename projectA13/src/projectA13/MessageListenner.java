package projectA13;

public class MessageListenner implements Button.OnClickListenner{

	@Override
	public void onClick() {
		System.out.println("메시지를 보냅니다.");
	}

}
