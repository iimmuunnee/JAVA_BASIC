package ch07_object_deep;

public class Employee {
	
	private String name;
	private String position;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	
	public void workIn() {
		System.out.println(this.name + " 출근");
	}
	public void workOut() {
		System.out.println(this.name + " 퇴근");
	}
	public void work() {
		System.out.println(this.name + " 일하는 중");
	}
	

	
}
