package javaQuiz;

import java.util.Random;
import java.util.Scanner;

import myobj.game.Barrel;

public class PirateGameQuiz {

	/*
	 	1. �÷��̾ ���ư��鼭 ���ϴ� ���� Į�� ���
	 	
	 	2. �߸��� ���� Į�� ������ ���� �������� ���ư��� ������ �й��Ѵ�
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
			System.out.println("���� �������� �������");
			break;
		}
	}
	
	public void config(int mode) {
		this.mode = mode;
	}
	
	void pvp() {
		while (true) {
			System.out.println((turn + 1) + "�� ");
			System.out.print("'player" + (turn % numOfPlayer + 1) + "'�� ���� > ");
			int slot = sc.nextInt();
			
			if (barrel.fork(slot)) {
				
				if (barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�...");
					System.out.print("'player" + (turn % numOfPlayer + 1) + "'�� �й�! ");
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
			System.out.println((turn + 1) + "�� ");
			System.out.print("player ���� ���� �Դϴ� > ");
			int userSlot = sc.nextInt();
			
			if (barrel.fork(userSlot) == false) {
				continue;
			} else {
				if (barrel.checkGameOver()) {
					System.out.println("��������� ���ư����ϴ�...");
					System.out.println("�÷��̾���� �й��Դϴ�!");
					break;
				}				
			}
			turn++;
		
			while (true) {
				System.out.println((turn + 1) + "��");
				int comSlot = ran.nextInt(barrel.randomNumber());
				System.out.println("��ǻ�ʹ� " + comSlot + " ������ϴ�");
				if (barrel.fork(comSlot) == false) {
					continue;
				}else {	
					if (barrel.checkGameOver()) {
						System.out.println("��������� ���ư����ϴ�...");
						System.out.println("��ǻ���� �й��Դϴ�");
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
		
		System.out.println("���� ��!");
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		
//		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
//		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
//		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
//		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�������� ~~~!!! ����~~~!!!�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
//		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
//		System.out.println("�ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ�");
//		System.out.println("�١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١ڡ١�");
//		System.out.print("���ϴ� �÷��̾� ���� �Է��ϼ��� > ");
//		int userSelect = sc.nextInt();
//		
//		int[] playerNumber = new int[userSelect];
//		
//		for (int i = 0; i < playerNumber.length; i++) {
//			playerNumber[i] = i;
//		}
//		
//		System.out.print("��������� � ���۰����� �Է��ϼ��� > ");
//		int barrelMister = sc.nextInt();
//		
//		int barrelMisterFail = ran.nextInt(barrelMister);  // �й��ϴ� ���ڸ� ����������
//		
//		
//		int gameCount = 0;
//		boolean gameRun = true;
//		while(gameRun) {
//			if (gameCount != playerNumber.length) {
//				System.out.printf("%d�� �����Դϴ�\n", playerNumber[gameCount] + 1);
//				System.out.printf("Į�� ���� ���ڸ� �Է��ϼ���(�ִ� %d������ ����) > ", barrelMister);
//				int stabPick = sc.nextInt(); // Į����� ��
//				
//				
//				if (stabPick < 0 || stabPick > barrelMister) {
//					System.out.printf("�Է¿��� �Դϴ� !!\n�ٽ� ");
//					continue;
//				} else if (stabPick == barrelMisterFail){
//					gameRun = false;
//				}else {
//					System.out.println("�����̱��� !! �� ��̳׿� ~~!!!??");
//				}
//				gameCount++;
//				System.out.println("=====================================");
//			}else {
//				gameCount = 0;
//			}
//		}
//		System.out.println("��Ȯ�� ��̳׿� ~~~~~~~~~~~~~~~~~~~~~");
//		System.out.println(playerNumber[gameCount] + "���� �й��Դϴ� !!!!!!!!!!!!!!!!!!!!!");		
	}
}








































