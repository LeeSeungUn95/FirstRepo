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
	 	
	 	1. 컴퓨터와 진행하는 간단한 가위바위보 게임을 만들어 보세요
	 	
	 	   - 처음 시작하면 이름을 입력함
	 	   - 프로그램 종료시 플레이어의 전적을 파일에 저장함
	 	   - 저장할 때 파일명은 이름.txt로 저장
	 
	 	2. 프로그램 실행시 이름을 입력했을때 해당 전적이 있다면 전적을 불러온 후 진행되도록 만들어보세요
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		boolean gameRun = true;
		
		int win = 0;
		int lose = 0;
		int draw = 0;

		System.out.println("가위바위보 게임을 시작합니다.");
		System.out.print("이름을 입력해주세요 > ");
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
			System.out.print("1.가위 2.바위 3.보 0.종료  >> ");
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
				System.out.println("입력 오류입니다 !");
			}
			
			if (wincount == 1) {
				System.out.println("승리");
				win++;
			} else if (drawcount == 1) {
				System.out.println("비김");
				draw++;
			} else if (losecount == 1) {
				System.out.println("패배");
				lose++;
			}
		}
		
		String win_str = Integer.toString(win);
		String draw_str = Integer.toString(draw);
		String lose_str = Integer.toString(lose);
		
		try {
			FileOutputStream fout = new FileOutputStream(newFile);
			fout.write("전적 : ".getBytes());
			fout.write(win_str.getBytes());
			fout.write("승 ".getBytes());
			fout.write(draw_str.getBytes());
			fout.write("무 ".getBytes());
			fout.write(lose_str.getBytes());
			fout.write("패".getBytes());
			
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("-Program End-");
	}
}
