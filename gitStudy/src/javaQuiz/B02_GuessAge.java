package javaQuiz;

import java.util.Scanner;

public class B02_GuessAge {

	public static void main(String[] args) {
		// ����ڷκ��� �¾�ؿ� ������ �⵵�� �Է¹�����
		// �� ����� �ѱ� ���̸� ����Ͽ� �� ������ �˷��ִ� ���α׷���
		// ����� ������
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�¾ �⵵�� �Է��ϼ��� > ");
		int userYear = sc.nextInt();
		System.out.print("������ �⵵�� �Է��ϼ��� > ");
		int thisYear = sc.nextInt();
		
		int userAge = thisYear - userYear + 1;
		
		System.out.println("������ �⵵ [" + thisYear + "]��");
		System.out.println("�¾ �⵵ [" + userYear + "]��");
		System.out.println("�ѱ� ���̴� [" + userAge + "]�� �Դϴ�");
		
		
	}

}
























