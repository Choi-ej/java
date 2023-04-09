package exercise;
public class TV {
	// 제조사, 제조년도, 사이즈 변수 선언
	private String product;
	private int year, size;
	
	public TV(String product, int year, int size) {	//생성자
		//파라미터 값을 변수에 할당
		this.product = product; //this.는 멤버변수. 그냥 product는 가까운 지역변수
		this.year = year;
		this.size = size;
	}
	
	public void show() {	//객체지향 특징 : 각 클래스에 해당하는 메소드 존재
		// "제조사" 에서 만든 "제조년도"년형 "인치" TV
		System.out.println(product + "에서 만든" + year + "년형 " + size + "인치 TV");	//멤버변수	
	}
	
	public static void main(String[] args) {	//메인 메소드
		TV myTV = new TV("LG", 2020, 32);
		myTV.show();
	}
}
