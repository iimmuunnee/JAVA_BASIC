/*
 * ■ Method (함수)
 *  - 반복적으로 동작하는 작업들을 함수로 생성하고 호출
 *  - 카멜 표기법 사용
 *  - main(): 가장 먼저 실행!
 *  
 *  (전체 다 통으로 쓰기 지필평가 외우기!)
 * ■ Method 문법
 * 접근 제한자    |   [지정어]   | 반환타입    | 메소드명   |  (매개변수)         {
 * public          static     void       카멜표기법     기본자료형 변수명
 * protected       final      기본자료형                객체자료형 객체참조변수
 * [default]       abstract   객체자료형
 * private
 * 
 *      실행문;
 *      return;
 * }
 * 
 * ■ 매개변수
 *  - 입력 파라미터
 *  - 함수의 입력값 → ()
 * 	  ex) (String name, int age)
 *  - 매개변수로 전달되는 값이 많아지면 
 *    → 객체로 묶어서 전달하면 효율적!
 *    → DTO (Data Transfer Object): 데이터만 전달하는 객체
 *  - 매개변수를 생략 가능 → ()
 * 
 * ■ 함수 사용방법
 *  1. 함수 선언 (함수 작성)
 *  2. 함수 호출 (함수 사용) → 함수이름으로 호출
 * 
 * ■ 함수 종료
 *  - 함수에 있는 모든 코드를 실행하고 호출했던 곳으로 돌아가는 행위
 *  1. } 만나는경우
 *  2. return;을 만나는 경우
 * 
 * ■ 데이터 반환타입
 *  - 함수 호출 → 함수 실행 → 호출한 곳으로 back
 *  - 호출한 곳으로 값을 전달하고 싶은 경우 → return 값
 *  - return 값을 사용하기 위해서는 함수 선언시 데이터 반환타입을 명시해야 함
 *  1. 기본자료형
 *  2. 객체자료형
 *  3. void: return 값을 사용하지 않음
 *  
 *  내장함수, 외장함수, 사용자 정의 함수
 * ■ return
 * ■ 메소드 오버로딩, 오버라이딩
 * ■ 생성자 메소드
 * */
package ch06_object;

public class Method03 {
	
	// 1. 함수 선언
	public static int calcAge(int birth) {
		int age = 2025 - birth + 1;
		return age;  // age는 return value (리턴값) 호출된 곳으로 반환됨
	}
	
	public static void main(String[] args) {
		// 2. 함수 호출
		int age = calcAge(1989);  // age 변수에 calcAge 함수의 반환값이 저장됨
		System.out.println("당신의 나이는: " + age);
		
	}
//	public void test(MemberDTO mDto) {  // 객체로 보내는 예시
//		
//	}
}
