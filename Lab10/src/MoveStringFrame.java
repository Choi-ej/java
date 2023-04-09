import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MoveStringFrame extends JFrame {
	public MoveStringFrame() {
		// title 설정
		super("2175640 최은진 - MoveStringFrame");
		// Panel 생성
		JPanel jp = new JPanel();
		// Label 생성 - default "Love Java"
		JLabel jl = new JLabel("Love Java");
		// panel 에 label 붙이기
		jp.add(jl);
		// label 에 keyListener 추가 (param - KeyAdapter()) => 익명클래스 구현
		//익명 클래스 : 이름 없이 바로 객체로.
		jl.addKeyListener( new KeyAdapter() { 
			//키가 눌렸을 때 메소드 구현
			public void keyPressed(KeyEvent e) {
				//왼쪽 화살표 키를 누르는 이벤트에 대해서만
				// 1. keyPressed (KeyEvent e)
				// e.getKeyCode() == 방향키 왼쪽 (VK_LEFT) 일 경우,
				if(e.getKeyCode() == KeyEvent.VK_LEFT) {
					// label = e.getSource 받아오기
					JLabel label = (JLabel)e.getSource();
					// label text 가져오기
					String text = label.getText();
					// 첫글자, 나머지 글자 나누기
					// 1. 현재 문자열에서 첫글자 가져오기
					String first = text.substring(0,1);
					// 2. 나머지 글자 다 가져오기
					String last = text.substring(1);
					// 3. 문자열 = 나머지글자 + 첫글자
					text = last + first;
					// label setText
					jl.setText(text);
				}
			}
		} );
		
		// label setFocusable(true) 설정 프레임을 키자마자 setfocus를 받아서 사용자가 누르면 인식이 가능하도록.
		jl.setFocusable(true);
		// requestFocus 설정
		jl.requestFocus();
		// Panel 추가
		add(jp);
		// size 400 * 200
		setSize(400, 200);
		// default close operation
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible true
		setVisible(true);
	}

	public static void main(String[] args) {
		new MoveStringFrame();
	}

}
