package exercise;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
//		 Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
//		출력 ("정수를 입력하시오 >> ");
		System.out.print("정수를 입력하시오 >> ");
//		사용자로부터 정수 입력 받기		
		int num = scan.nextInt();
//		2중 for문 사용
		for( int i=num; i>0; i--) {
			for (int j=0 ; j<i; j++) {
				System.out.print("*");
			}
			//new line
			System.out.println();
		}
//		 Scanner 닫기
		scan.close();
	}
}