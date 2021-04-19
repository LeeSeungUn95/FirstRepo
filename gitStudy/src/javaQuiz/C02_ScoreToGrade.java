package javaQuiz;

import java.util.Scanner;

public class C02_ScoreToGrade {

	public static void main(String[] args) {
		/*
			점수를 입력받으면 점수에 해당하는 등급을 출력해주는 프로그램을 작성해보세요.
			90점 이상 : A등급
			80점 이상 : B등급
			70점 이상 : C등급
			60점 이상 : D등급
			그 외 : F등급
		 */

		Scanner sc = new Scanner(System.in);
		
		int user_Score;
		
		
		System.out.print("점수를 입력하시면 해당 등급을 알려드립니다> ");
		user_Score = sc.nextInt();
		if(user_Score > 100 || user_Score < 0) {
			System.out.println("0 ~ 100점 까지만 가능합니다.");
		}else {
			char grade = 'F';
			
			if(user_Score >= 90) {
				grade = 'A';			
			}else if(user_Score >= 80) {
				grade = 'B';
			}else if(user_Score >= 70) {
				grade = 'C';			
			}else if(user_Score >= 70) {
				grade = 'D';
			}else if(user_Score >= 60) {
				grade = 'E';
			}else{
				grade = 'F';
			}
			
			System.out.println(grade + "등급");
		}
	}
}









