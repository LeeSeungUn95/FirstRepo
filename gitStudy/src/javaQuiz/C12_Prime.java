package javaQuiz;

import java.util.Scanner;

public class C12_Prime {

	public static void main(String[] args) {
		/*
		 	����ڷκ��� ���ڸ� �Է¹�����
		 	1���� �Է��� ���� ���̿� �����ϴ� �Ҽ��� ��� ����غ�����
		 	
		 	�� �Ҽ� : 1�� �ڱ��ڽ����θ� ������ �������� ��
		 	ex : 7, 11, 13, 17
		 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("���� �Է� > ");
		int userSelect = sc.nextInt();

		int count = 0;
		
		for (int num = 2; num <= userSelect; num++) {
			int i;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.printf("[%d]�� [%d]�� ������ ���������ϴ�.\n", num, i);
					break;
				}
			}
			if (num == i) {
				count++;
				System.out.printf("[%d]�� �Ҽ��Դϴ�.\n", num);
			}
			System.out.println("-----------------------------");
		}
		System.out.println("�Ҽ��� ���� : " + count);
	}
}











