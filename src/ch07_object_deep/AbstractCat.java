package ch07_object_deep;

public class AbstractCat extends AbstractAnimal {
	public AbstractCat() {
		this.kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("애옹");
		
	}
	
}
