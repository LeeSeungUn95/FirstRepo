package javaStudy;

import java.util.Random;

public class C09_Random {

	public static void main(String[] args) {
		/*
		 	# JAVA���� ������ ���� �����ϱ�
		 	
		 	1. Math.random();
		 		- doubleŸ���� ���� �Ҽ��� �����Ѵ� (0 <= x < 1)
		 		- �� ���� �Ҽ��� �̿��Ͽ� ���ϴ� ������ ���ڸ� ���� �� �ִ�
		 
		 		�� ���ϴ� ������ ���ڸ� ����� ���� (ex: 30 ~ 60)
		 			(1) ������ ���� �Ҽ��� ���ϴ� ������ ������ ���Ѵ� (31��)
		 				(0 * 31 <= x < 1 * 31)
		 			(2)	���ϴ� ���� �� ���� ���� ���� ���ڸ� ���Ѵ� (30)
		 				(0 * 31 + 30 <= x < 1 * 31 + 30 )
		 			(3) �Ҽ��� �Ʒ��� �����Ѵ�
		 				-> Math.floor() �Ǵ� int�� Ÿ�� ĳ������ �Ѵ�
		 	
		 */
//		for (int i = 0; i < 10; i++) {
//			System.out.println((int)(Math.random() * 31 + 30));
//		}
		
		// ���� ���� : 1 ~ 45�� ���� ���ڸ� 7�� ����غ�����
		
//		for (int i = 0; i < 7 ; i++) {
//			System.out.println((i + 1) + "��° ���� : " + (int)(Math.random() * 45 + 1));
//		}
//		System.out.println();
//		
//		int i = 0;
//		while (i < 7) {
//			System.out.println((i + 1) + "��° ���� : " + (int)(Math.random() * 45 + 1));
//			i++;
//		}
		
		/*
		 	2. random Ŭ����
		 		- �� �� ���ϰ� ���� ���� ������ �� �ִ� ��ɵ��� ���ִ� Ŭ����
		 		- ������ �� ������ ���� �õ尡 �����ȴ�
		 		- ���ϴ� ���� �õ带 ������ �� �� �ִ�
		 */
		
		// # ���ο� ���� �õ� ����
		Random ran = new Random();
		
		// # Random.nextInt(bound)
		// 	- 0 ~ bound �̸��� ������ ��ȯ�Ѵ�
		System.out.println(ran.nextInt(45) + 1);  //  1 ~ 45�� ���� ����
		System.out.println(ran.nextInt(41) + 30); // 30 ~ 70�� ��������
		System.out.println(ran.nextInt(3) + 1);
		System.out.println(ran.nextInt());
		System.out.println(ran.nextInt());
		
		// # Random.nextBoolean()
		//	- Random Ŭ������ ���ϴ� Ÿ���� ���� ���� ���� ���� �� �ִ�
		System.out.println(ran.nextBoolean() ? "��" : "��");
	}
}

























