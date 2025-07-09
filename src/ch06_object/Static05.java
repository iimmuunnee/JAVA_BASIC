
/*
 * ■ static 지정어
 *  - 객체생성을 하지 않고 바로 사용 가능!
 *  - 일반: 객체 생성 → 인스턴스 → 인스턴스.필드;
 *     → Class 객체 설계 도면(종이)
 *     → 객체생성 → 생성한 객체가 heap 메모리 영역 할당
 *  - static: 클래스명.필드; 
 *     → 프로그램 시작과 동시에 OS가 관리하는 메모리 영역 할당
 * 
 * ■ static 사용하는 이유
 *   - 자원 공유 목적으로 많이 사용!
 *     ex) 상수 표현할 때
 *         static final int num = 4;
 *   - Singleton 디자인 패턴
 *     → [객체 생성 → 인스턴스 사용] 반복해서 사용
 *     → 객체생성 1회 → 생성된 인스턴스를 공유해서 사용
 * ■ static 사용시 주의할 점
 *  1. 정적 메서드, 정적 블록문 내에서는 인스턴스 필드와 인스턴스 메소드 사용 불가
 *  2. this 키워드도 사용 불가
 *  3. static 으로 선언한 필드와 메소드는 사용 가능
 *  4. 편리하다고 static 자주 사용 X
 * */
package ch06_object;

public class Static05 {
	public static void test() {  // static 을 지우면 메모리 영역에 할당 되지 않아서 main 에서 사용하지 못함.
		System.out.println("TEST");
	}
	
	public static void main(String[] args) {
		test();
	}
}
