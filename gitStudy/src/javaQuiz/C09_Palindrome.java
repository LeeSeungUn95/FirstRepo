package javaQuiz;

import java.util.Scanner;

public class C09_Palindrome {

	public static void main(String[] args) {

		/*
		 	����ڷκ��� �ܾ �ϳ� �Է¹ް�
		 	�ش� �ܾ ȸ���̶�� "PALINDROME"�� ���
		 	ȸ���� �ƴ϶�� "NOT PALINDROME" �� ����غ�����
		 	
		 	�� ȸ���̶� : MOM, BOB, ABBA, MADAM ó�� �¿��Ī�� �ܾ�
		 */
		
//		String result = "PALINDROME";
//		
//		Scanner cs = new Scanner(System.in);
//		
//		System.out.print("�ܾ �Է��ϼ��� > ");
//		String palindrome = cs.nextLine();
//		
//		int i2 = palindrome.length() - 1;
//		
//		for(int i = 0; i < palindrome.length() / 2; i++, i2--) {		
//			
//			char ch1 = palindrome.charAt(i);
//			
//			char ch2 = palindrome.charAt(i2);
//			
//			if(ch1 != ch2) {
//				result = "NOT PALINDROME";
//				break;
//			}
//		}
//		System.out.println("str = " + result);
		
		//�¿�
		
//		String result = "PALINDROME";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("ȸ�� Ȯ�� >> ");
//		String user_palindrome = sc.nextLine();
//		
//		int behind_index = user_palindrome.length() - 1;
//		
//		for(int front_index = 0; front_index < user_palindrome.length() / 2; front_index++, behind_index--) {
//			
//			char text1 = user_palindrome.charAt(front_index);
//			
//			char text2 = user_palindrome.charAt(behind_index);
//			
//			if(text1 != text2) {
//				result = "NOT PALINDROME";
//				break;
//			}
//		}
//		System.out.println("result = " + result);
		
		//���� 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ܾ� �Է� > ");
		String word = sc.next();
		
		String result = "PALINDROME";
		
		for(int i = 0; i < word.length() / 2; i++) {
			
			char ch = word.charAt(i);
			char ch2 = word.charAt(word.length() - i - 1);
			
			if(ch != ch2) {
				result = "NOT PALINDROME";
				break;
			}
		}
		
		System.out.printf("[%s]�� ����� %s�Դϴ�.\n", word, result);
	
	}	
}













