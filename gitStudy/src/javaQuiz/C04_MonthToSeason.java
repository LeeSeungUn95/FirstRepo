package javaQuiz;

import java.util.Scanner;

public class C04_MonthToSeason {

	public static void main(String[] args) {
		/*
			����ڷκ��� ���� �Է¹����� �ش��ϴ� ������ ����غ�����
			(switch-case���� �̿�)
		 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("��(Month)�� �Է����ּ��� > ");
		int userMonth = sc.nextInt();

		String season;
		
		switch(userMonth) {
		case 3:
		case 4:
		case 5:
			season = "��";
			break;
		case 6:
		case 7:
		case 8:
			season = "����";
			break;
		case 9:
		case 10:
		case 11:
			season = "����";
			break;
		case 12:
		case 1:
		case 2:
			season = "�ܿ�";
			break;
		default :
			season = "�߸��� ����";
			break;
		}
		System.out.println("�Է��Ͻ� " + userMonth + "���� " + season + "�Դϴ�.");
		
	}

}

















