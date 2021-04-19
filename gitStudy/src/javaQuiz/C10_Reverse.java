package javaQuiz;

import java.util.Scanner;

public class C10_Reverse {

	public static void main(String[] args) {
		/*
		 	사용자가 문장을 입력하면 그 문장을 거꾸로 출력해보세요
		 */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장 입력 > ");
		String user = sc.nextLine();
		
		for(int i = user.length() - 1; i >= 0; i--) {
			
			System.out.print(user.charAt(i));	
		}
	}
}












