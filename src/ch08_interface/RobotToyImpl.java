package ch08_interface;

public class RobotToyImpl implements ILight, IMoveBody {
	public RobotToyImpl() {
		System.out.println("나는 아톰");
		canLight();
		canMoveBody();
	}
	@Override
	public void canMoveBody() {
		System.out.println("로켓펀치 발사!");
	}

	@Override
	public void canLight() {
		System.out.println("레이저빔 발사!");
	}

}
