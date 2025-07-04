package ch04_control;
import java.util.Scanner;

public class If02 {
	public static void main(String[] args) {
		/*
		 * A: 91 ~ 100
		 * B: 81 ~ 90
		 * C: 71 ~ 80
		 * D: 61 ~ 70
		 * F: 60점 이하 
		 */
		
		// 1. 입력부
		//  - 사용자의 이름과 점수를 입력 받음
		Scanner sc = new Scanner(System.in);  // Scanner 객체 생성
		System.out.print("이름: ");
		String name = sc.nextLine();  // 사용자 이름, 문자열 이외의 값이 들어오면 에러
		System.out.print("점수: ");		
		int score = sc.nextInt();  // 사용자 점수, 정수형 숫자 이외의 값이 들어오면 에러, 숫자 이후의 엔터 \n(개행)가 문자열로 취급되서 nextLine에 들어감
		// nextLine이 밑에 있으면 nextLine()을 한번 더 써야 됨
		
		// System.out.println(name + ", " + score);
		// 2. 처리부
		// 	- 전달받은 점수를 사용하여 학점 계산
		String grade = "";  // 학점
		if (score > 100 || score < 0) {  // 유효성 검사: 범위 이외의 수부터 처리하면 그 다음 조건들이 간단해짐
			System.out.println("올바른 값을 입력하세요.");
		} else if (score >= 91) {  // 유효성 검사로 && score <= 100가 불필요함
			grade = "A";
		} else if (score >= 81) {
			grade = "B";
		} else if (score >= 71) {
			grade = "C";
		} else if (score >= 61) {
			grade = "D";
		} else {
			grade = "F";
		}
		
		System.out.println("grade: " + grade);
	
		// 3. 출력부
		//  - 사용자에게 학점을 출력
		System.out.println(name + " 학생의 점수는 " + score + "점으로");
		System.out.println(grade + "학점 입니다.");
		
	}
}
