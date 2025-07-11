package ch08_interface;

/*
 * InterfaceA             
 *     ↓ 상속 
 * InterfaceC  ← 상속   InterfaceB
 *     ↓ 구현
 * Class C (InterA, InterB, InterC를 모두 사용 가능)
 */

public class ImplementationC implements InterfaceC{

	@Override
	public void methodA() {
		
	}

	@Override
	public void methodB() {
		
	}

	@Override
	public void methodC() {
	}
	
}
