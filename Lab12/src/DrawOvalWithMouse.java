import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class DrawOvalWithMouse extends JFrame {
	public DrawOvalWithMouse() {
		// title 설정
		super("2175640 최은진 - DrawOvalWithMouse");
		//  MyPanel add
		add(new MyPanel());
		// default Close operation 설정
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 창크기 400, 300
		setSize(400,300);
		// Visible 설정
		setVisible(true);
	}

	class Circle { //모든 원들을 기억해야된다. 객체로 만들어서 vector로 관리
		// x, y, radius 변수 - private
		private int x,y,radius; //x,y는 중심 점
		// 생성자 - 받아온 x, y, radius 를 초기화
		public Circle(int x, int y,int radius) {
			this.x = x;
			this.y = y;
			this.radius = radius;
		}

		public Point getPoint() {
			// 시작 위치 return --> 마우스 클릭으로부터 받아온 위치 - radius (받아온 위치는 원의 중심) //드래그 시작한 점이 원의 중심~놓는 점까지가 반지름인 원을 그릴 거임.
			return new Point(x-radius, y-radius); //시작 위치는 왼쪽 위
		}

		public int getSize() {
			// 반지름 * 2 --> 원의 지름 길이로 그려야 하므로 반지름 * 2
			return 2*radius;
		}
	}

	class MyPanel extends JPanel {
		// circle 타입의 Vector 선언
		Vector<Circle> circle = new Vector<Circle>();
		// 시작 포인트를 나타내는 변수 선언
		Point startPoint = null;
		// 드래그 됐을 경우의 그려질 원의 정보를 담는 Circle 변수 선언
		Circle dragged = null;
		public void paintComponent(Graphics g) {
			//super()
			super.paintComponent(g);
			//색깔 지정 - >green
			g.setColor(Color.green);
			//드래그가 되었을 경우 dragged 객체를 그려주기
			if(dragged!=null) {
				Point p = dragged.getPoint();
				g.drawOval(p.x, p.y, dragged.getSize(), dragged.getSize());
			}
			
			//vector 안에 있는 circle 객체들을 그려주기 - for문 사용
			for (int i=0; i<circle.size(); i++) {
				Circle c = circle.get(i);
				Point p = c.getPoint();
				g.drawOval(p.x, p.y, c.getSize(), c.getSize());				
			}
			
		}

		public MyPanel() {
			this.addMouseListener(new MouseAdapter() {
				public void mousePressed(MouseEvent e) {
					// 이벤트 일어난 위치를 통해 시작 포인트 받아오기
					startPoint = e.getPoint(); //getPoint 는 같이 받아옴 중심점임.
				}
				
				public void mouseReleased(MouseEvent e) {
					//이벤트 일어난 x좌표, y좌표 받아오기
					int x = e.getX();
					int y = e.getY();
					// root((x2-x1)^2 + (y2-y1)^2)
					double len = Math.pow(x-startPoint.getX(),2) + Math.pow(y-startPoint.getY(), 2);
					int radius = (int)Math.sqrt(len) ;
					// 벡터에 새로운 circle 객체 만들어서 추가
					circle.add(new Circle(startPoint.x, startPoint.y, radius));
					// repaint()
					repaint();
				}
			});
			
			this.addMouseMotionListener(new MouseAdapter() {
				public void mouseDragged(MouseEvent e) {
					//이벤트 일어난 x좌표, y좌표 받아오기
					int x = e.getX();
					int y = e.getY();
					// 반지름구하기 : x2-x1 ^2 + y2-y1 ^2 --> root
					double len = Math.pow(x-startPoint.getX(),2) + Math.pow(y-startPoint.getY(), 2);
					int radius =(int)Math.sqrt(len) ;
					//  새로운 circle 객체 만들어서 dragged로 관리
					dragged = new Circle(startPoint.x, startPoint.y, radius);
					// repaint()
					repaint();
				
				}
			});
		}
	}

	public static void main(String[] args) {
		new DrawOvalWithMouse();
	}
}