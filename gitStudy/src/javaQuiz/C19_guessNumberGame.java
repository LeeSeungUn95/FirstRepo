package javaQuiz;

import java.util.Scanner;

public class C19_guessNumberGame {

	public static void main(String[] args) {

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
				
			※ 맞추고나면 몇 번만에 맞췄는지 알려주기
		 */
		int comNum1 = (int)(Math.random() * 9 + 1);
		int comNum2 = (int)(Math.random() * 9 + 1);
		int comNum3 = (int)(Math.random() * 9 + 1);
		int comNum4 = (int)(Math.random() * 9 + 1);
		
		Scanner sc = new Scanner(System.in);
		
		int userNum1 = 0;
		int userNum2 = 0;
		int userNum3 = 0;
		int userNum4 = 0;
		
		int strike = 0;
		int ball = 0;
		int count = 0;
		while (true) {
			strike = 0;      // 돌려줄때 초기화
			ball = 0;
			System.out.println(count + "번째 기회");
			System.out.println("user> 숫자 4개를 입력하세요.");
			System.out.print("첫번째 숫자 입력 > ");
			userNum1 = sc.nextInt();
			System.out.print("두번째 숫자 입력 > ");
			userNum2 = sc.nextInt();
			System.out.print("세번째 숫자 입력 > ");
			userNum3 = sc.nextInt();
			System.out.print("네번째 숫자 입력 > ");
			userNum4 = sc.nextInt();
			count++;
			
			if (comNum1 == userNum1) {
				strike++;
			} else if (comNum1 == userNum2 || comNum1 == userNum3 || comNum1 == userNum4) {
				ball++;
			}
			if (comNum2 == userNum2) {
				strike++;
			} else if (comNum2 == userNum1 || comNum2 == userNum3 || comNum2 == userNum4) {
				ball++;
			}
			if (comNum3 == userNum3) {
				strike++;
			} else if (comNum3 == userNum1 || comNum3 == userNum2 || comNum3 == userNum4) {
				ball++;
			}
			if (comNum4 == userNum4) {
				strike++;
			} else if (comNum4 == userNum1 || comNum4 == userNum2 || comNum4 == userNum3) {
				ball++;
			}
			if (count < 8) {
				if (strike == 4) {
					System.out.println(count + "번 만에 정답을 맞췄습니다 !");
					break;
					}
			} else {
				System.out.println(count + "번 안에도 성공하지 못했습니다.");
				break;
			}
			System.out.printf("user : %d%d%d%d\n", userNum1, userNum2, userNum3, userNum4);
			System.out.println("Strike : " + strike + ", Ball : " + ball);
		}
		System.out.printf("computer : %d%d%d%d", comNum1, comNum2, comNum3, comNum4);
	}

}

















