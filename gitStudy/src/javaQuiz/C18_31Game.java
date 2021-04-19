package javaQuiz;

import java.util.Random;
import java.util.Scanner;

public class C18_31Game {
	
	public static void main(String[] args) {
		/*
		 	31������ ����� ������
		 	
		 	1. ��ǻ�Ϳ� ����� �����ư��鼭 ���ڸ� �����ؾ� �Ѵ�. (1, 2, 3 �ۿ� ������ �� ����)
		 	2. ��ǻ�ʹ� �������� ���ڸ� �����Ѵ�
		 	3. ������ �������� �����Ѵ�
		 	4. �������� 31 �̻��� ���ڸ� ���� �� �ۿ� ���� �÷��̾ �й��Ѵ� 
		 */
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();

		//�¿�
//		int userWin = 0;
//		int comWin = 0;
//		
//		boolean codeRun = true;
//		System.out.println("----- 31 ����~~~!!! -----");
//		while (codeRun) {
//			int lastNum = 0;
//			System.out.println("������������������������������");
//			System.out.println("��1. Game Start��");
//			System.out.println("��2. Game Score��");
//			System.out.println("��3. Exit      ��");
//			System.out.println("������������������������������");
//			System.out.print("�Է� �ϼ��� > ");
//			int userSelect = sc.nextInt();
//			
//			if (userSelect == 1) {
//				System.out.println("Game Start~~~~!");
//				System.out.println("������ �����Դϴ� ~~~~");
//				boolean gameRun = true;
//				int turn = ran.nextInt(2);
//				
//				while (gameRun) {
//					int comNum = 0;
//					if (turn == 0) {
//						System.out.print("������� �Դϴ� ! > ");
//						int userNum = sc.nextInt();
//						if(userNum >= 1 && userNum <= 3) {
//							System.out.printf("�÷��̾� [%d]\n", userNum);
//							lastNum += userNum;
//							System.out.println(lastNum);
//							turn = 1;					
//						}else {
//							System.out.println("�Է� �����Դϴ� !");
//						}
//						if (lastNum >= 31) {
//							System.out.println("����� �й��߽��ϴ�.");
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
//						System.out.printf("��ǻ�� [%d]\n", comNum);
//						lastNum += comNum;
//						System.out.println(lastNum);
//						turn = 0;
//						if (lastNum >= 31) {
//							System.out.println("��ǻ�Ͱ� �й��߽��ϴ�.");
//							userWin++;
//							gameRun = false;
//						}
//					}
//				}		
//			} else if (userSelect == 2) {
//				System.out.println("-------- Game Score --------");
//				System.out.printf("�÷��̾� : %d��, ��ǻ�� : %d��\n", userWin, comWin);
//				System.out.println("----------------------------");
//			} else if (userSelect == 3) {
//				codeRun = false;
//			} else {
//				System.out.println("�Է� ���� !");
//			}
//		}
//		System.out.println("-Program End-");
		
		//����
		
		final int PLAYER = 0, COMPUTER = 1;
		
		int num = 0;
		int turn = ran.nextInt(1);
		while (true) {
			int user = 0;
			if (turn == PLAYER) {
				while(true) {
					System.out.print("����� �� > ");
					user = sc.nextInt();
					
					if (user > 0 && user <= 3) {
						break;
					} else {
						System.out.println("�Է¿����Դϴ�. [1, 2, 3] �߿� �������ּ���");
					}
				}
				num += user;
				System.out.printf("�����  %d��(��) ���� [%d]\n", user, num);
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
				
				System.out.printf("��ǻ�Ͱ� %d��(��) ���� [%d]\n", com, num);
				turn = PLAYER;
			}
			if (num >= 31) {
				String winner = turn == PLAYER ? "�÷��̾�" : "��ǻ��";
				System.out.printf("<<%s�� �¸�>>", winner);
				break;
			}
		}
		System.out.println("-Program End-");
	}
}


















