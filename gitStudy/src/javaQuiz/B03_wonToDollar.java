package javaQuiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		// �ѱ� ���� �Է��ϸ� �̱� �޷��� ȯ�����ִ� ���α׷��� ��������
		// (���� ȯ���� ���� �˻�, �Ҽ� ��° �ڸ����� ���, ȯ�� ������ 1.75%)
		Scanner sc = new Scanner(System.in);
		//�¿�//
		
//		String banner = "========== ȯ���ý��� ==========";
//		
//		double usMoney = 1122.48;
//		double userMoney;
//		int koreanMoney;
//		
//		System.out.println(banner);
//		System.out.print("�̱� �޷��� ȯ���ް� ���� �ѱ� ���� �Է��ϼ��� > ");
//		koreanMoney = sc.nextInt();
//		
//		double fees = koreanMoney * 0.0175;
//		
//		userMoney = (koreanMoney - fees) / usMoney;
//		
//		System.out.printf("�Է��Ͻ� �ݾ��� %d�� �Դϴ�\n", koreanMoney);
//		System.out.printf("���� ȯ���� 1 �޷��� %f�� �Դϴ�\n", usMoney);
//		 
//		System.out.println("-----ȯ�� ������ 1.75%-----");
//		System.out.printf("ȯ�� ������ �޷��� %.2f�޷� �Դϴ�\n", userMoney);
//		
		//����
		
		// final�� �Բ� ����� ������ ���߿� ���� ������ �� ����
		final double WON_TO_DOLLAR = 0.00089;

		System.out.print("�ѱ� ���� �Է� ���ּ���. �޷��� �ٲ�帳�ϴ�.(������ 1.75%) > ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		
		System.out.printf("%d���� %.2fUSD�Դϴ�. \n", korMoney, (usd * 0.9825));
	}

}












