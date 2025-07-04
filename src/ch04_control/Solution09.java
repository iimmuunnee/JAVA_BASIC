package ch04_control;
import java.util.Scanner;

public class Solution09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int total = 0;
		System.out.print("번호: ");
		int num = sc.nextInt();
		
		// 직접 구현
		while (num != 0) {
			total += num % 10;
			num = num / 10;
		}
		
		System.out.println("총합: " + total);
		
	}
}
