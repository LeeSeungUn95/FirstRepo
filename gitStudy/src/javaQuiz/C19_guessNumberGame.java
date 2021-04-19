package javaQuiz;

import java.util.Scanner;

public class C19_guessNumberGame {

	public static void main(String[] args) {

		/*
		 ������ ���۵Ǹ� �������� 4�ڸ��� ���ڰ� �����ȴ�
		 
		 1. �÷��̾�� 8���� �õ��� �� �� �ִ�
		 
		 2. �� �õ����� 4�ڸ��� ���ڸ� �Է��ϸ� ������ ���� �˷��ش�
		  - ���ڿ� ��ġ�� �� ������� - Strike
		  - ���ڸ� ������� = Ball
		
			ex: ������ 3456�϶�
			
				>> 5634	  4 Ball
				>> 3789	  1 Strike
				>> 3654   1 Strike 3Ball
				
			�� ���߰��� �� ������ ������� �˷��ֱ�
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
			strike = 0;      // �����ٶ� �ʱ�ȭ
			ball = 0;
			System.out.println(count + "��° ��ȸ");
			System.out.println("user> ���� 4���� �Է��ϼ���.");
			System.out.print("ù��° ���� �Է� > ");
			userNum1 = sc.nextInt();
			System.out.print("�ι�° ���� �Է� > ");
			userNum2 = sc.nextInt();
			System.out.print("����° ���� �Է� > ");
			userNum3 = sc.nextInt();
			System.out.print("�׹�° ���� �Է� > ");
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
					System.out.println(count + "�� ���� ������ ������ϴ� !");
					break;
					}
			} else {
				System.out.println(count + "�� �ȿ��� �������� ���߽��ϴ�.");
				break;
			}
			System.out.printf("user : %d%d%d%d\n", userNum1, userNum2, userNum3, userNum4);
			System.out.println("Strike : " + strike + ", Ball : " + ball);
		}
		System.out.printf("computer : %d%d%d%d", comNum1, comNum2, comNum3, comNum4);
	}

}

















