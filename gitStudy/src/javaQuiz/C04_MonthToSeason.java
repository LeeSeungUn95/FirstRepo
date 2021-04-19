package javaQuiz;

import java.util.Scanner;

public class C04_MonthToSeason {

	public static void main(String[] args) {
		/*
			사용자로부터 달을 입력받으면 해당하는 계절을 출력해보세요
			(switch-case문을 이용)
		 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("달(Month)을 입력해주세요 > ");
		int userMonth = sc.nextInt();

		String season;
		
		switch(userMonth) {
		case 3:
		case 4:
		case 5:
			season = "봄";
			break;
		case 6:
		case 7:
		case 8:
			season = "여름";
			break;
		case 9:
		case 10:
		case 11:
			season = "가을";
			break;
		case 12:
		case 1:
		case 2:
			season = "겨울";
			break;
		default :
			season = "잘못된 계절";
			break;
		}
		System.out.println("입력하신 " + userMonth + "월은 " + season + "입니다.");
		
	}

}

















