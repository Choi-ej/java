package exercise;

import java.util.Scanner;

public class lab2_5 {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 출력 ("정수 3개를 입력하시오>>")
		System.out.print("정수 3개를 입력하시오>>");
		int a, b, c;
		a = scan.nextInt(); b = scan.nextInt(); c = scan.nextInt();// 정수 3개 입력
		int max = Math.max(Math.max(a, b), c);// 세개 중 가장 큰 값 찾기
		int left = a + b + c - max ;// 나머지 두 변의 길이 합
		if (max < left)// 제일 큰 변의 길이 < 다른 두 변의 길이 합
			// 출력
			System.out.println("삼각형이 됩니다");
			// 출력
		else
			System.out.println("삼각형을 만들 수 없습니다.");
		// scanner 닫기
		scan.close();
	}
}
