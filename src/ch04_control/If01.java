/*
 * 제어문(Control Language)
 *  1. 조건문 (Condition language)
 *   - if ~ else if ~ else
 *   - switch ~ case ~ default
 *  2. 반복문 (Loop language)
	 - for: 반복 횟수를 알고 있는 경우
	 - while: 반복 횟수를 모르는 경우
 */
package ch04_control;

public class If01 {
	public static void main(String[] args) {
		/*
		 * if (조건) {
		 *     실행문;
		 * } else if (조건) {
		 *     실행문;
		 * } else if (조건) {
		 *     실행문;
		 * } else {
		 *     실행문;
		 * }
		 * 
		 * 1. if 키워드 시작 (한번만 가능)
		 * 2. 조건을 추가하고싶은 경우 else if
		 * 3. else if 개수 제한 없음
		 * 4. else는 모든 조건을 만족하지 못하는 경우(false) 실행 (한번만 가능)
		 * 5. if문은 체인으로 연결이 됐다고 생각
		 *    → if문 내에서 한 개의 조건이 만족(true)하면 그 후로는 실행X
		 */
		
		int age = 24;
		
		if (age >= 38) {
			System.out.println("X세대");
		} else if (age >= 19) {
			System.out.println("MZ세대");
		} else {
			System.out.println("a세대");
		}
		
	}
}
