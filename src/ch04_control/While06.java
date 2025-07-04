package ch04_control;
import java.util.Scanner;

public class While06 {
	/*
	 * While문은 반복횟수를 모르는 경우 사용
	 *   - 조건문이 만족하는 동안 반복
	 *   - 조건문 true → 무한 반복
	 *       ㄴ if + break문과 함께 사용할 것!
	 *   while(조건) {
	 *       실행문;
	 *   }
	 *   
	 * continue & break
	 *   - for, while 모두 사용 가능
	 *   - break → 즉시 반복문을 빠져 나감
	 *   - continue → 즉시 다음 반복문으로 넘어감
	 */
	public static void main(String[] args) {
		// 사용자가 올바른 값을 입력하지 않은 경우!
		// - 올바른 값은 1 ~ 5
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("번호: ");;
			int num = sc.nextInt();
			
			if (num >= 1 && num <= 5) {
				break;
			} else {
				System.out.println("올바른 값을 입력하세요.");
			}
		}
	}
}
