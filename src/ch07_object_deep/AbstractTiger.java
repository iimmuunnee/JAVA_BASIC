package ch07_object_deep;

public class AbstractTiger extends AbstractAnimal {
	public AbstractTiger() {
		this.kind = "포유류";
	}

	@Override
	public void sound() {
		System.out.println("어흥!");
	}
}
