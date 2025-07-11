package ch07_object_deep;

public abstract class AbstractAnimal {
	// 일반 필드
	String kind;
	
	// 일반 메서드
	public void breath() {
		System.out.println("숨을 쉽니다.");
	}
	
	// 추상 메서드
	public abstract void sound();
}
