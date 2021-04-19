package javaQuiz;

import java.util.Scanner;

public class C20_CountAlphabet {

	public static void main(String[] args) {
		/*
		 	사용자로부터 문장을 하나 입력받고
		 	해당 문장에 어떤 알파벳이 몇 번 등장했는지 세어서 모두 출력해보세요
		 	(대소문자 구분없이 셀것)
		 */
		//승운
		int cnt[] = new int[26]; // 알파벳을 위한 배열
		Scanner sc = new Scanner(System.in);
		
		String userInput;
		System.out.print("문자열을 입력하세요 > ");
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
				System.out.printf("%c 의 개수 : %d개\n", ('a' + i), cnt[i]);
				
			}
		}
		
		// 강사
		
//		String text = "Everythin is alright";
//		
//		// # 문자열을 쉽게 대문자 또는 소문자로 변환하기
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



















