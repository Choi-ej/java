package hw;

import java.util.Scanner;

public class lab2_8 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);// Scanner 객체 생성
		System.out.print("x1, y1 입력 >>");// 출력 ("x1, y1 입력 >>")
		// x1, y1입력
		int x1, y1; 
		x1 = scan.nextInt(); y1 = scan.nextInt(); 
		// 출력 ("x2, y2  입력>>") 
		System.out.print("x2, y2 입력 >>"); 
		int x2, y2;// x2, y2 입력
		x2 = scan.nextInt(); y2 = scan.nextInt(); 
		// (x1, y1) 또는(x2, y2) 가 (100, 100),(200,200) 외부에 있을 경우
		if ( (x1<100 && x2<100) || (y1<100 && y2<100) || (x1>200 && x2>200) || (y1>200 && y2>200) )
			 // "충돌 없음" 출력
			System.out.println("충돌 없음");
		// (x1, y1) 또는(x2, y2) 가 (100, 100),(200,200) 내부에 있을 경우
		else
			// "충돌 발생" 출력
			System.out.println("충돌 발생");
	
		// scanner 닫기
		scan.close();
		System.out.println("2175640 최은진");
	}
}
