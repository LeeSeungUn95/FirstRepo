package javaQuiz;

import java.util.Scanner;

public class C06_ForBasicQuiz {

	public static void main(String[] args) {
		/*
		 	����ڰ� ���ڸ� �Է����� ��
		 	1. 10���� �Է��� ���ڱ����� �� ���� ���غ�����
		 	
		 	2. 1���� �Է��� ���� ������ 5�� ����� ��� ����غ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		int start1 = 10, start2 = 1;
		
		int end1 = -50, end2 = -50;
		int sum = 0;
	 	
		// ���� start���� end������ ũ�ٸ�, �� ���� ��ȯ�Ѵ�
		if(start1 > end1) {
			int temp = start1;
			start1 = end1;
			end1 = temp;
		}
		
		if(start2 > end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		}
		
		for (int i = start1; i <= end1; i++) {
			sum += i;
		}
		System.out.printf("10 ���� %d ������ ���� �� : %d\n", end1, sum);
		
		System.out.println();
		System.out.printf("1 ~ %d ������ 5�� ����� ��� \n", start2);
		for (int i = start2; i <= end2; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}


















