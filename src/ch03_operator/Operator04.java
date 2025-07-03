package ch03_operator;

public class Operator04 {
	public static void main(String[] args) {
		/*
		 * 증감연산자 (지필평가 계산 결과 예측)
		 *  - ++x, x++
		 *  - --x, x-- 
		 */
		int num1 = 7;
		int num2 = 7;
		int result1, result2;
		result1 = --num1 + 4;  // 전위연산자: 연산을 하기 전에 먼저 num 1 감소하고 계산
		result2 = num2-- + 4;  // 후위연산자: 연산을 하고 난 후에 num 1 감소
		System.out.println(result1 + ", " + num1);
		System.out.println(result2 + ", " + num2);
	}
}
