package javaQuiz;

import java.util.Scanner;

public class C13_GCD {

	public static void main(String[] args) {
		/*
		 	�� ���ڸ� �Է¹ް� �� ������ �ִ� ������� ���غ�����
		 	�� �ִ����� : �μ����� ������� ���� ū �����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("ù��° �����Է� > ");
		int fNum = sc.nextInt();
		System.out.printf("�ι�° �����Է� > ");
		int sNum = sc.nextInt();
		
//		int minFactor = 0;
//		
//		for (int i = 2; i <= fNum && i <= sNum; i++) {
//			
//			if (fNum % i == 0 && sNum % i == 0) {
//				minFactor = i;
//			}
//		}
//		System.out.println("�ִ� ����� : " + minFactor);

		int gcd = 1;
		
		int min = Math.min(fNum, sNum);
		int max = Math.max(fNum, sNum);
		for(int i = 1; i < min; i++) {
			
			if (fNum % i == 0 && sNum % i == 0) {
				gcd = i;
			}
		}
		System.out.println("�ִ� ����� : " + gcd);
	}
}











