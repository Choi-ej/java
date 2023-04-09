import java.awt.Component;
import java.util.Random;

import javax.swing.JFrame;

public class VibratingFrame extends JFrame {
	public VibratingFrame() {
		// title 설정
		super("2175640 최은진 - VibratingFrame");
		// default close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 size 400, 200
		setSize(400, 200);
		// visible 설정
		setVisible(true);
		// 창 location 100, 100 으로 설정
		setLocation(100, 100);
		
		// VibratingThread 생성자 호출 : param : this + start()
		VibratingThread vthread = new VibratingThread(this);
		vthread.start();
	}

	public static void main(String[] args) {
		new VibratingFrame();
	}
}

class VibratingThread extends Thread {
	private Component comp;

	public VibratingThread(Component comp) {
		this.comp = comp;
	}

	@Override
	public void run() {
		// Random 객체 생성
		Random r = new Random();
		// component 의 x, y 좌표 받아오기
		int x = comp.getX();
		int y = comp.getY();
		
		while(true) {
			try {
				Thread.sleep(10);	//0.01초마다
			}
			catch(InterruptedException e) { return; }
			
			// 방향 결정하기 random.nextBoolean() true ? 1, false : -1
			int directX = (r.nextBoolean()) ? 1 : -1;
			// newX = x + 방향 * random(0~4)
			int newX = x + directX * r.nextInt(5); //1이면 오른쪽으로, -1이면 왼쪽으로
			
			// 방향 결정하기 random.nextBoolean() true ? 1, false : -1
			int directY = (r.nextBoolean()) ? 1 : -1;
			// newY = y + 방향 * random(0~4)
			int newY = y + directY * r.nextInt(5);
			// component 방향 결정 (newX, newY)
			comp.setLocation(newX, newY);
		}
	}
}
