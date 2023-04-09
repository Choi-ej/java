class Circle {
	// int 형 x, y, 반지름 변수 radius (private)
	private int x, y, radius;
	// Circle 생성자 - param (x, y, 반지름)
	public Circle(int x, int y, int radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	// toString 함수 (return String)
	public String toString() {
		return "Circle(" + x + ", " + y + ")" + " 반지름" + radius ;
	} 
	// equals 함수 - param (other Circle) : 좌표가 같으면 동일한 것으로 봄
	public boolean equals(Circle other) {
		if(x == other.x && y == other.y)
			return true;
		else
			return false;
	}
}

public class CircleApp{
	public static void main(String[] args) {
		Circle a = new Circle(2, 3, 5);
		Circle b = new Circle(2, 3, 30);
		System.out.println("원 a : " + a.toString());
		System.out.println("원 b : " + b.toString());
		if (a.equals(b))
			System.out.println("같은 원");
		else
			System.out.println("다른 원");
		System.out.println("2175640 최은진");
	}
}


