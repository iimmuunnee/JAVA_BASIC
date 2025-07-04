package ch04_control;

public class For05 {
	public static void main(String[] args) {
		// 중첩 for문
		// i(2) → j(1 ~ 9)
		// i(3) → j(1 ~ 9)
		// 	   ...
		// i(9) → j(1 ~ 9)
	
		for (int i = 2; i < 10; i++) {      // i: 2 ~ 9
			for (int j = 1; j < 10; j++) {  // j: 1 ~ 9
				System.out.println(i + " x " + j + " = " + i * j);
			}
		}
		
		/*
		 * for문은 주로 보유한 데이터를 반복해서 출력하는 용도로 많이 사용
		 * → int i = 0; i < data.length;
		 * i를 매번 설정하기 귀찮음..
		 * → 향상된 for문 (for each)
		 * for(타입 변수 : 배열) {
		 *     실행문;
		 * } 
		 */
	}
}
