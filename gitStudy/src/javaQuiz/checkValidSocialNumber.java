package javaQuiz;

import java.util.Collection;
import java.util.Scanner;

public class checkValidSocialNumber {
	/*
	 	사용자가 주민등록번호를 입력하면
	 	그 주민등록번호가 유효한지 검사하는 프로그램을 만들어보세요
	 
		맨앞 2자리 숫자
		월 자리에 01 ~ 12 이내의 숫자
		1, 3, 5, 7, 8, 10, 12월은 31일까지
		4, 6, 9, 11월은 30일까지
		2월은 윤년에 29일 아닌날은 28일까지
		7번째 자리 '-'

		뒷자리 전부 숫자
	 */
	// 9 5 1 2 3 1 - 1 1 1 1  1  1  1
	// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkValidSocialNumber(String socialNumber) {
		int length = socialNumber.length();
		
		if (length != 14) {
			System.out.println("길이가 올바르지 않습니다");
			return false;
		}
		for (int i = 0; i < length; i++) {
			char ch = socialNumber.charAt(i);
			if (i < 6 && !checkNumeric(ch)) {	
				System.out.println("앞자리에 숫자가 아닌것이 있습니다");
				return false;
			} else if (i > 6 && !checkNumeric(ch)) {
				System.out.println("뒷자리에 숫자가 아닌것이 있습니다");
				return false;
			}
		}
		
		int year = Integer.parseInt(socialNumber.substring(0, 2)) + 1900;
		int month = Integer.parseInt(socialNumber.substring(2, 4));
		int date = Integer.parseInt(socialNumber.substring(4, 6));

		for (int i = 0; i < length; i++) {
			char ch = socialNumber.charAt(i);
			if (i == 6 && ch != '-') {
				System.out.println("하이픈자리에 다른것이 들어가있습니다");
				return false;
			} else if (month > 12) {
				System.out.println("12월까지밖에 없습니다");
				return false;
			} else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31) {
				System.out.println(month + "월에는 31일까지밖에 없습니다");
				return false;
			} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
				System.out.println(month + "월에는 30일까지밖에 없습니다");
				return false;
			} else if (month == 2) {
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					if (date > 29) {
						System.out.println(year + "년도에는 윤년으로 29일까지밖에 없습니다");
						return false;
					}
				} else {
					if (date > 28) {
						System.out.println(year + "년도에는 윤년이 아니여서 28일까지밖에 없습니다");
						return false;
					}
				}
			}
		}
		System.out.printf("해당 번호 : %s는 유효한 번호입니다", socialNumber);
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("주민등록번호를 입력하세요 > ");
			String userSocialNumber = sc.nextLine();
			if (checkValidSocialNumber(userSocialNumber)) {
				System.out.println();
			}
		}
	}
}











