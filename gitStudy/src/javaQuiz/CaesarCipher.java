package javaQuiz;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class CaesarCipher {

	/*
	 	# ��ȣȭ
	 	
	 		- ���� �˾ƺ��� ���� ���·� ��ȯ�ϴ� ��
	 		- ���� �������� ������ ���� ���İ����� �˾ƺ� �� ���� �ϴ� ���� �����̴�
	 		
	 	# ��ȣȭ
	 	
	 		- ��ȣȭ �� ��ȣ���� �ٽ� ������ �ǵ����� �� 
	 	
	 	# Ű
	 	
	 		- ��ȣȭ �Ǵ� ��ȣȭ�� ���Ǵ� ���� Ű ��� �θ���
	 	 
		# ���� ��ȣ
		
	 		"Hello, world!" ---- key : 5 -----> "Mjqqt, btwqi!"
	 		
	 		��ȣȭ : key��ŭ ���������� ���ڸ� �̵� ��Ŵ
	 		��ȣȭ : key��ŭ �������� ���ڸ� �̵� ��Ŵ
	 		
	 	# "frankenstein.txt"�� ��ü ������ 1 ~ 25������ ���� Ű�� ��ȣȭ��
	 	  "frankenstein.encrypted.txt"�� �����غ�����
	 	  (��, ���ĺ��� ��ȣȭ �� ��)
	 */
	
	public static void main(String[] args) {
		saveToRandomSaesarCipher("./data/text/frankenstein.txt");
	}
	public static void saveToRandomSaesarCipher(String file) {
		Random ran = new Random();
		int randomNumber = ran.nextInt(25)+ 1;
		
		try (FileReader in = new FileReader(new File(file))){
			BufferedWriter bout = 
					new BufferedWriter(
							new FileWriter(
									new File("./data/text/frankenstein.encrypted.txt")));
			
			int _byte;
			while((_byte = in.read()) != -1) {
				int Caesar_byte = (char)(_byte + randomNumber);
				if (_byte >= 'A' && _byte <= 'Z') {
					if (Caesar_byte > 'Z') {
						bout.append((char)(Caesar_byte - 26));
					} else {
						bout.append((char)Caesar_byte);						
					}
				} else if (_byte >= 'a' && _byte <='z') {
					if (Caesar_byte > 'z') {
						bout.append((char)(Caesar_byte - 26));						
					} else {
						bout.append((char)Caesar_byte);												
					}
				} else {
					bout.append((char)_byte);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}	
	}
}

