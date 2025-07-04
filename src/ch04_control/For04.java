package ch04_control;

public class For04 {
	public static void main(String[] args) {
		// for문은 반복 횟수를 아는 경우 사용
		//    시작         끝     증가
		for (int i = 1; i < 10; i++) {  // 반복문이 끝나고 나서 i의 최종값은 10이다. 하지만 9까지만 사용됨. 조건이 false가 돼서 
			/*
			 * i = 1   → "2 x 1 = 2" 
			 * i = 2   → "2 x 2 = 4"
			 *  ...    →     ...
			 * i = 9   → "2 x 8 = 18"
			 * i = 10  → 반복문 종료 
			 */
			System.out.println("2 x " + i + " = " + 2 * i);
		}
	}
}
