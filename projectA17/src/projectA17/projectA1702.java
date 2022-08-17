package projectA17;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

class TimerRunnable implements Runnable{
	private JLabel timerLabel;
	public TimerRunnable(JLabel timerLabel) {
		this.timerLabel = timerLabel;
	}
	
	@Override
	public void run() {
		int n=0;
		while(true) {
			timerLabel.setText(Integer.toString(n));
			n++;
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				return;
			}
		}
	}

}

public class projectA1702 extends JFrame{
	public projectA1702() {
		setTitle("Runnable을 구현한 타이머 스레드 예제");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫았을 때 이벤트를 넘겨줌
		Container c = getContentPane(); //컨테이너 : 컴포넌트를 담을 수 있는 클래스 두 종류 - JFrame, JPanel  
		c.setLayout(new FlowLayout());  //컴포넌트 : 버튼, 텍스트 상자, 레이블 상자, 옵션/체크 박스 등
		JLabel timerLabel = new JLabel();
		timerLabel.setFont(new Font("Gothic", Font.ITALIC, 80));
		c.add(timerLabel);//컴포넌트 추가
		
		TimerRunnable runnable = new TimerRunnable(timerLabel);
		Thread th = new Thread(runnable);
		setSize(250, 150);
		setVisible(true);
		th.start();
	}
	
	public static void main(String[] args) {
		new projectA1702();
	}

}
