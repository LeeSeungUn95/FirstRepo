package javaQuiz;

import java.util.Scanner;

public class B06_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
        [ 알맞은 조건식을 만들어보세요 ]

        1. char형 변수 a가 'q'또는 'Q'일 때 true
        2. char형 변수 b가 공백이나 탭이 아닐 때 true
        3. char형 변수 c가 문자('0' ~ '9')일 때 true
        4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
        5. char형 변수 e가 한글일 때 true
        6. char형 변수 f가 일본어일 때 true
        7. 사용자가 입력한 문자열이 exit일 때 true        
                    유니코드 표 참조
		 */        
		
		//1.	
		char a = 'q';
		System.out.println("a가 'q' 또는 'Q'일 때 true : " + (a == 'q' || a == 'Q'));
			
		//2.
		char b = '	';
		System.out.println("b가 공백이나 탭이 아닐 때 true : " + (b != ' ' && b != '	'));
		
		//3.
		char c = 'a';
		System.out.println("c가 문자 '0' ~ '9'일 때 true : " + (c >= '0' && c <= '9'));
		
		//4.
		char d = 'a';
		System.out.println("d가 영문자(대문자 또는 소문자)일 때 true : " + ((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')));
		
		//5.
		char e = '힣';
		System.out.println("e가 한글일 때 true : " + ((e >= 0xAC00) && (e <= 0xD7A3)));
		
		//6.
		char f = 'あ';
		System.out.println("f가 일본어일 때 true : " + ((f >= 0x3040) && (f <= 0x30FF)));
		
		Scanner sc = new Scanner(System.in);
		//7.
		
		System.out.print("아무 영단어나 입력하세요(exit를 입력하시면 true가 나옵니다) > ");
		String userSelect = sc.nextLine();
		System.out.println("사용자가 입력한 문자열이 exit일 때 true : " + (userSelect.equals("exit")));
		
	}
	
	
	
	
	
	
	
}









