package ch07_object_deep;

public class Company {
	public static void main(String[] args) {
		// 상속을 하더라도 부모 단독으로 사용 가능!
		Employee emp = new Employee();
		Parttime pt = new Parttime();
		
		emp.setName("홍길동");
		emp.setPosition("일반사원");
		// Employee(부모) setPosition() 상속받아서 사용
		pt.setPosition("알바생");
		
		emp.work();
		pt.work();
	}
}
