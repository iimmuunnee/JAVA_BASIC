package ch06_object;

// 싱글톤 디자인 패턴
//  - 객체생성은 1회만 하고 생성된 인스턴스를 빌려서 사용하는 방법

public class SingletonTest {
	// 2. 객체 생성 1회 진행 → instance 빌려서 사용!
	//  - 외부에서 직접 접근 불가 - private
	//  - static 사용해서 객체 생성 없이 사용
	private static SingletonTest instance = new SingletonTest();
	
	// 1. 외부에서 객체 생성 막기 private
	private SingletonTest() {}
	
	// 3. 생성된 instance 를 return 으로 빌려서 사용
	public static SingletonTest getInstance() {
		if (instance == null) {
			instance = new SingletonTest();
		}
		return instance;
	}
}
