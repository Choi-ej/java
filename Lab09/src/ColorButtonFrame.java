import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ColorButtonFrame extends JFrame { // JFrame 상속
	// JPanel 하나 생성
	JPanel jp = new JPanel();
	// 크기 10인 JButton 배열 생성
	JButton jbt[] = new JButton[10];	//메모리 부분에 대한 할당만
	// Color 배열 생성 (10가지 다른 색상)
	Color color[] = {Color.red, Color.orange, Color.yellow, Color.green, Color.cyan, Color.blue, Color.magenta, Color.darkGray, Color.pink, Color.gray};
	
	// ColorButtonFrame 생성자
	public ColorButtonFrame() {
		//	부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("2175640 최은진 - ColorButtonFrame");
		//	Panel GridLayout으로 설정
		jp.setLayout(new GridLayout(1, 10)); //1행 10열 그리드인지
		//	jbutton 배열 크기만큼 for loop 돌면서 ...
		for (int i=0; i<10; i++) {
			//	각 요소 별 JButton 생성 with "i" //string으로
			jbt[i] = new JButton(Integer.toString(i));	//메모리에 대한 객체 생성
			//	배경 색 Color list 값으로 변경
			jbt[i].setBackground(color[i]);
			//	jpanel 에 붙이기
			jp.add(jbt[i]);
		}
		// panel 붙이기
		add(jp);
		// 사이즈 500*200
		setSize(500, 200);
		// visible 설정
		setVisible(true);
		// defaultCloseOperation 설정 - JFrame.Exit_ON_CLOSE;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	public static void main(String[] args) {
		new ColorButtonFrame();
	}
 
}
