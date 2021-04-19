package javaQuiz;

import java.util.Random;
import java.util.Scanner;

public class C19_GuessNumberGameVer2 {

	public static void main(String[] args) {
		final boolean DEBUGMODE = false;
		Scanner input_scanner = new Scanner(System.in);
		
		StringBuilder answer_builder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			answer_builder.append((int)(Math.random() * 10));
		}
		String answer = answer_builder.toString();
		
		if (DEBUGMODE) {
		System.out.printf("이번 정답 : [%s]\n",answer);
		}
		
		// 기본 타입 변수는 0으로 초기화
		int strike = 0;
		int ball = 0;
		int tryCount = 0;
		
		// 참조형 변수는 null로 초기화 할 수 있다
		String input = null;
		
		while (strike != 4 && tryCount != 8) {
			strike = 0;
			ball = 0;
			
			while (true) {
				System.out.printf("시도 %d >> ", tryCount + 1);
				input = input_scanner.nextLine();
				
				boolean valid = true;
				if (input.length() != 4) {
					valid = false;
				}
				
				for (int i = 0; valid && i < 4; i++) {
					if (input.charAt(i) < '0' || input.charAt(i) > '9') {
						valid = false;
						break;
					}
				}
				
				if (valid) {
					break;
				} else {
					System.out.println("4자리 숫자만 입력하셔야 합니다.");
				}
			}
			//strike, ball 체크
			if (answer.equals(input)) {
				strike = 4;
			} else {
				for (int i = 0; i < 4; i++) {
					if (answer.charAt(i) == input.charAt(i)) {
						strike++;
						
					}					
					for (int j = 0; j < 4; j++) {
						if (answer.charAt(i) == input.charAt(j)) {
							ball++;
							break;
						}
					}
				}
			}
			System.out.printf("%d strike, %d ball!\n", strike, ball);
			
			tryCount++;
		}
		System.out.println("게임 종료");
	}
}




















