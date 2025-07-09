package ch07_object_deep;

public class Parttime extends Employee {
	private String shift; // 교대

	public String getShift() {
		return shift;
	}

	public void setShift(String shift) {
		this.shift = shift;
	}

	@Override
	public void work() {
		// super.work();  부모의 work() 실행
		System.out.println(getPosition() + "입니다. 파트타임으로 일합니다.");
	}
	
	
	
}
