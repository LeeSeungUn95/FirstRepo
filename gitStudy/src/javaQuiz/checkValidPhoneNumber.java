package javaQuiz;

import java.util.Scanner;

public class checkValidPhoneNumber {
	String phoneNumber;
	/*
	 	����ڷκ��� �ڵ��� ��ȣ�� �Է¹����� 
	 	�ùٸ� ��ȭ��ȣ���� �����ϴ� ���α׷��� ��������
	 	
	 	���� 3�ڸ��� ���� 
	 	�߰����ڴ� 3�ڸ� Ȥ�� 4�ڸ�
	 	���������ڴ� 4�ڸ�
	 	4��°, 8��°, 9��° ���ڴ� '-'
	 	
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
		System.out.printf("�´� ��ȣ�Դϴ�. : %s\n", phoneNumber);
	}
	
	public void printFail() {
		System.out.println("�߸��� ��ȣ�Դϴ�.");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		checkValidPhoneNumber validPhoneNumber = new checkValidPhoneNumber();
		
		while (true) {
			System.out.print("�ڵ�����ȣ �Է� > ");
			String userNumber = sc.nextLine();
			validPhoneNumber.checkValid(userNumber);
		}
	}
}











