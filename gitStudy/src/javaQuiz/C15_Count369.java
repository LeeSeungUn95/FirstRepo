package javaQuiz;

import java.util.Scanner;

public class C15_Count369 {
	
	public static void main(String[] args) {
		/*
		 	����ڷκ��� ������ �ϳ� �Է¹ް�
		 	�ش� ���ڱ��� 369 ������ ����ȴٸ� �ڼ��� �� �� �� �ľ��ϴ��� �������
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		// �¿�
//		System.out.print("���� �Է� > ");
//		int userNum = sc.nextInt();
//		
//		int count = 0;
//		
//		int i = 0;
//		
//		while (i <= userNum) {
//
//			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
//				if (i % 10 == 3 || i % 10 == 6 || i % 10 ==9) {
//					count++;
//					System.out.println(i);
//				}else {
//					count++;
//					System.out.println(i);
//				}
//			}else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				count++;
//				System.out.println(i);
//			}
//			i++;			
//		}
//		System.out.println("�� �ڼ� Ƚ�� : " + count);
		
		// ����
		
		//1. ���ڿ��� Ǯ��
		
		System.out.print("���� �Է� > ");
		int input = sc.nextInt();
		int count = 0;
		
		for (int i = 1 ; i <= input; i++) {
			String num_str = "" + i;
			
			for (int j = 0; j < num_str.length(); j++) {
				char num_ch = num_str.charAt(j);
				if (num_ch == '3' || num_ch == '6' || num_ch == '9') {
					count++;
					System.out.println(i);
				}
			}
		}
		System.out.println("�� �ڼ� Ƚ�� : " + count);

		
//		System.out.print("���� �Է� > ");
//		int input = sc.nextInt();
//		
//		int cnt = 0;
//		int i = 0;
//		
//		while (i < input) {
//			i++;
//			
//			int one_unit = i % 10;                             //    1�� ���� �߶󳻱�
//			int ten_unit = (i % 100 - one_unit) / 10;          //   10�� ���� �߶󳻱�
//			int hundred_unit = (i % 1000 - i % 100) / 100;     //  100�� ���� �߶󳻱�
//			int thousand_unit = (i % 10000 - i % 1000) / 1000; // 1000�� ���� �߶󳻱�  
//			
//			if (one_unit % 3 == 0 && one_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} else if (ten_unit % 3 == 0 && ten_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} else if (hundred_unit % 3 == 0 && hundred_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} else if (thousand_unit % 3 == 0 && thousand_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} 
//		}
//		System.out.println("�� �ڼ� Ƚ�� : " + cnt);
	}
}















