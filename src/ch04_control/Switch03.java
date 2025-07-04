/*
 * Switch ~ case문
 *  - if문보다는 속도가 빠름
 *    → if문의 경우 조건을 위에서부터 체크하면서 내려감 
 *    → switch문은 조건에 맞는 case문으로 바로 연결
 *  - 하지만 if문에 비해 활용도가 떨어짐
 *  - switch ~ case ~ default
 */

package ch04_control;
import java.util.Scanner;
// 시험에 안 나옴
public class Switch03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 맥주");
		System.out.println("2. 소주");
		System.out.println("3. 양주");
		System.out.print("번호: ");
		int selNum = sc.nextInt();
		
		switch(selNum) {
		case 1:
			System.out.println("3,000원");
			break;
		case 2:
			System.out.println("2,000원");
			break;
		case 3:
			System.out.println("30,000원");
			break;
		default:
			System.out.println("올바른 값을 입력하세요.");
			break;
		}
	}
}
