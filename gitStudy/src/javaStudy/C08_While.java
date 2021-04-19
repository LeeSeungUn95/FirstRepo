package javaStudy;

import java.util.Scanner;

public class C08_While {

	public static void main(String[] args) {
		/*
		 	# while��
		 		- for���� ������ �ణ �ٸ� �ݺ���
		 		- �ʱⰪ�� �������� ��ġ�� ������ ���� �ʴ�
		 		- ()���� ������ ���ε��� {}���� ������ �ݺ��Ѵ�
		 */
		
		// # while���� ���� �⺻���� ����
		int i = 0;
		
		while (i < 10) {
			System.out.println(i);
			i++;
		}
		
		// # while���� �������� ��ġ�� ���� ����� �޶��� �� �ִ�
		i = 0;
		
		while (i < 10) {
			i++;
			System.out.println("�ݺ��� 2 :" + i);
		}
		
		/*
		 	# while���� ����ϱ� ���Բ� ����� Ŭ�������� �ִ�
		 		- has, next���� ���ľ ���� �Լ�(�޼���)�� ������ �ִ�
		 		- Scanner ��
		 */
		
		Scanner sc1 = new Scanner("Hello, World, Java!!!");
		Scanner sc2 = new Scanner("1234 1588");
		// Scanner.hasNext() - ���� ���� ������ true, ������ false
		while (sc1.hasNext()) {
			// Scanner.next() - ���� �ϳ��� ���� ������ String Ÿ������ ������
			System.out.println(sc1.next());
		}
		
		while (sc2.hasNext()) {
			System.out.println(sc2.next());
		}
	}
}


















