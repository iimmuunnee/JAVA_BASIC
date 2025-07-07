package ch04_control;

import java.util.Scanner;

public class Solution10 {
	public static void main(String[] args) {
		/*
		 *  BMI 지수 공식 = 몸무게(kg) / (신장(m) * 신장(m))
		 *  18.5 미만: 저체중
		 *  18.5 ~ 23 미만: 정상
		 *  23 ~ 25 미만: 과체중
		 *  25 ~ 30 미만: 비만
		 *  30 이상: 고도비만
		 */
		
		// 1. 입력부
		// - 신장(cm)
		// - 몸무게(kg)
		Scanner sc = new Scanner(System.in);
		System.out.println("------------");
		System.out.println("BMI 계산기");
		System.out.println("------------");
		System.out.print("이름: ");
		String name = sc.nextLine();
		System.out.print("신장(cm): ");
		int height = sc.nextInt();
		System.out.print("몸무게(kg): ");
		int weight = sc.nextInt();
		
		// cm -> m 단위 변환
		double heightM = (double)height / 100.0; 

		// 2. 처리부
		//  - bmi 지수 계산
		//  - bmi 지수 고도비만, 비만, 과체중, 정상, 저체중 분류
		double bmiValue = weight / (heightM * heightM);
		String bmiClass = "";
		
		if (bmiValue < 18.5) {
			bmiClass = "저체중";
		} else if (bmiValue >= 18.5 && bmiValue < 23) {
			bmiClass = "정상";
		} else if (bmiValue >= 23 && bmiValue < 25) {
			bmiClass = "과체중";
		} else if (bmiValue >= 25 && bmiValue < 30) {
			bmiClass = "비만";
		} else if (bmiValue >= 30) {
			bmiClass = "고도비만";
		}
		
		// 3. 출력부
		//  - bmi 지수와 분류 결과를 출력
		System.out.println(name + "님의 BMI지수는 " + bmiValue + "로 " + bmiClass + "입니다.");
	}
}
