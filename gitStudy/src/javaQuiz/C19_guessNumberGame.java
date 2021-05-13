package javaQuiz;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class C19_guessNumberGame {
	/*
	 게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다
	 
	 1. 플레이어는 8번의 시도를 할 수 있다
	 
	 2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
	  - 숫자와 위치가 다 맞을경우 - Strike
	  - 숫자만 맞을경우 = Ball
	
		ex: 정답이 3456일때
		
			>> 5634	  4 Ball
			>> 3789	  1 Strike
			>> 3654   1 Strike 3Ball
	 3. 맞춘 시간과 횟수를 통해 1위부터 10위까지의 랭킹을 생성해 파일에 저장한다
	 	(횟수가 같다면 시간이 더 적게 걸린사람이 상위 랭킹)
	
	 4. 새로운 게임을 시작할때마다 랭킹을 출력해준다
	 
	  ※ 맞추고나면 몇 번만에 맞췄는지 알려주고 랭크에도 반영한다
	 */
	
	public static void main(String[] args) {
		
		
		
		final boolean DEBUGMODE = true;
		Scanner sc = new Scanner(System.in);
		
		StringBuilder answer_builder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			answer_builder.append((int)(Math.random() * 10));
		}
		String answer = answer_builder.toString();
		
		if (DEBUGMODE) {
		System.out.printf("이번 정답 : [%s]\n",answer);
		}
		
		int strike = 0;
		int ball = 0;
		int tryCount = 0;
		
		String userinput = null;
		
		while (strike != 4 && tryCount != 8) {
			strike = 0;
			ball = 0;
			
			while (true) {
				System.out.printf("%d번째 시도 >> ", tryCount + 1);
				userinput = sc.nextLine();
				
				boolean valid = true;
				if (userinput.length() != 4) {
					valid = false;
				}
				
				for (int i = 0; valid && i < 4; i++) {
					if (userinput.charAt(i) < '0' || userinput.charAt(i) > '9') {
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
			if (answer.equals(userinput)) {
				strike = 4;
				System.out.println("축하드립니다 ! 정답입니다!");
			} else {
				for (int i = 0; i < 4; i++) {
					if (answer.charAt(i) == userinput.charAt(i)) {
						strike++;
						
					} else {
						for (int j = 0; j < 4; j++) {
							if (answer.charAt(i) == userinput.charAt(j)) {
								ball++;
								break;
							}
						}						
					}
				}
				System.out.printf("%d strike, %d ball!\n", strike, ball);
			}
			
			tryCount++;
		}
		System.out.println("총 시도 횟수 : " + tryCount + "번");
		System.out.println("- Program End -");
	}
}















