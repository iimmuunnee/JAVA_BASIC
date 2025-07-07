/*
 * ■ OOP(객체 지향 프로그래밍)
 *  - 객체지향이란 실세계의 사물을 프로그램으로 표현하기 위한 사고방식
 *  - 사물이 가진 '속성'과 '행위' 설정이 필요
 *  - 사물 → Field(변수)
 *  - 행위 → Method(함수)
 *  - 객체 → Class = Field + Method
 *  - 예시:
 *    1) 우편배달부 객체(class)
 *      - 우편부, 우편, 소포, 등기 → Field(변수)
 *      - 배달한다, 분류한다 → Method(함수)
 *      - (우편부)가 (우편)을 (배달한다.)
 *      
 *  - Class → 객체 설계 도면
 *  - new → 객체 생성 연산자
 *  - new Class(); → Class 객체를 생성
 *  				  → 결과물: 인스턴스
 *  
 * ■ 객체를 사용하기 위한 3단계 (외우기!)
 *  1. Class 작성 (설계도면 작성)
 *  2. 객체 생성 (인스턴스 생성)
 *  3. 인스턴스 사용
 *  
 * ■ 개발 기법 발전 단계
 *  1. 순수 프로그래밍 언어로 개발
 *  2. 디자인 패턴 생성
 *  3. 프레임워크 (여러 디자인 패턴의 묶음)
 *      - 개발 생산성 향상
 *      - 개발자가 귀찮다고 생각하는 일들을 자동으로 변환
 *      
 * ■ 객체지향 장점
 *  1. 코드 재사용성 향상
 *  2. 유지보수 간편
 *  3. 협업능력 향상
 *    1, 2, 3 → 객체(Class)로 하나의 프로그램을 모듈화 시키기 때문에 가능
 *  + 은닉성(캡슐화)     
 */

package ch06_object;

public class OOP01 {
	public static void main(String[] args) {
		/* 
		 * // 사람 (Class) 
		 * 사람 {
		 * 		이름은 "변우석"  // 속성
		 * 		취미는 "연기"   // = 필드(변수)
		 * 
		 * 
		 *     자기소개를 한다 {  // 동작 (함수)
		 *         인사를 한다;
		 *         이름을 말한다;
		 *         취미를 말한다;
		 *     }
		 * 
		 *     인사를 한다 {
		 *         인사말은 "안녕하세요";
		 *         인사말을 한다;
		 *     }
		 * } 
		 */
	}
}


public class Person {
	String name = "변우석";  // 멤버변수(Class 내부) 
	String hobby = "연기";
	
	public void introduce() {  // 함수
		hello();  // 함수
		System.out.println(name);
		System.out.println(hobby);
	}
	
	public void hello() {
		String msg = "안녕하세요";
		System.out.println(msg);
	}
}
