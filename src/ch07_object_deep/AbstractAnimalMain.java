package ch07_object_deep;

public class AbstractAnimalMain {
	public static void main(String[] args) {
		AbstractCat cat = new AbstractCat();
		AbstractTiger tiger = new AbstractTiger();
		
		cat.sound();
		tiger.sound();
		System.out.println("==========");
		
		// 변수 자동타입변환
		AbstractAnimal animal = null;
		animal = new AbstractCat();
		animal.sound();
		animal = new AbstractTiger();
		animal.sound();
		System.out.println("==========");
		
		// 메소드 다형성
		animalSound(new AbstractCat());
		animalSound(new AbstractTiger());
	}
	public static void animalSound(AbstractAnimal animal) {
		animal.sound();
	}
}
