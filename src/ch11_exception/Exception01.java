/*
 * 예외 처리
 *  - 예외란 사용자의 잘못된 조작 또는 개발자의 잘못된 코딩으로 인해
 *    발생하는 프로그램 오류를 뜻함
 *  - 프로그램 실행 중 발생하는 "예외적인 상황"을 줄여서 에외
 *  - 예외는 단순한 문법 오류가 아닌 "정상적이지 않은 상황"
 *  - 예외가 발생하면 프로그램은 곧바로 종료된다는 점에서 에러와 동일
 *  - 예외의 경우 예외처리를 통해 프로그램을 종료하지 않고
 *    정상 실행 상태가 유지되도록 할 수 있음
 *  - 프로그램 실행 시 예상치 못한 일로 예외가 발생했을 때
 *    프로그래머가 원하는 방향으로 움직이도록 만드는 일 예외처리
 *  - JVM은 예외가 발생하면 해당 내용을 간단히 출력 후 종료
 *  - Exception 은 객체로 표현
 *  - 모든 예외 클래스는 java.lang.Exception 클래스 상속
 *  - 예외는 2가지 종류
 *    1) 일반 예외: 컴파일러 체크 → 컴파일러 오류 발생
 *    2) 실행 예외: 개발자 경험에 의해서 예외 처리 코드 삽입
 *  - DB, I/O 반드시 예외처리를 꼭 해줘야 함
 *  
 * ■ 예외 종류
 *  1. NullPointerException
 *  2. ArrayIndexOutBoundsException
 *  3. NumberFormatException
 *  4. ClassCastException
 *  5. ...
 *  
 * ■ 예외처리 종류
 * 1. try ~ catch ~ finally (예외 처리)
 * 2. throw (예외 강제발생: 의도적으로 예외를 강제로 발생)
 * 3. throws (예외 전가: 예외를 처리하지 않고 다음으로 넘김)
 * 4. 사용자 정의 예외 (직접 예외를 만들어서 사용)
 * 
 * ■ 예외처리 문법
 *  1. try: 예외가 발생 할 수도 있는 부분
 *  2. catch: 예외가 발생했을 때 처리하는 부분
 *  3. finally: 예외가 발생하든 안 하든 실행되는 부분, 생략가능
 *   - 자원 반납 (해제)
 */

package ch11_exception;

public class Exception01 {
	public void test1() {
		try {
			// 예외가 발생할 수도 있는 부분
		} catch(NullPointerException e) {
			
		} catch(ClassNotFoundException e) {
			
		} catch(Exception e) {
			// 예외처리 하는 부분
		} finally {
			// 예외가 발생하든 안 하든 실행하는 부분
			// ex) 자원 해제
		}
	}
}
