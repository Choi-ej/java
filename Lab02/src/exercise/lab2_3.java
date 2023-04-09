package exercise;

import java.util.Scanner;

public class lab2_3 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 출력 ("금액을 입력하시오 >> ")
		System.out.print("금액을 입력하시오>>");
		int money = scan.nextInt();// 돈 입력 받기
		// 입력 받은 돈이 올바른 값이라면 (양수)
		if(money >= 0) {
			// "/"와 "%" 사용해서 풀기
			System.out.println("오만원권 " + money / 50000 + "매");
			money %= 50000;
			System.out.println("만원권 " + money / 10000 + "매");
			money %= 10000;
			System.out.println("오천원권 " + money / 5000 + "매");
			money %= 5000;
			System.out.println("천원권 " + money / 1000 + "매");
			money %= 1000;
			System.out.println("오백원 " + money / 500 + "개");
			money %= 500;
			System.out.println("백원 " + money / 100 + "개");
			money %= 100;
			System.out.println("오십원 " + money / 50 + "개");
			money %= 50;
			System.out.println("십원 " + money / 10 + "개");
			System.out.println("일원 " + money % 10 + "개");
		}	
		// scanner 닫기
		scan.close();
	}
}
