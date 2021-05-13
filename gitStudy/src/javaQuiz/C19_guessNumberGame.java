package javaQuiz;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class C19_guessNumberGame {
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
	 3. ���� �ð��� Ƚ���� ���� 1������ 10�������� ��ŷ�� ������ ���Ͽ� �����Ѵ�
	 	(Ƚ���� ���ٸ� �ð��� �� ���� �ɸ������ ���� ��ŷ)
	
	 4. ���ο� ������ �����Ҷ����� ��ŷ�� ������ش�
	 
	  �� ���߰��� �� ������ ������� �˷��ְ� ��ũ���� �ݿ��Ѵ�
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
		System.out.printf("�̹� ���� : [%s]\n",answer);
		}
		
		int strike = 0;
		int ball = 0;
		int tryCount = 0;
		
		String userinput = null;
		
		while (strike != 4 && tryCount != 8) {
			strike = 0;
			ball = 0;
			
			while (true) {
				System.out.printf("%d��° �õ� >> ", tryCount + 1);
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
					System.out.println("4�ڸ� ���ڸ� �Է��ϼž� �մϴ�.");
				}
			}
			
			//strike, ball üũ
			if (answer.equals(userinput)) {
				strike = 4;
				System.out.println("���ϵ帳�ϴ� ! �����Դϴ�!");
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
		System.out.println("�� �õ� Ƚ�� : " + tryCount + "��");
		System.out.println("- Program End -");
	}
}















