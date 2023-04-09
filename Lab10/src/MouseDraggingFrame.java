import java.awt.Color;
import java.awt.Container;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JFrame;

public class MouseDraggingFrame extends JFrame {
	public MouseDraggingFrame() {
		// title 설정 (학번 이름 - 클래스 이름)
		super("2175640 최은진 - MouseDraggingFrame");
		// Container 생성 = getContentPane(); 드래그 되는 동안 노란색. 드래그 그만되는 순간 초록
		Container c = getContentPane();
		// container 의 배경색 설정 - default Green
		c.setBackground(Color.green);
		
		// MyMouseListener 정의
		MyMouseListener ml = new MyMouseListener();
		// container 에 mouseListener 추가
		c.addMouseListener(ml);
		// container 에 mouseMotionListener 추가
		c.addMouseMotionListener(ml);
		// size 400 * 200
		setSize(400, 200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}

	class MyMouseListener extends MouseAdapter {	//모든 return 처리
		//마우스 리스너 Interface = 추상 메소드만 있음. 모든 이벤트들이 추상으로 다 구현해야됨.
		//마우스 어댑터 = 모든 이벤트 구상 안할 때
		public void mouseDragged(MouseEvent e) { //드래그 되는 동안
			// Container 생성 = e.getSource();
			Container c = (Container)e.getSource();
			// 배경색 설정 - yellow
			c.setBackground(Color.yellow);
		}

		public void mouseReleased(MouseEvent e) { //해제되는 순간
			// Container 생성;
			Container c = (Container)e.getSource();
			// 배경색 설정 - green
			c.setBackground(Color.green);
		}
	}

	public static void main(String[] args) {
		new MouseDraggingFrame();
	}

}
