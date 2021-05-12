package javaQuiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class SaveGame {
	/*
	 	
	 	1. ��ǻ�Ϳ� �����ϴ� ������ ���������� ������ ����� ������
	 	
	 	   - ó�� �����ϸ� �̸��� �Է���
	 	   - ���α׷� ����� �÷��̾��� ������ ���Ͽ� ������
	 	   - ������ �� ���ϸ��� �̸�.txt�� ����
	 
	 	2. ���α׷� ����� �̸��� �Է������� �ش� ������ �ִٸ� ������ �ҷ��� �� ����ǵ��� ��������
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		boolean gameRun = true;
		
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.println("���������� ������ �����մϴ�.");
		System.out.print("�̸��� �Է����ּ��� > ");
		String name = sc.nextLine();
		
		File newFile = new File("./note/"+ name +".txt");
		if (newFile.exists()) {
			try {
				FileInputStream fin = new FileInputStream(newFile);
				int _byte;
				while((_byte = fin.read()) != -1) {
					System.out.println((char)_byte);
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {
			try {
				FileOutputStream fout = new FileOutputStream(newFile);
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			}
			
		}
		while (gameRun) {
			int wincount = 0;
			int losecount = 0;
			int drawcount = 0;
			System.out.print("1.���� 2.���� 3.�� 0.����  >> ");
			int userSelect = sc.nextInt();
			
			int comSelect = ran.nextInt(3) + 1;
			
			if (userSelect == 1) {
				if (comSelect == 1) {
					drawcount++;
				} else if (comSelect == 2) {
					losecount++;
				} else if (comSelect == 3) {
					wincount++;
				}
			} else if (userSelect == 2) {
				if (comSelect == 1) {
					wincount++;
				} else if (comSelect == 2) {
					drawcount++;
				} else if (comSelect == 3) {
					losecount++;
				}
			} else if (userSelect == 3){
				if (comSelect == 1) {
					losecount++;
				} else if (comSelect == 2) {
					wincount++;
				} else if (comSelect == 3) {
					drawcount++;
				}
			} else if (userSelect == 0) {
				gameRun = false;
			} else {
				System.out.println("�Է� �����Դϴ� !");
			}
			
			if (wincount == 1) {
				System.out.println("�¸�");
				win++;
			} else if (drawcount == 1) {
				System.out.println("���");
				draw++;
			} else if (losecount == 1) {
				System.out.println("�й�");
				lose++;
			}
		}
		
		String win_str = Integer.toString(win);
		String draw_str = Integer.toString(draw);
		String lose_str = Integer.toString(lose);
		
		try {
			FileOutputStream fout = new FileOutputStream(newFile);
			fout.write("���� : ".getBytes());
			fout.write(win_str.getBytes());
			fout.write("�� ".getBytes());
			fout.write(draw_str.getBytes());
			fout.write("�� ".getBytes());
			fout.write(lose_str.getBytes());
			fout.write("��".getBytes());
			
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-Program End-");
	}
}
