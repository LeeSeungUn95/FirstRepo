package javaQuiz;

import java.util.Scanner;

public class C08_Is_numeric_str {

	public static void main(String[] args) {
		/*
		 	�Է¹��� ���ڿ��� ���ڸ� ���ԵǾ� ������ result�� 1
		 	�ٸ� ���ڰ� ���ԵǾ� �ִٸ� result�� 0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		//�¿�
//		System.out.print("�ƹ��ų� �Է����ּ��� > ");
//		String userStr = sc.nextLine();
//		
//		int result = 1;
//		
//		for(int i = 0; i <= userStr.length() - 1; i++) {
//			if(userStr.charAt(i) < '0' || userStr.charAt(i) > '9') {
//				result = 0;
//				break;
//			}
//		}
//		System.out.println("result : "+ result);
//		
		// ����
		System.out.print("�Է� > ");
		String word = sc.nextLine();
		
		int numeric_str = 1;
		
		for(int i = 0; i < word.length(); i++) {
			
			char ch = word.charAt(i);
			
			if(ch < '0' || ch > '9') {
				numeric_str = 0;
				break; // ���ڰ� �ƴ� �ٸ� ���ڸ� �ϳ��� ã���� �׸� ã��.
			}
		}
		System.out.println("numeric_str : " + (numeric_str > 0 ? "true" : "false"));
	}
}















