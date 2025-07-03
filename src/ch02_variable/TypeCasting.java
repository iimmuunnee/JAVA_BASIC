/*
 * ■ Type Casting (자료형 변환)
 *  - data type을 변환
 *  - 프리미티브(기본) 자료형에서 사용
 *  1. 묵시적 형 변환
 *   - 큰 자료형에 작은 자료형을 넣는 것
 *   - double(큰) ← int(작은)
 *   - Java가 자동으로 변환
 *  2. 명시적 형 변환 
 *   - 작은 자료형에 큰 자료형을 넣는 것
 *   - int(작은) ← double(큰)
 *   - 데이터 손실이 발생! (직접 개발자가 작업)
 *  3. (심화) 기본, 객체 자료형의 형 변환
 *   - 기본 자료형 ← 객체 자료형(명시적)
 *   - 객체 자료형 ← 기본 자료형(Wrapper class)
 *     ex) int (기본자료형) → Integer(객체자료형)
 * */

package ch02_variable;

public class TypeCasting {
	public static void main(String[] args) {
		// 묵시적 형 변환
		double dVal = 3;  // 묵시적 형 변환 결과: 3 → 3.0
		
		// 명시적 형 변환
		// 3.14 → 3 (0.14의 손실 발생)
		int iVal = (int)3.14;  // (바꾸고싶은 자료형)값
	}
}
