package hw;

import java.util.Scanner;

public class lab2_2 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner (System.in);
		// 출력 ("2자리수 정수 입력(10~99)")
		System.out.print("2자리수 정수 입력(10~99)>>");
		
		int num = scan.nextInt(); // 정수 입력받기
		int ten = num / 10; //10의 자리 수
		int one = num % 10; //1의 자리 수
		// 조건문
		if (ten == one) 
			System.out.println("Yes! 10의 자리와 1의 자리가 같습니다"); // 같을 때 출력문
		else
			System.out.println("No! 10의 자리와 1의 자리가 다릅니다");// 다를 때 출력문
		// scanner 닫기
		scan.close();
		System.out.println("2175640 최은진");
	}
}