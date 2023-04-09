import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class GraphicsAndMouseDraggingFrame extends JFrame {
	public GraphicsAndMouseDraggingFrame() {
		// title 설정
		super("2175640 최은진-GraphicsAndMouseDraggingFrame");
		// contentPane 설정 - MyPanel()
		add(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 350, 500
		setSize(350,500);
		// Visible 설정
		setVisible(true);
	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정 - ./images/back.jpg
		ImageIcon icon = new ImageIcon("./images/back.jpg");
		// ImageIcon 을 image 로 받아오기
		Image img = icon.getImage();
		// 시작 위치 100, 100 으로 설정
		int x = 100, y = 100;
		
		//제일 첫번째 나타나는 페인트 컴포넌트. 이벤트 발생시 가려졌다 다시 호출
		public void paintComponent(Graphics g) { //이미 가지고 있는데, 추가적 설정 위해 오버라이딩
			super.paintComponent(g);
			// 뒷 배경 그리기
			g.drawImage(img, 0, 0, this.getWidth(), this.getHeight(), this );//어디부터 어디까지?
			// color 설정 (yellow)
			g.setColor(Color.yellow);
			// 채운 동그라미 그리기 ( x, y 위치에 , 20 크기로)
			g.fillOval(x, y, 20, 20); //20*20사이즈 네모 안에 반지름 10인 원이 됨. 왼쪽 위가 x,y좌표
		}

		public MyPanel() {
			// mosueMotionListener 추가 - MouseAdapter()
			this.addMouseMotionListener(new MouseAdapter() {
				// --> mouseDragged 함수 재정의
				// event 가 발생한 위치를 x, y로 설정
				// 해당 위치로 다시 그리기
				public void mouseDragged(MouseEvent e) { //awt.event로 임포트 할 것!
					x = e.getX();
					y = e.getY();
					repaint();				
				}
			});
			
		}
	}

	public static void main(String[] args) {
		new GraphicsAndMouseDraggingFrame();
	}

}