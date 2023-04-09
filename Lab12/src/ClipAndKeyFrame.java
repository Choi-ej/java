import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class ClipAndKeyFrame extends JFrame {
	public ClipAndKeyFrame() {
		// title 설정
		// MyPanel add
		// default Close operation 설정
		// 창크기 400, 400
		// Visible 설정
	}

	class MyPanel extends JPanel {
		// ImageIcon 받아와서 뒷 배경 설정
		//ImageIcon 통해서 Image 객체 받아오기
		//X좌표, y 좌표 변수 선언 -0, 0 으로 초기화

		public void paintComponent(Graphics g) {
			//super()
			//클리핑 영역 지정 - x, y, 50, 50
			// 뒷 배경 그리기

			// 숨길 글자 색 지정 (setColor)
			// 숨길 글자를 지정하기 --> drawString(글자, 가로, 세로 위치)
		}

		public MyPanel() {

			// 여기에 setFocusable & requestFocus 설정

		

			// keyListener 추가 - KeyAdapter()
			// keyPressed 함수 재정의
			// switch (e.getKeyCode()) ....
			// VK_UP, VK_DOWN, VK_LEFT, VK_RIGHT 함수 정의
			// x, y좌표를 +10, -10, 창 범위를 벗어나는 경우 처리
			// repaint();
		}
	}

	public static void main(String[] args) {
		new ClipAndKeyFrame();
	}
}
