/*
 * 변수: 하나의 값을 저장할 수 있는 메모리 공간 (쪽지시험 외우기!)
 *  + 자료형(Type)
 *  
 * Java의 자료형
 *  1. 기본 자료형(프리미티브 타입) - 8가지 (외우기!)
 *    - 정수: short, byte, int(기본값), long
 *    - 실수: float, double(기본값)
 *    - 문자: char  ex) 'A', '!' | '을 사용해야 문자
 *    - 논리: boolean ex) True, False
 *  2. 참조 자료형(레퍼런스 타입)
 *    - Class
 *    - Array
 *    - 문자열: String  ex) "ABC", "Test", "A" | "을 사용해야 문자열
 *    - 기본자료형을 제외한 모든 자료형 "객체자료형", 첫글자가 대문자면 객체자료형
 * 
 * 기본자료형과 참조자료형의 담겨지는 값의 차이?
 *   - 기본자료형: 변수의 실제 값이 저장
 *   - 참조자료형: 변수에 실제 값이 위치한 주소(번지) 저장
 *  
 * 변수 문법
 * 	1. 선언 및 초기화
 *    int num = 4
 *  2. 선언 따로 초기화 따로
 *    int num;  (선언)
 *    num = 4;  (초기화)
 *    
 * 명명 규칙(Naming Rule) (지필평가 외우기!)
 *  1. 영어 대소문자, 숫자, 특수문자(_)만 사용 
 *  2. 영어 대소문자 구별
 *     ABC abc Abc ABc 모두 다른 변수
 *  3. 숫자로 시작할 수 없음
 *    num01 (o), 01num (x)
 *  4. 예약어 사용 불가
 *    ex) public, class는 예약어
 *  
 * Naming Method (지필평가 외우기!)
 *  1. PascalCase: 첫 글자를 대문자, 합성어의 첫 글자도 대문자  ex) Java(Class), Python(Class)
 *  2. camelCase : 첫 글자는 소문자, 합성어의 첫 글자는 대문자  ex) Java(변수, method)
 *  3. snake_case: 전부 다 소문자, 합성어를 언더바(_)로 구분   ex) Python(변수, method)
 *  4. kebab-case: 전부 다 소문자, 합성어를 하이픈(-)으로 구분  ex) 웹 표준(HTML, CSS)
 *  
 * String 문자열
 *  - String 객체자료형으로 초기화 Null 
 *  - Null: 참조할 대상이 없는 경우!
 *  - String name; (변수 선언) → name(Null) (X)
 *  - System.out.println(name); → NullPointerException 오류 발생
 *  - String name = ""; (O) 빈 문자열로 초기화 및 선언
 */

package ch02_variable;

public class Variable {
	public static void main(String[] args) {
		// 메모리에 4Byte(int) 크기의 공간을 num 변수에 할당
		// 공간에 4라는 값을 대입
		int num = 4;
		
		// 문자형은 아스키코드값으로 활용할 때 사용!
		// 실제 문자 또는 문자열은 모두 String 사용!
		
		char ch1 = 'A';
		System.out.println(ch1);
		char ch2 = 54736;
		System.out.println(ch2);
		
		boolean b1 = true; // true false 소문자
		boolean b2 = false;
		//boolean b3 = True; (X)
		//boolean b4 = TRUE; (X)
		
		int score = 99; // 메모리 일정 공간에 실제 값을 대입 
		String name = "체리"; 
		// 다른 메모리에 실제 객체값(체리)이 힙에 들어가고 스택에 실제 값(체리)이 위치한 *주소가 들어감* (Link)
		// 사용될 때마다 카운팅됨
		// name의 값을 없애면 링크가 끊어지고, 카운팅이 0이 되면 가비지 콜렉터가 객체를 수거한다.
	}
}
