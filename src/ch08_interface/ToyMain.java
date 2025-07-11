package ch08_interface;

// 인터페이스 인터페이스                         클래스
// IToy → IMoveBody | ISound, IMoveBody → tiger
//      → ILight    | ILight, IMoveBody → robot
//      → ISound
public class ToyMain {
	public static void main(String[] args) {
		// 다형성
		IToy tiger = new TigerToyImpl();
		IToy robot = new RobotToyImpl();
	}
}
