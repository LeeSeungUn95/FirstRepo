package javaQuiz;

import java.util.Scanner;

public class C07_Is_contain_alpha {

	public static void main(String[] args) {

		// i �� iterable�� ���Ӹ�
		
		/*
			����ڰ� �Է��� ���ڿ��� 
			���ĺ��� ���ԵǾ� ������ true�� ���
			������ false�� ���
		 */
	
		// �¿�
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�ƹ��ų� �Է��غ����� > ");
//		String userStr = sc.nextLine();
//		
//		boolean strCheck = true;
//		for(int i = 0; i <= userStr.length() -1; i++) {
//			if(userStr.charAt(i) >= 'a' && userStr.charAt(i) <= 'z') {		
//				strCheck = true;
//				break;
//			}else if(userStr.charAt(i) >= 'A' && userStr.charAt(i) <= 'Z'){
//				strCheck = true;
//				break;
//			}else{
//				strCheck = false;
//			}
//		}
//		System.out.println(strCheck);
		
		//���� 
		
		String word = "I have a dream";
		String word2 = "���� ���� �־��";
		boolean contain_alpha = false;
		//�ݺ����� �̿��� ���ڿ��� �� ���ھ� �����Ͽ� �˻��Ѵ�
		for(int index = 0; index < word.length(); index++) {
			
			char ch = word.charAt(index);
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				// �ϳ��� �и��� ���� ch�� ���ĺ��� ��� �����ϴ� ��
				contain_alpha = true;
				break;
			}
		}
		System.out.println("contain_alpha = " + contain_alpha);
	}
}













