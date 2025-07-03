package ch03_operator;

public class Operator03 {
	public static void main(String[] args) {
		/*
		 * 논리 연산자
		 *  1. AND (& or &&)
		 *   - 진리표
		 *   - A  B  Result
		 *   - T  T    T
		 *   - T  F    F
		 *   - F  T    F
		 *   - F  F    F
		 *  2. OR  (| or ||)
		 *   - 진리표
		 *   - A  B  Result
		 *   - T  T    T
		 *   - T  F    T
		 *   - F  T    T
		 *   - F  F    F
		 *  3. NOT (!)
		 *   - T → F
		 *   - F → T
		 */
		boolean b1 = true;
		boolean b2 = false;
		// &  -> 두 항 모두 계산
		// && -> 첫번째 항으로 결과가 나오면 두번째 항은 건너뜀 
		if (b1 && b2) {
			System.out.println("true");
		}
	}
}
