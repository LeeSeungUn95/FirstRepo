package javaQuiz;

import java.util.Random;
import java.util.Scanner;

public class C18_31Game {
	
	public static void main(String[] args) {
		/*
		 	31게임을 만들어 보세요
		 	
		 	1. 컴퓨터와 사람이 번갈아가면서 숫자를 선택해야 한다. (1, 2, 3 밖에 선택할 수 없음)
		 	2. 컴퓨터는 랜덤으로 숫자를 선택한다
		 	3. 선공은 랜덤으로 결정한다
		 	4. 마지막에 31 이상의 숫자를 만들 수 밖에 없는 플레이어가 패배한다 
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		//승운
//		int userWin = 0;
//		int comWin = 0;
//		
//		boolean codeRun = true;
//		System.out.println("----- 31 게임~~~!!! -----");
//		while (codeRun) {
//			int lastNum = 0;
//			System.out.println("┌─────────────┐");
//			System.out.println("│1. Game Start│");
//			System.out.println("│2. Game Score│");
//			System.out.println("│3. Exit      │");
//			System.out.println("└─────────────┘");
//			System.out.print("입력 하세요 > ");
//			int userSelect = sc.nextInt();
//			
//			if (userSelect == 1) {
//				System.out.println("Game Start~~~~!");
//				System.out.println("선공은 랜덤입니다 ~~~~");
//				boolean gameRun = true;
//				int turn = ran.nextInt(2);
//				
//				while (gameRun) {
//					int comNum = 0;
//					if (turn == 0) {
//						System.out.print("당신차례 입니다 ! > ");
//						int userNum = sc.nextInt();
//						if(userNum >= 1 && userNum <= 3) {
//							System.out.printf("플레이어 [%d]\n", userNum);
//							lastNum += userNum;
//							System.out.println(lastNum);
//							turn = 1;					
//						}else {
//							System.out.println("입력 오류입니다 !");
//						}
//						if (lastNum >= 31) {
//							System.out.println("당신은 패배했습니다.");
//							comWin++;
//							gameRun = false;
//						}
//					} else {
//						if (lastNum == 27) {
//							comNum = 3;
//						} else if(lastNum == 28) {
//							comNum = 2;
//						} else if(lastNum == 29) {
//							comNum = 1;
//						} else {
//							comNum = ran.nextInt(3) + 1;
//						}
//						System.out.printf("컴퓨터 [%d]\n", comNum);
//						lastNum += comNum;
//						System.out.println(lastNum);
//						turn = 0;
//						if (lastNum >= 31) {
//							System.out.println("컴퓨터가 패배했습니다.");
//							userWin++;
//							gameRun = false;
//						}
//					}
//				}		
//			} else if (userSelect == 2) {
//				System.out.println("-------- Game Score --------");
//				System.out.printf("플레이어 : %d승, 컴퓨터 : %d승\n", userWin, comWin);
//				System.out.println("----------------------------");
//			} else if (userSelect == 3) {
//				codeRun = false;
//			} else {
//				System.out.println("입력 오류 !");
//			}
//		}
//		System.out.println("-Program End-");
		
		//강사
		
		final int PLAYER = 0, COMPUTER = 1;
		
		int num = 0;
		int turn = ran.nextInt(1);
		while (true) {
			int user = 0;
			if (turn == PLAYER) {
				while(true) {
					System.out.print("당신의 턴 > ");
					user = sc.nextInt();
					
					if (user > 0 && user <= 3) {
						break;
					} else {
						System.out.println("입력오류입니다. [1, 2, 3] 중에 선택해주세요");
					}
				}
				num += user;
				System.out.printf("당신이  %d을(를) 선택 [%d]\n", user, num);
				turn = COMPUTER;
			} else if (turn == COMPUTER) {
				int com;
				if (num % 4 == 0) {
					com = 2;
				} else if (num % 4 == 1) {
					com = 1;
				} else if (num % 4 == 2) {
					com = ran.nextInt(3) + 1;
				} else {
					com = 3;
				}
				num += com;
				
				System.out.printf("컴퓨터가 %d을(를) 선택 [%d]\n", com, num);
				turn = PLAYER;
			}
			if (num >= 31) {
				String winner = turn == PLAYER ? "플레이어" : "컴퓨터";
				System.out.printf("<<%s의 승리>>", winner);
				break;
			}
		}
		System.out.println("-Program End-");
	}
}


















