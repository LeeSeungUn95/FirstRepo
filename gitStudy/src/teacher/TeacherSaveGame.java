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
		
		System.out.print("���� �̸��� �Է����ּ��� >> ");
		String userName = sc.nextLine();
		
		File save = new File("./data/" + userName + ".hz");
		
		if (save.exists()) {
			System.out.println("[System] �ҷ��� ������ �ֽ��ϴ�.");
			
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
			System.out.println("[System] �ҷ��� ������ �����ϴ�.");			
		}
		
		while (true) {
			int answer = (int)(Math.random() * 2);

			System.out.println("0,1 > ");
			int user = sc.nextInt();
			
			if (user != -1 && user != 0 && user != 1) {
				System.out.println("�Է� �����Դϴ� �ٽ� �Է����ּ���!");
				continue;
			}
			
			if (user == -1) {
				System.out.println("-Program End-");
				break;
			}
			
			if (user != answer) {
				System.out.println("�����ϴ�");
				lose++;
			} else {
				System.out.println("�竆!");
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
































