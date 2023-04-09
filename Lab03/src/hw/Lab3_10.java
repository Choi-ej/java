package hw;

public class Lab3_10 {
	public static void main(String[] args) {
		// 4 x 4 배열 생성
		int n[][] = new int[4][4];
		// for문으로 10번 반복
		for (int i=0; i<10; i++) {
			// row에 해당하는 난수 생성 - 0~3
			int r = (int) (Math.random()*4);
			// column에 해당하는 난수 생성 - 0~3
			int c = (int) (Math.random()*4);
			// if : 0이 아니라면 - 이미 2차원 배열 해당 row,column에 숫자가 존재한다면
			// 하나의 iteration 다시 반복
			if ( n[r][c] !=0 ) {
				// 주의 - 계속해서 숫자가 존재하는 row, column이 나올 수 있음을 주의
				i--;
			}
			// else
			else {
				// 1~10 사이의 난수 생성
				n[r][c] = (int) (Math.random()*10 + 1);
			}
		}
		// 2중 for문을 사용해서 출력
		for(int i=0; i<4; i++) { 
			for(int j = 0; j<4; j++) {
				// 출력 : n[i][j] + "\t"
				System.out.print(n[i][j] + "\t");
			}
			// new line에 유의
			System.out.println();
		}
		System.out.print("2175640 최은진");
	}
}
