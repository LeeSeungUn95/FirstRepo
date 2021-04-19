package javaQuiz;

import java.util.Scanner;

public class C07_Is_contain_alpha {

	public static void main(String[] args) {

		// i 는 iterable의 줄임말
		
		/*
			사용자가 입력한 문자열에 
			알파벳이 포함되어 있으면 true를 출력
			없으면 false를 출력
		 */
	
		// 승운
		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("아무거나 입력해보세요 > ");
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
		
		//강사 
		
		String word = "I have a dream";
		String word2 = "나는 꿈이 있어요";
		boolean contain_alpha = false;
		//반복문을 이용해 문자열을 한 글자씩 분해하여 검사한다
		for(int index = 0; index < word.length(); index++) {
			
			char ch = word.charAt(index);
			
			if((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
				// 하나씩 분리한 문자 ch가 알파벳인 경우 도착하는 곳
				contain_alpha = true;
				break;
			}
		}
		System.out.println("contain_alpha = " + contain_alpha);
	}
}













