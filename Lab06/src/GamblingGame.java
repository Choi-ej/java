import java.util.Random;
import java.util.Scanner;

class Person {
	// 이름 변수 String, private

	// Person 생성자 - param (이름)
	
	// getName 함수 - return String;
	
}

public class GamblingGame {
	// Scanner 객체 선언
	
	// Person 배열 생성 - 크기 2
	
	// 랜덤 객체 선언
	

	public void setting() {
		// "1번째 선수 이름 >> " 출력
		
		// 이름 입력
		
		// 생성자 이용해서 첫번째 선수 이름 세팅
		
		// "2번째 선수 이름 >> " 출력
		
		// 이름 입력
		
		// 생성자 이용해서 두번째 선수 이름 세팅
		
	}

	public void run() {
		setting();
		// 승리를 의미하는 boolean 변수 선언
		boolean victory; //초기화
		while (true) {
			// for 0 to person 길이만큼{
			
				// 이름 + 엔터 출력
			
				// 키 입력받기 nextLine
			
				// 세개의 랜덤 변수 생성
			
			
				// 랜덤 변수 출력
				
				// 세 수가 모두 동일하다면
			
					// 승리 출력 & 표시 for 빠져나가기.
			
				// 아니라면
					//아쉽군요! 출력
			
			// if - for 에서 승리한 경우
			
				// 스캐너 닫고 while 나가기
		}
	}

	public static void main(String[] args) {
		GamblingGame gg = new GamblingGame();
		gg.run();
	}

}
