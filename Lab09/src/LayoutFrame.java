import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class LayoutFrame extends JFrame{ //JFrame 상속
	// JPanel 생성
	JPanel jp = new JPanel();
	// "East, West, South, North, Center" 이름 가진 JButton 생성
	JButton jb1 = new JButton("East");
	JButton jb2 = new JButton("West");
	JButton jb3 = new JButton("South");
	JButton jb4 = new JButton("North");
	JButton jb5 = new JButton("Center");
	/* LayoutFrame 클래스 생성자 
		 * 부모 생성자 호출 - jframe, parameter : 학번 + 이름 + 클래스 이름;
		 * defaultCloseOperation 설정 - JFrame.Exit_ON_CLOSE;
		 * panel layout 설정 - BorderLayout (row, col);
		 * 각 버튼 동, 서, 남, 북, 센터에 추가
		 * add panel
		 * size 400*200
		 * visible 설정
	 */
	public LayoutFrame() {
		super("2175640 최은진 - Layout Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼 누르면 클래스 프로그램 끝나게
		
		jp.setLayout(new BorderLayout(5,7)); //컨테이너 상하좌우중앙 다섯개 영역으로 분할 배치. 5,7은 수평, 수직 간격.
		jp.add(jb1, BorderLayout.EAST);
		jp.add(jb2, BorderLayout.WEST);
		jp.add(jb3, BorderLayout.SOUTH);
		jp.add(jb4, BorderLayout.NORTH);
		jp.add(jb5, BorderLayout.CENTER);
		
		add(jp);		
		setSize(400, 200);
		setVisible(true);
	}
	public static void main(String[] args) {
		new LayoutFrame();
	}

}
