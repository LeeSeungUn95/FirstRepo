package javaQuiz;

import java.util.Scanner;

public class C20_CountAlphabet {

	public static void main(String[] args) {
		/*
		 	����ڷκ��� ������ �ϳ� �Է¹ް�
		 	�ش� ���忡 � ���ĺ��� �� �� �����ߴ��� ��� ��� ����غ�����
		 	(��ҹ��� ���о��� ����)
		 */
		//�¿�
		int cnt[] = new int[26]; // ���ĺ��� ���� �迭
		Scanner sc = new Scanner(System.in);
		
		String userInput;
		System.out.print("���ڿ��� �Է��ϼ��� > ");
		userInput = sc.nextLine();
		
		for (int i  = 0 ; i < userInput.length() ; i++){
			char ch = userInput.charAt(i); 
			
			if (ch >= 'a' && ch <= 'z') {
				cnt[ch - 'a']++;
			} else if (ch >= 'A' && ch <= 'Z') {
				cnt[ch - 'A']++;
			}
		}
		for (int i = 0; i < 26; i++) {
			
			if (cnt[i] > 0) {
				System.out.printf("%c �� ���� : %d��\n", ('a' + i), cnt[i]);
				
			}
		}
		
		// ����
		
//		String text = "Everythin is alright";
//		
//		// # ���ڿ��� ���� �빮�� �Ǵ� �ҹ��ڷ� ��ȯ�ϱ�
//		text = text.toUpperCase();
//		
//		int[] count = new int[26];
//		
//		for (int i = 0; i < text.length(); i++) {
//			
//			char ch = text.charAt(i);
//			
//			if (ch >= 'A' && ch <= 'Z') {
//				count[ch - 'A']++;
//			}
//		}
		
		
	}
}



















