package exercise;

import java.util.Scanner;

public class lab2_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Scanner 객체 생성
		Scanner scan = new Scanner (System.in);
		// 출력 ("달을 입력하세요(1~12)>>")
		System.out.print("달을 입력하세요(1~12)>>");
		// 달 입력
		int month = scan.nextInt();
		switch(month) {		
			//3~5는 "봄" 출력
		case 3:
		case 4:
		case 5:
			System.out.println("봄");
			break;
			//6~8은 "여름" 출력
		case 6:
		case 7:
		case 8:
			System.out.println("여름");
			break;	
			//9~11은 "가을" 출력
		case 9:
		case 10:
		case 11:
			System.out.println("가을");
			break;		
			//12, 1, 2는 "겨울" 출력
		case 12:
		case 1:
		case 2:
			System.out.println("겨울");
			break;	
			//그 외는 "잘못입력" 출력
		default :
			System.out.println("잘못입력");
		}
		// scanner 닫기
		scan.close();
	}

}

