package hw;

import java.util.Scanner;

public class Lab3_8 {
	public static void main(String[] args) {

		// Scanner 객체 생성
		Scanner scan = new Scanner(System.in);
		// 출력 ("정수 몇개? ")
		System.out.print("정수 몇개? ");
		// size 입력받기
		int size = scan.nextInt();
		// size 크기의 배열 생성
		int int_arr[] = new int[size];
		// new 연산자를 사용하면 boolean 배열은 false로 초기화 됨 0
		boolean check[] = new boolean[101]; 
		// for문 사용{
		for (int i=0 ; i<size ; i++) {
			// 난수 생성
			int r = (int) (Math.random()*100+1); //Math.random()
			// check 배열을 통해 같은 수가 있는지 확인
			// 있다면 없을 때까지 난수 재 생성 및 확인
			while (check[r] == true) {
				r = (int) (Math.random()*100+1);
			}
			// 배열에 update
			check[r] = true;
			int_arr[i] = r;
			
			// 생성한 정수 출력
			System.out.print(int_arr[i] + " ");
			// 10번째 수일 때 new line 해주기
			if(i == 9)
				System.out.println();
		} //for문 끝
		// Scanner 닫기
		scan.close();
		System.out.println("\n2175640 최은진");
	}
}
