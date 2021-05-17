package teacher;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TeacherSaveGame {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int win = 0;
		int lose = 0;
		
		System.out.print("먼저 이름을 입력해주세요 >> ");
		String userName = sc.nextLine();
		
		File save = new File("./data/" + userName + ".hz");
		
		if (save.exists()) {
			System.out.println("[System] 불러올 파일이 있습니다.");
			
			try {
				FileInputStream fin = new FileInputStream(save);
				
				win = fin.read();
				lose = fin.read();
				
				fin.close();
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		} else {
			System.out.println("[System] 불러올 파일이 없습니다.");			
		}
		
		while (true) {
			int answer = (int)(Math.random() * 2);

			System.out.println("0,1 > ");
			int user = sc.nextInt();
			
			if (user != -1 && user != 0 && user != 1) {
				System.out.println("입력 오류입니다 다시 입력해주세요!");
				continue;
			}
			
			if (user == -1) {
				System.out.println("-Program End-");
				break;
			}
			
			if (user != answer) {
				System.out.println("졌습니다");
				lose++;
			} else {
				System.out.println("당쳠!");
				win++;
			}
		}
		
		try {
			FileOutputStream fout = new FileOutputStream(save);
		
			fout.write(win);
			fout.write(lose);
			
			fout.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}
































