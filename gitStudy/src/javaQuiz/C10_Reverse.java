package javaQuiz;

import java.util.Scanner;

public class C10_Reverse {

	public static void main(String[] args) {
		/*
		 	����ڰ� ������ �Է��ϸ� �� ������ �Ųٷ� ����غ�����
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� �Է� > ");
		String user = sc.nextLine();
		
		for(int i = user.length() - 1; i >= 0; i--) {
			
			System.out.print(user.charAt(i));	
		}
	}
}












