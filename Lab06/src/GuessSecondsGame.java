import java.util.Calendar;
import java.util.Scanner;

class Player {
	// Scanner 객체 생성
	Scanner scanner = new Scanner(System.in);
	// 이름 변수 String type, private
	private String name;
	// Player 생성자 - param (이름)
	public Player(String name) {
		this.name = name;
	}
	// getName 함수 (return String)
	public String getName() {
		return name;
	}
	public int turn() { //초차이가 60을 안 넘긴다고 가정 분 계산x
		// 출력 (name + "시작 <Enter> 키>> ")
		System.out.print(name + "시작 <Enter> 키>> ");
		// 키 입력 nextLine() //엔터 처리
		String key = scanner.nextLine();
		// 캘린더 받아오기
		Calendar calendar = Calendar.getInstance(); //static 바로 메소드 부름
		// 캘린더에서 현재 초 받아오기
		int sec = calendar.get(Calendar.SECOND);
		// 현재 초 출력 (받아온 초)
		System.out.println("\t현재 초 시간 = " + sec);
		// 10초 예상 후 엔터 키 출력
		System.out.print("10초 예상 후 <Enter> 키>> ");
		// 키 입력 nextLine()
		String key2 = scanner.nextLine();
		// 캘린더 다시 받아오기
		Calendar calendar2 = Calendar.getInstance();
		// 캘린더에서 현재 초 받아오기
		int endSec = calendar2.get(Calendar.SECOND);
		// 현재 초 시간 출력
		System.out.println("\t현재 초 시간 = " + endSec);		
		// 처음 시작 초에서 종료 초와의 차이 계산 후 리턴 (getDiffTime 메소드 호출)
		return getDiffTime(sec, endSec);
	}

	public int getDiffTime(int start, int end) {
		if (start < end) // 종료가 큰 경우 // ex. start = 15, end = 25
			// 차이 값 구해서 리턴
			return end - start;
		else //start = 55, end = 5
			// 종료가 작은 경우에 알맞게 코드 수정 (1분 - 60초) //1 분 넘어가는 경우는 없다.
			return (end + 60) - start;
	}
}

public class GuessSecondsGame {
	public void startGame() {
		// Player 배열 선언 - 크기 2	 정적 할당. 사이즈 공간만 할당. 각 객체 생성은 x
		Player player[] = new Player[2];
		// Player 1 = 로운
		player[0] = new Player("로운");
		// Player 2 = 은우
		player[1] = new Player("은우");
		// 출력 "10초에 가까운 사람이 이기는 게임입니다."
		System.out.println("10초에 가까운 사람이 이기는 게임입니다.");
		// 두 player 게임 실행 결과 구하기 (차이 값 받아오기) 
		int diff1 = player[0].turn();
		int diff2 = player[1].turn();
		
		// 두 player 의 게임 결과 출력
		System.out.print(player[0].getName() + "의 결과 " + diff1 + ", ");
		System.out.print(player[1].getName() + "의 결과 " + diff2 + ", ");
		
		// 승자는 출력
		System.out.print("승자는 ");
		
		//만약 12초와 9초라면 2초, -1초이다
		//만약 7초와 12초라면 -3, 2초이다. 이 경우 -3<2이지만 이기는 사람은 2이기에 
		// Math.abs 이용해 10초에 더 가까운 사람의 이름을 출력 + 동일한 경우 "승자 없음" 출력
		if ( Math.abs(10 - diff1) > Math.abs(10-diff2) )
			System.out.println(player[1].getName());
		else if ( Math.abs(10 - diff1) == Math.abs(10-diff2) )
			System.out.println("없음");
		else
			System.out.println(player[0].getName());
	}

	public static void main(String[] args) {
		GuessSecondsGame gsg = new GuessSecondsGame();
		gsg.startGame();
		System.out.println("2175640 최은진");
	}

}
