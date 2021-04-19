package javaQuiz;

import java.util.Scanner;

public class C03_CheckWord {

	public static void main(String[] args) {
		/*
			사용자로부터 단어(문자열)를 하나 입력받고
			첫 번째 글자와 마지막 번째 글자가 일치하면 "OK"를 출력
			아니라면 "NOT OK"를 출력해보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력해주세요 > ");
		
		String user_name = sc.nextLine();
		
		int last_index = user_name.length() - 1;
		
		if(user_name.charAt(0) == user_name.charAt(last_index)) {
			System.out.println("OK");
		}else {
			System.out.println("NOT OK");
		}
	}
}









