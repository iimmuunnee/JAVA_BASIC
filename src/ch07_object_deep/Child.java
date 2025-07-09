package ch07_object_deep;

public class Child extends Parent{  // 자식클래스 extends 부모클래스 → 상속
	public Child() {
		super();  // = Parent(); → 부모 객체가 생성된 후에 자식 객체가 생성
	}

	/*
	 * ■ 오버라이딩
	 *   - 부모 메소드의 실행부분을 수정(재정의)
	 *   - 상속 경우에만 사용 가능
	 * ■ 오버라이딩 규칙
	 *  1. 부모의 메서드와 동일한 시그니처
	 *     (리턴, 메서드이름, 매개변수 리스트)
	 *     → 재정의는 함수 내의 실행문만 재정의 가능
	 *  2. 접근 제한자 사용시 부모의 접근 제한자보다 더 강력한(좁은) 접근 제한 불가
	 *     ex) 부모 default → 자식 public, default
	 *  3. 새로운 예외(Exception)를 throws 할 수 없음
	 *  4. 부모 클래스의 속해 있는 멤버함수의 final 을 붙이면
	 *     최종적인 메서드가 되면서 오버라이딩 불가 
	 * */
	@Override
	public void parentTest() {
		// 부모 메서드 원본 실행하고 싶은 경우
		super.parentTest();
		
		// 자식이 재정의하는 내용
		System.out.println("자식임, 재정의함, 오버라이딩");
	}
		
}
