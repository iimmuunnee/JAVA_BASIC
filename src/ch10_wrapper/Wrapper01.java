/*
 * Wrapper 클래스
 *   - JAVA는 기본자료형(프리미티브), 객체자료형(레퍼런스) 타입으로 나뉨
 *   - 프리미티브는 변수에 실제값이 저장
 *   - 레퍼런스는 변수에 실제값이 위치한 주소가 저장
 *   - 경우에 따라서 프리미티브 타입을 객체로 전달해야 하는 경우
 *     → Wrapper 클래스 사용
 *   ※ 보안 향상(은닉성)
 *    - 기본자료형 자료형별로 저장되는 메모리 사이즈 상이함
 *    - Wrapper 클래스를 사용하면 객체이기 때문에 
 *      무조건 4Bytes 크기로 고정되어 저장
 * 
 * ■ 기본자료형 (8가지)
 * byte      → Byte
 * short     → Short
 * int       → Integer
 * long      → Long
 * float     → Float
 * double    → Double
 * char      → Character
 * boolean	 → Boolean
 * 
 * ■ Wrapper 클래스 사용법
 *  - 객체 생성해서 사용
 *  - 생성자 매개변수로 프리미티브 타입 값 전달
 *  - Wrapper로 만들기
 *  Integer obj3 = new Integer(458);
 *  Double obj7 = new Double(1.1234);
 *  Boolean obj8 = new Boolean(true);
 *  Character obj10 = new Character('꽃');
 *  
 *  - 기본자료형으로 만들기
 *  int num3 = obj3.intValue();
 *  double num7 = obj7.doubleValue();
 *  boolean num8 = obj8.booleanValue();
 *  char num9 = obj10.charValue();
 *  
 *  ※ 문자열 숫자값을 프리미티브 타입 변환
 *    ex) "123", "3.14"
 *    int num = Integer.parseInt("123");
 *    double num2 = Double.parseDouble("3.14");
 *    
 *    JAVA : 기본 프로그래밍 언어
 *    JAVA Servlet : 웹 프로그래밍 언어
 *    JSP : 웹 프로그래밍 언어
 *    Spring : 레거시 웹 프레임워크
 *    Spring Boot : 웹 프레임워크
 *    
 *    
 */

package ch10_wrapper;

public class Wrapper01 {

}
