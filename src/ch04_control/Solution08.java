package ch04_control;

public class Solution08 {
	public static void main(String[] args) {
		// 1부터 100까지 총합을 출력하는 코드 작성
		int total = 0;
		
		for (int i = 1; i < 101; i++) {
			total += i;
		}
		
		System.out.println("total: " + total);
		
		// 1부터 100까지 짝수 합과 홀수 합을 출력하는 코드 작성
		int evenTotal = 0;  // 짝수 합
		int oddTotal = 0;   // 홀수 합
		
		for (int i = 0; i < 101; i++) {
			if (i % 2 == 0) {
				evenTotal += i;
			} else {
				oddTotal += i;
			}
		}
		System.out.println("짝수 합: " + evenTotal);
		System.out.println("홀수 합: " + oddTotal);
	}
}
