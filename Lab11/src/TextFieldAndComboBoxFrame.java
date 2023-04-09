import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class TextFieldAndComboBoxFrame extends JFrame {
	public TextFieldAndComboBoxFrame() {
		// 학번 이름 - 클래스 제목으로 타이틀 설정
		super("2175640 최은진 - TextFieldAndComboBoxFrame");
		// 판넬 하나 생성
		JPanel panel = new JPanel();
		// String 타입의 JComboBox 생성
		JComboBox<String> box = new JComboBox<String>();
		// 20크기의 JTextField 생성
		JTextField text = new JTextField(20);
		// textField 에 actionListener 추가
		text.addActionListener(new ActionListener() {
			// actionPerformed 함수 (ActionEvent)
			public void actionPerformed(ActionEvent e) {
				// box에 jtextField 의 텍스트를 받아와 추가해주고
				// jtextField 의 텍스트를 없애준다. ("")
				JTextField txt = (JTextField)e.getSource();
				String str = txt.getText();
				box.addItem(str);
				txt.setText("");
			}
		});
		// 판넬에 textField 추가
		panel.add(text);
		// 판넬에 comboBox 추가
		panel.add(box);
		// 판넬 추가
		add(panel);
		// 창 크기 400, 200
		setSize(400,200);
		// defaultCloseOperation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// visible 설정
		setVisible(true);
	}

	public static void main(String[] args) {
		new TextFieldAndComboBoxFrame();
	}

}
