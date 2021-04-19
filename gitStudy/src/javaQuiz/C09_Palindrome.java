package javaQuiz;

import java.util.Scanner;

public class C09_Palindrome {

	public static void main(String[] args) {

		/*
		 	사용자로부터 단어를 하나 입력받고
		 	해당 단어가 회문이라면 "PALINDROME"을 출력
		 	회문이 아니라면 "NOT PALINDROME" 을 출력해보세요
		 	
		 	※ 회문이란 : MOM, BOB, ABBA, MADAM 처럼 좌우대칭인 단어
		 */
		
//		String result = "PALINDROME";
//		
//		Scanner cs = new Scanner(System.in);
//		
//		System.out.print("단어를 입력하세요 > ");
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
		
		//승운
		
//		String result = "PALINDROME";
//		
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("회문 확인 >> ");
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
		
		//강사 
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("단어 입력 > ");
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
		
		System.out.printf("[%s]의 결과는 %s입니다.\n", word, result);
	
	}	
}













