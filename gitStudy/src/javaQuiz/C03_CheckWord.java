package javaQuiz;

import java.util.Scanner;

public class C03_CheckWord {

	public static void main(String[] args) {
		/*
			����ڷκ��� �ܾ�(���ڿ�)�� �ϳ� �Է¹ް�
			ù ��° ���ڿ� ������ ��° ���ڰ� ��ġ�ϸ� "OK"�� ���
			�ƴ϶�� "NOT OK"�� ����غ�����
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ڿ��� �Է����ּ��� > ");
		
		String user_name = sc.nextLine();
		
		int last_index = user_name.length() - 1;
		
		if(user_name.charAt(0) == user_name.charAt(last_index)) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}
}









