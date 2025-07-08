/*
 * ■ Class
 *  - JAVA는 file을 Class단위로 생성
 *    *.java → 1개의 Class와 매칭
 *  - Class는 객체의 설계 도면
 *    1. Class 작성
 *    2. 객체를 생성
 *    3. 인스턴스 사용
 *  - Pascal 표기법 사용
 *  - Class의 구성요소
 *    1. Field (변수)
 *    2. Constructor (생성자 함수)
 *    3. Method (함수)
 *     
 * ■ Constructor
 *  - 생성자 함수
 *  - 생성자 함수는 객체 생성시 반드시 필요
 *  - 생성자 함수는 이름을 반드시 클래스명과 동일하게 사용
 *    예외: 카멜표기법 X
 *  - return 값 X
 *  - 객체 생성과 동시에 일회성으로 진행하고 싶은 작업
 *  - 멤버 필드값(변수) 초기화 or 메서드를 호출해서 객체를 사용할 준비
 *  - 1개의 Class는 반드시 1개 이상의 생성자 함수가 있어야 함
 *  - 생성자 함수를 선언하지 않으면 JAVA가 자동으로 default 생성자를 생성해서 실행
 *  - 객체 생성을 위한 요소
 *    1. new : 객체 생성 연산자
 *    2. Constructor : 객체 생성자 함수();
 *     ex) new Scanner();
 *  
 * ■ 객체 생성 방법
 *  문법: 객체타입 객체참조변수명 = new 생성자();
 *  ex) MemberDTO mDto = new MemberDTO();
 *   - MemberDTO() 생성자를 통해 객체가 생성
 *     → 인스턴스 → Heap 메모리 영역 할당
 *   - mDto 변수에는 인스턴스가 할당 된 Heap 메모리 주소가 저장
 *   - 사용할 떄는 mDto.~~
 *     .(참조연산자)
 *     
 *  MemberDTO mDto1 = new MemberDTO();
 *  MemberDTO mDto2 = new MemberDTO();
 *  동일한 MemberDTO 클래스를 사용했더라도 생성된 인스턴스들은 별개로 동작
 *  
 *  this 와 super
 *   - this: 생성된 인스턴스를 지칭
 *   - super: 상속받은 부모를 지칭
 */
package ch06_object;

public class Class04 {
	// Default 생성자 함수
	//  - 생성자 생성하지 않는 경우 JAVA가 자동으로 생성
	public Class04() {}
	
	public static void main(String[] args) {
		MemberDTO mDto = new MemberDTO();
//		mDto.id = "chosun_1004"; private으로 외부에서 접근 불가
		mDto.setId("chosun_1004");  // 외부(저장)
		mDto.getId();               // 외부(조회)
		System.out.println(mDto.toString());  // 값 확인
	}
}
