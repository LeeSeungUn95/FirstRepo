package javaQuiz;

import java.util.Collection;
import java.util.Scanner;

public class checkValidSocialNumber {
	/*
	 	����ڰ� �ֹε�Ϲ�ȣ�� �Է��ϸ�
	 	�� �ֹε�Ϲ�ȣ�� ��ȿ���� �˻��ϴ� ���α׷��� ��������
	 
		�Ǿ� 2�ڸ� ����
		�� �ڸ��� 01 ~ 12 �̳��� ����
		1, 3, 5, 7, 8, 10, 12���� 31�ϱ���
		4, 6, 9, 11���� 30�ϱ���
		2���� ���⿡ 29�� �ƴѳ��� 28�ϱ���
		7��° �ڸ� '-'

		���ڸ� ���� ����
	 */
	// 9 5 1 2 3 1 - 1 1 1 1  1  1  1
	// 0 1 2 3 4 5 6 7 8 9 10 11 12 13
	private static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9';
	}
	
	public static boolean checkValidSocialNumber(String socialNumber) {
		int length = socialNumber.length();
		
		if (length != 14) {
			System.out.println("���̰� �ùٸ��� �ʽ��ϴ�");
			return false;
		}
		for (int i = 0; i < length; i++) {
			char ch = socialNumber.charAt(i);
			if (i < 6 && !checkNumeric(ch)) {	
				System.out.println("���ڸ��� ���ڰ� �ƴѰ��� �ֽ��ϴ�");
				return false;
			} else if (i > 6 && !checkNumeric(ch)) {
				System.out.println("���ڸ��� ���ڰ� �ƴѰ��� �ֽ��ϴ�");
				return false;
			}
		}
		
		int year = Integer.parseInt(socialNumber.substring(0, 2)) + 1900;
		int month = Integer.parseInt(socialNumber.substring(2, 4));
		int date = Integer.parseInt(socialNumber.substring(4, 6));

		for (int i = 0; i < length; i++) {
			char ch = socialNumber.charAt(i);
			if (i == 6 && ch != '-') {
				System.out.println("�������ڸ��� �ٸ����� ���ֽ��ϴ�");
				return false;
			} else if (month > 12) {
				System.out.println("12�������ۿ� �����ϴ�");
				return false;
			} else if ((month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) && date > 31) {
				System.out.println(month + "������ 31�ϱ����ۿ� �����ϴ�");
				return false;
			} else if ((month == 4 || month == 6 || month == 9 || month == 11) && date > 30) {
				System.out.println(month + "������ 30�ϱ����ۿ� �����ϴ�");
				return false;
			} else if (month == 2) {
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
					if (date > 29) {
						System.out.println(year + "�⵵���� �������� 29�ϱ����ۿ� �����ϴ�");
						return false;
					}
				} else {
					if (date > 28) {
						System.out.println(year + "�⵵���� ������ �ƴϿ��� 28�ϱ����ۿ� �����ϴ�");
						return false;
					}
				}
			}
		}
		System.out.printf("�ش� ��ȣ : %s�� ��ȿ�� ��ȣ�Դϴ�", socialNumber);
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("�ֹε�Ϲ�ȣ�� �Է��ϼ��� > ");
			String userSocialNumber = sc.nextLine();
			if (checkValidSocialNumber(userSocialNumber)) {
				System.out.println();
			}
		}
	}
}











