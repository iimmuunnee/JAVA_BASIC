package ch04_control;

public class While07 {
	public static void main(String[] args) {
		// for문 활용 구구단 2단
		System.out.println("for문 구구단 2단");
		for (int i = 1; i < 10; i++) {
			System.out.println("2 x " + i + " = " + 2 * i);
		}
		
		// while문 활용 구구단 2단
		System.out.println("while문 구구단 2단");
		int j = 1;
		while(j < 10) {
			System.out.println("2 x " + j + " = " + 2 * j);
			j++;
		}
	}
}
