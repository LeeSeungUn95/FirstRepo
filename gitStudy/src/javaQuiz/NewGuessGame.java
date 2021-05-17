package javaQuiz;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeSet;

public class NewGuessGame {
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
		TreeSet<GuessGame> user = new TreeSet<>();
		
		int userCount = 0;
		Scanner sc = new Scanner(System.in);
		File saveFile = new File("./data/�߱����� ��ŷ.txt");
		
		if (saveFile.exists()) {
			try {
				InputStreamReader in = new InputStreamReader(
						new FileInputStream(
								new File("./data/�߱����� ��ŷ.txt")), Charset.forName("UTF-8"));
				int ch;
				while ((ch = in.read()) != -1) {
					System.out.print((char)ch);
				}
			} catch (FileNotFoundException e1) {
				e1.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			
		}
		
		
		System.out.println("�߱� ������ �����մϴ� !!!");
		System.out.print("�̸��� �Է��� �ּ��� >>");
		String userName = sc.nextLine();
		
		final boolean DEBUGMODE = true;
		
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
		
		long first_time = System.currentTimeMillis() / 1000;
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
		long second_time = System.currentTimeMillis() / 1000;

		int total_time = (int)(second_time - first_time);
		user.add(new GuessGame().setName(userName).setTime(total_time).setTryCount(tryCount));
		
		File guessGameFile = new File("./data/�߱����� ��ŷ.txt");
		
		try {
			FileOutputStream fout = new FileOutputStream(guessGameFile, true);
			DataOutputStream dout = new DataOutputStream(fout);
			
			dout.writeUTF(user.toString());
			
			dout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}



class GuessGame implements Comparable<GuessGame> {
	String name;
	int time;
	int tryCount;
	
	public GuessGame() {
	
	}
	
	public GuessGame(String name, int time, int tryCount) {
		this.name = name;
		this.time = time;
		this.tryCount = tryCount;
	}
	
	GuessGame setName(String name) {
		this.name = name;
		return this;
	}
	
	GuessGame setTime(int time) {
		this.time = time;
		return this;
	}
	
	GuessGame setTryCount(int tryCount) {
		this.tryCount = tryCount;
		return this;
	}
	
	@Override
	public int compareTo(GuessGame o) {
		return 0;
	}
	
	@Override
	public String toString() {
		return "�̸� : " + name + " / �õ�Ƚ�� : " + tryCount + "�� / �ɸ� �ð� : " + time + "��\n";
	}
}




















