import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class RandomCircleFrame extends JFrame{
	public RandomCircleFrame() {
		// title 설정
		super("2175640 최은진- RandomCircleFrame");
		// MyPanel() 생성자를 호출하여 컨텐트팬으로 설정
		setContentPane(new MyPanel());
		// default close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창 size 400, 400
		setSize(400, 400);
		// visible 설정
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new RandomCircleFrame();
	}

}

class MyPanel extends JPanel implements Runnable {
	private int x = 100, y = 100;
	
	public MyPanel() {
		// this에 mouseListener 추가 : param (MouseAdpater())
		this.addMouseListener(new MouseAdapter() {
			// mousePressed() 함수 재정의
			// --> thread 호출 : param (MyPanel.this) +  start()
			public void mousePressed(MouseEvent e) {
				Thread th = new Thread(MyPanel.this);	//runnable 구현한 mypanel을 넘겨주고싶다. 그거에 대해서 thread 생성
				th.start();
			}
		});

	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		// blue로 color setting
		g.setColor(Color.blue);
		// 50x50 크기의 원 그리기 with x, y
		g.drawOval(x, y, 50, 50);
		
	}
	
	@Override
	public void run() {
		while(true) {
			try {
				Thread.sleep(500);
			}
			catch(InterruptedException e) {
				return ;
			}
			//x, y 좌표 random하게 받아오기 -> frame과 원의 크기 고려
			x = (int) (Math.random() * (this.getWidth()-50)); //0부터 width-50 까지의 난수
			y = (int) (Math.random() * (this.getHeight()-50));
			// repaint()메소드 호출
			repaint();
		}
	}
	
	
}
