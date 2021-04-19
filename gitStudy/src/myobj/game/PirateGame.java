package myobj.game;

import java.util.Random;
import java.util.Scanner;

public class PirateGame {

	// ����������� �÷��̾�� ���� ���ư��� �� ��������� ��ϴ�.
	// �߸��� ���� Į�� ������ ���� �������� ���ư��� ���ӿ� �й��մϴ�
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
		System.out.println("������� ��ȣ�� �������ϴ�.");
	}
	
	public void gameStart() {
		for (int i = 0; i < user.length; i++) {
			user[i] = i;
		}
		sc = new Scanner(System.in);
		int player = 0;
		while (true) {
			if (player != user.length) {
				System.out.printf("%d��° �÷��̾� �����Դϴ�.", user[player] + 1);
				System.out.printf("���ڸ� �Է����ּ���(�ִ� %d) > ", barrelMixNum);
				int playerPick = sc.nextInt();
				
				if (playerPick > barrelMixNum || player < 0) {
					System.out.printf("�Է� ����!! \n����ؼ� ");
					continue;
				}else if (playerPick != Fail){
					System.out.printf("%d�� �÷��̾���� �߰��̳׿�! �����Դϴ�!\n", user[player]+1);
				}else {
					System.out.printf("%d�� �÷��̾���� �й� �ϼ̽��ϴ�! ��Ÿ���׿�!\n", user[player]+1);
					break;
				}
				player++;
			}else {
				player = 0;
			}
		}
		System.out.println("������ �������ϴ�.....");
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���ϴ� �÷��̾� �� �Է� > ");
		int playerCount = sc.nextInt();
		System.out.print("���ϴ� ��������� ���� ���� �Է� > ");
		int barrelCount = sc.nextInt();
		
		PirateGame barrel = new PirateGame(playerCount, barrelCount);
		
		barrel.barrelMiserMix();
		
		barrel.gameStart();
	}
	
}













