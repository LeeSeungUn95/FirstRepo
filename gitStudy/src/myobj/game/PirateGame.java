package myobj.game;

import java.util.Random;
import java.util.Scanner;

public class PirateGame {

	// 통아저씨게임 플레이어는 서로 돌아가면 서 통아저씨를 찌릅니다.
	// 잘못된 곳에 칼을 넣으면 해적 아저씨가 날아가며 게임에 패배합니다
	Random ran;
	Scanner sc;
	
	int[] user;
	int barrelMixNum;
	int Fail;
	
	public PirateGame(int user, int barrelMixNum) {
		this.user = new int[user];
		this.barrelMixNum = barrelMixNum;
		ran = new Random();
	}
	
	public void barrelMiserMix() {
		Fail = ran.nextInt(barrelMixNum);
		System.out.println("통아저씨 번호를 섞었습니다.");
	}
	
	public void gameStart() {
		for (int i = 0; i < user.length; i++) {
			user[i] = i;
		}
		sc = new Scanner(System.in);
		int player = 0;
		while (true) {
			if (player != user.length) {
				System.out.printf("%d번째 플레이어 순서입니다.", user[player] + 1);
				System.out.printf("숫자를 입력해주세요(최대 %d) > ", barrelMixNum);
				int playerPick = sc.nextInt();
				
				if (playerPick > barrelMixNum || player < 0) {
					System.out.printf("입력 오류!! \n계속해서 ");
					continue;
				}else if (playerPick != Fail){
					System.out.printf("%d번 플레이어분은 잘고르셨네요! 다행입니다!\n", user[player]+1);
				}else {
					System.out.printf("%d번 플레이어분은 패배 하셨습니다! 안타깝네요!\n", user[player]+1);
					break;
				}
				player++;
			}else {
				player = 0;
			}
		}
		System.out.println("게임이 끝났습니다.....");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 플레이어 수 입력 > ");
		int playerCount = sc.nextInt();
		System.out.print("원하는 통아저씨의 구멍 개수 입력 > ");
		int barrelCount = sc.nextInt();
		
		PirateGame barrel = new PirateGame(playerCount, barrelCount);
		
		barrel.barrelMiserMix();
		
		barrel.gameStart();
	}
	
}













