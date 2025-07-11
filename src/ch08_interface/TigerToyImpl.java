package ch08_interface;

// 인터페이스 기능
//   1. Light, MoveBody, Sound
public class TigerToyImpl implements IMoveBody, ISound { // 다중 구현
	public TigerToyImpl() {
		System.out.println("나는 호랭이다!");
		canSound();
		canMoveBody();
	}
	
	@Override
	public void canSound() {
		System.out.println("어흥~ 어어흥!");
	}

	@Override
	public void canMoveBody() {
		System.out.println("사냥 포즈를 취합니다.");
	}  
	
}
