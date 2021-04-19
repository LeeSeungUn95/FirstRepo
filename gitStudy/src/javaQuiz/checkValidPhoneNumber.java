package javaQuiz;

import java.util.Scanner;

public class checkValidPhoneNumber {
	String phoneNumber;
	/*
	 	사용자로부터 핸드폰 번호를 입력받으면 
	 	올바른 전화번호인지 구분하는 프로그램을 만들어보세요
	 	
	 	앞의 3자리가 숫자 
	 	중간숫자는 3자리 혹은 4자리
	 	마지막숫자는 4자리
	 	4번째, 8번째, 9번째 문자는 '-'
	 	
	 */
//	0 1 0 - 9 8 1 4 - 0 9 1 4
//	0 1 2 3 4 5 6 7 8 9 10 11 12
	public void checkValid(String phoneNumber) {
		int index = phoneNumber.length();
		if (index == 13) {
			for (int i = 0; i < index; i++) {
				if (i == 3 || i == 8) {
					if (phoneNumber.charAt(i) != '-') {
						printFail();
						return;
					}
				} else {
					if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
						printFail();
						return;
					}
				}
			}		
		} else if (index == 12) {
			for (int i = 0; i < index; i++) {
				if (i == 3 || i == 7) {
					if (phoneNumber.charAt(i) != '-') {
						printFail();
						return;
					}
				} else {
					if (phoneNumber.charAt(i) < '0' || phoneNumber.charAt(i) > '9') {
						printFail();
						return;
					}
				}
			}
		} else {
			printFail();
			return;
		}
		System.out.printf("맞는 번호입니다. : %s\n", phoneNumber);
	}
	
	public void printFail() {
		System.out.println("잘못된 번호입니다.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		checkValidPhoneNumber validPhoneNumber = new checkValidPhoneNumber();
		
		while (true) {
			System.out.print("핸드폰번호 입력 > ");
			String userNumber = sc.nextLine();
			validPhoneNumber.checkValid(userNumber);
		}
	}
}











