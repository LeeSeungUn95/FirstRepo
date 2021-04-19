package javaQuiz;

import java.util.Scanner;

public class C08_Is_numeric_str {

	public static void main(String[] args) {
		/*
		 	입력받은 문자열에 숫자만 포함되어 있으면 result가 1
		 	다른 문자가 포함되어 있다면 result가 0
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		//승운
//		System.out.print("아무거나 입력해주세요 > ");
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
		// 강사
		System.out.print("입력 > ");
		String word = sc.nextLine();
		
		int numeric_str = 1;
		
		for(int i = 0; i < word.length(); i++) {
			
			char ch = word.charAt(i);
			
			if(ch < '0' || ch > '9') {
				numeric_str = 0;
				break; // 숫자가 아닌 다른 문자를 하나라도 찾으면 그만 찾음.
			}
		}
		System.out.println("numeric_str : " + (numeric_str > 0 ? "true" : "false"));
	}
}















