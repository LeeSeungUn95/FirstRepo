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
	 게임이 시작되면 랜덤으로 4자리의 숫자가 선정된다
	 
	 1. 플레이어는 8번의 시도를 할 수 있다
	 
	 2. 각 시도마다 4자리의 숫자를 입력하면 다음과 같이 알려준다
	  - 숫자와 위치가 다 맞을경우 - Strike
	  - 숫자만 맞을경우 = Ball
	
		ex: 정답이 3456일때
		
			>> 5634	  4 Ball
			>> 3789	  1 Strike
			>> 3654   1 Strike 3Ball
	 3. 맞춘 시간과 횟수를 통해 1위부터 10위까지의 랭킹을 생성해 파일에 저장한다
	 	(횟수가 같다면 시간이 더 적게 걸린사람이 상위 랭킹)
	
	 4. 새로운 게임을 시작할때마다 랭킹을 출력해준다
	 
	  ※ 맞추고나면 몇 번만에 맞췄는지 알려주고 랭크에도 반영한다
	 */
	
	public static void main(String[] args) {
		TreeSet<GuessGame> user = new TreeSet<>();
		
		int userCount = 0;
		Scanner sc = new Scanner(System.in);
		File saveFile = new File("./data/야구게임 랭킹.txt");
		
		if (saveFile.exists()) {
			try {
				InputStreamReader in = new InputStreamReader(
						new FileInputStream(
								new File("./data/야구게임 랭킹.txt")), Charset.forName("UTF-8"));
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
		
		
		System.out.println("야구 게임을 시작합니다 !!!");
		System.out.print("이름을 입력해 주세요 >>");
		String userName = sc.nextLine();
		
		final boolean DEBUGMODE = true;
		
		StringBuilder answer_builder = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			answer_builder.append((int)(Math.random() * 10));
		}
		String answer = answer_builder.toString();
		
		if (DEBUGMODE) {
		System.out.printf("이번 정답 : [%s]\n",answer);
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
				System.out.printf("%d번째 시도 >> ", tryCount + 1);
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
					System.out.println("4자리 숫자만 입력하셔야 합니다.");
				}
			}
			
			//strike, ball 체크
			if (answer.equals(userinput)) {
				strike = 4;
				System.out.println("축하드립니다 ! 정답입니다!");
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
		System.out.println("총 시도 횟수 : " + tryCount + "번");
		System.out.println("- Program End -");
		long second_time = System.currentTimeMillis() / 1000;

		int total_time = (int)(second_time - first_time);
		user.add(new GuessGame().setName(userName).setTime(total_time).setTryCount(tryCount));
		
		File guessGameFile = new File("./data/야구게임 랭킹.txt");
		
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
		return "이름 : " + name + " / 시도횟수 : " + tryCount + "번 / 걸린 시간 : " + time + "초\n";
	}
}




















