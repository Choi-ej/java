import java.awt.BorderLayout;
import java.awt.Color;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MultiPanelFrame extends JFrame { // JFrame 상속
	
	public JPanel getNorthPanel() {
//		 JPanel 생성
		JPanel north = new JPanel(); 
//		  north panel 에 존재하는 버튼 3개 생성(열기, 닫기, 나가기)
		JButton open = new JButton("열기");
		JButton close = new JButton("닫기");
		JButton exit = new JButton("나가기");
		
//		  panel 에 붙이기
		north.add(open);
		north.add(close);
		north.add(exit);
//		  panel return
		return north;
		 
	}
	
	public JPanel getSouthPanel() {
//		 JPanel 생성
		JPanel south = new JPanel();
//		 button 생성 - "Word Input"
		JButton input = new JButton("Word Input");
//		 size 15인 textField 생성
		JTextField jf = new JTextField(15); //몇 글자가 들어갈 수 있는지 
//		 panel 에 button, tf 붙이기 
		south.add(input);
		south.add(jf);
//		 panel return
		return south;

	}
	
	public int getRandomLocation() {
		Random random = new Random();
		return (random.nextInt(200) + 50) ;// random 50~250
	}
	
	public JPanel getCenterPanel() {
//		 JPanel 생성
		JPanel center = new JPanel();
//		 layout null 로 설정
		center.setLayout(null); //디폴트 삭제 
//		 배경색 흰색으로 설정
		center.setBackground(Color.white);
//		 size 5 인 JLabel list 생성
		JLabel jl[] = new JLabel[5];
//		 jlabel length for loop....
		for (int i=0; i<jl.length; i++) {
//		 	각 요소 별 JLabel 생성 "*"
			jl[i] = new JLabel("*");
//		 	fontcolor - setForegroud 함수 사용
			jl[i].setForeground(Color.red);
//		 	size 10*10
			jl[i].setSize(10, 10);
//		 	location 설정 - getRandomLocation 호출
			jl[i].setLocation(getRandomLocation(), getRandomLocation());
//		 	panel 에 label 붙이기
			center.add(jl[i]);
		
		}
//		 return panel 
		return center;
		 
	}
	
	public MultiPanelFrame() {
		
//		 	부모 생성자 호출, parameter : 학번 + 이름 + 클래스 이름;
		super("2175640 최은진 - MultiPanelFrame");
//		 	DefaultCloseOperation- JFrame.EXIT_ON_CLOSE
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //닫기 버튼 누르면 클래스 프로그램 끝나게
//		 	panel 하나 생성
		JPanel jp = new JPanel();
//		 	BorderLayout 으로 설정
		jp.setLayout(new BorderLayout()); //서로의 간격이 없다.
//		 	각 위치 별 panel 붙이기(함수 호출 getNorth...)
		jp.add(getNorthPanel(), BorderLayout.NORTH);
		jp.add(getCenterPanel(),BorderLayout.CENTER);
		jp.add(getSouthPanel(),BorderLayout.SOUTH);
		
//		 	panel 붙이기
		add(jp);
//		 	visible 설정
		setVisible(true);
//		 	size 350*350 
		setSize(350,350);
		 
	}

	public static void main(String[] args) {
		new MultiPanelFrame();
	}

}
