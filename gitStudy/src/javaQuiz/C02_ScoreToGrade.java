package javaQuiz;

import java.util.Scanner;

public class C02_ScoreToGrade {

	public static void main(String[] args) {
		/*
			������ �Է¹����� ������ �ش��ϴ� ����� ������ִ� ���α׷��� �ۼ��غ�����.
			90�� �̻� : A���
			80�� �̻� : B���
			70�� �̻� : C���
			60�� �̻� : D���
			�� �� : F���
		 */

		Scanner sc = new Scanner(System.in);
		
		int user_Score;
		
		
		System.out.print("������ �Է��Ͻø� �ش� ����� �˷��帳�ϴ�> ");
		user_Score = sc.nextInt();
		if(user_Score > 100 || user_Score < 0) {
			System.out.println("0 ~ 100�� ������ �����մϴ�.");
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
			
			System.out.println(grade + "���");
		}
	}
}









