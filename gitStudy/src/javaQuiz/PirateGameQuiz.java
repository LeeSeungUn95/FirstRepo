package javaQuiz;

import java.util.Random;
import java.util.Scanner;

import myobj.game.Barrel;

public class PirateGameQuiz {

	/*
	 	1. 플레이어가 돌아가면서 원하는 곳에 칼을 찌른다
	 	
	 	2. 잘못된 곳에 칼을 넣으면 해적 아저씨가 날아가며 게임이 패배한다
	 */
	Random ran;
	Scanner sc;
	Barrel barrel;
	int mode;
	
	int numOfComputer;
	
	int turn;
	int numOfPlayer;
	public PirateGameQuiz() {
		
	}
	
	public PirateGameQuiz(int mode) {
		this.ran = new Random();
		this.barrel = new Barrel(20);
		this.mode = mode;
		this.numOfPlayer = 2;
		this.sc = new Scanner(System.in);
	}
	
	public PirateGameQuiz(int mode, int numOfPlayer) {
		this(mode);
		this.numOfPlayer = numOfPlayer;
	}
	
	public void start() {
		switch (this.mode) {
		case 0:
			pvp();
			break;
		case 1:
			pvc();
			break;
		default:
			System.out.println("아직 구현되지 않은모드");
			break;
		}
	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while (true) {
			System.out.println((turn + 1) + "턴 ");
			System.out.print("'player" + (turn % numOfPlayer + 1) + "'의 차례 > ");
			int slot = sc.nextInt();
			
			if (barrel.fork(slot)) {
				
				if (barrel.checkGameOver()) {
					System.out.println("통아저씨가 날아갔습니다...");
					System.out.print("'player" + (turn % numOfPlayer + 1) + "'의 패배! ");
					break;
				}
				turn++;				
			}
		}
	}
	
	void pvc() {
		while (true) {
			if (barrel.checkGameOver()){
				break;
			}
			System.out.println((turn + 1) + "턴 ");
			System.out.print("player 님의 차례 입니다 > ");
			int userSlot = sc.nextInt();
			
			if (barrel.fork(userSlot) == false) {
				continue;
			} else {
				if (barrel.checkGameOver()) {
					System.out.println("통아저씨가 날아갔습니다...");
					System.out.println("플레이어님의 패배입니다!");
					break;
				}				
			}
			turn++;
		
			while (true) {
				System.out.println((turn + 1) + "턴");
				int comSlot = ran.nextInt(barrel.randomNumber());
				System.out.println("컴퓨터는 " + comSlot + " 골랐습니다");
				if (barrel.fork(comSlot) == false) {
					continue;
				}else {	
					if (barrel.checkGameOver()) {
						System.out.println("통아저씨가 날아갔습니다...");
						System.out.println("컴퓨터의 패배입니다");
						break;
					}else {
						break;
					}
				}
			}
			turn++;
			
			
			
		}
	}
	
	public static void main(String[] args) {
		PirateGameQuiz testGame = new PirateGameQuiz(1);
		
		testGame.start();
		testGame.config(1);
		
		System.out.println("게임 끝!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		
//		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
//		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
//		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
//		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★통아저씨 ~~~!!! 게임~~~!!!☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
//		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
//		System.out.println("★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆");
//		System.out.println("☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★☆★");
//		System.out.print("원하는 플레이어 수를 입력하세요 > ");
//		int userSelect = sc.nextInt();
//		
//		int[] playerNumber = new int[userSelect];
//		
//		for (int i = 0; i < playerNumber.length; i++) {
//			playerNumber[i] = i;
//		}
//		
//		System.out.print("통아저씨를 찌를 구멍개수를 입력하세요 > ");
//		int barrelMister = sc.nextInt();
//		
//		int barrelMisterFail = ran.nextInt(barrelMister);  // 패배하는 숫자를 랜덤값으로
//		
//		
//		int gameCount = 0;
//		boolean gameRun = true;
//		while(gameRun) {
//			if (gameCount != playerNumber.length) {
//				System.out.printf("%d번 차례입니다\n", playerNumber[gameCount] + 1);
//				System.out.printf("칼을 꽂을 숫자를 입력하세요(최대 %d번까지 가능) > ", barrelMister);
//				int stabPick = sc.nextInt(); // 칼로찌르는 곳
//				
//				
//				if (stabPick < 0 || stabPick > barrelMister) {
//					System.out.printf("입력오류 입니다 !!\n다시 ");
//					continue;
//				} else if (stabPick == barrelMisterFail){
//					gameRun = false;
//				}else {
//					System.out.println("다행이군요 !! 잘 찌르셨네요 ~~!!!??");
//				}
//				gameCount++;
//				System.out.println("=====================================");
//			}else {
//				gameCount = 0;
//			}
//		}
//		System.out.println("정확히 찌르셨네요 ~~~~~~~~~~~~~~~~~~~~~");
//		System.out.println(playerNumber[gameCount] + "번의 패배입니다 !!!!!!!!!!!!!!!!!!!!!");		
	}
}








































