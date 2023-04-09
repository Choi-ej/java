package exercise;

import java.util.Scanner;

public class MultiplesofThree {
	public static void main(String[] args) {
		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// size 10 의 배열 생성
		int num[]  = new int [10];
		// 출력 ("양의 정수 10개를 입력하시오 >> ");
		System.out.print("양의 정수 10개를 입력하시오 >> ");
		// for문으로 10개의 양의 정수 입력받기
		for (int i=0; i<10; i++)
			num[i] = scan.nextInt();
		// 출력 ("3의 배수는 ");
		System.out.print("3의 배수는 ");
		// for, if문을 사용해서 3의 배수 출력
		for (int i=0; i<10; i++)
			if(num[i]%3 == 0)
				System.out.print(num[i]+" ");
		// Scanner 닫기
		scan.close();
	}
}
