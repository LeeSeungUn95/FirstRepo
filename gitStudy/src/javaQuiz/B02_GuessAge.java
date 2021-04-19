package javaQuiz;

import java.util.Scanner;

public class B02_GuessAge {

	public static void main(String[] args) {
		// 사용자로부터 태어난해와 올해의 년도를 입력받으면
		// 그 사람의 한국 나이를 계산하여 몇 살인지 알려주는 프로그램을
		// 만들어 보세요
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 년도를 입력하세요 > ");
		int userYear = sc.nextInt();
		System.out.print("올해의 년도를 입력하세요 > ");
		int thisYear = sc.nextInt();
		
		int userAge = thisYear - userYear + 1;
		
		System.out.println("올해의 년도 [" + thisYear + "]년");
		System.out.println("태어난 년도 [" + userYear + "]년");
		System.out.println("한국 나이는 [" + userAge + "]세 입니다");
		
		
	}

}
























