package javaQuiz;

import java.util.Scanner;

public class B04_celtoFahr {

	public static void main(String[] args) {
		// ����ڷκ��� ���� �µ��� �Է¹�����
		// ȭ�� �µ��� ��ȯ�Ͽ� ������ִ� ���α׷��� ��������
		// (��ȯ ������ ���۸�, ����� �Ҽ� ù° �ڸ� ����)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �µ��� �Է� �Ͻø� ȭ�� �µ��� ��ȯ�ص帳�ϴ� > ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.printf("�Է��Ͻ� ���� �µ��� %.1f�� �̰� ȭ�� �µ��� %.1f�� �Դϴ�", celsius, fahrenheit);
	}

}
