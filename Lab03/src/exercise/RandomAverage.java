package exercise;


public class RandomAverage {
	public static void main(String[] args) {
		// size 10 의 배열 생성하기
		int num[] = new int[10];
		// sum 변수 초기화
		int sum = 0;

		// for문, (int)(Math.random()) 사용해서 1~10의 정수 랜덤하게 생성
		for (int i=0; i<10; i++) {
			num[i] = (int) (Math.random() * 10 + 1 );
		}
		// 출력 ("랜덤한 정수들 : ")
		System.out.print("랜덤한 정수들 : ");
		// for문을 사용해서 정수의 합 구하기, 정수 출력하기/
		for (int i=0; i<num.length ; i++) {
			System.out.print(num[i] + " ");
			sum += num[i];
		}
		// 출력 ("평균은 " + 평균)
		System.out.print("\n평균은 " + (double)sum/(num.length) );
	}
}
