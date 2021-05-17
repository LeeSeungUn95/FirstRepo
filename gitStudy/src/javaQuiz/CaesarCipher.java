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
	 	# 암호화
	 	
	 		- 평문을 알아볼수 없는 형태로 변환하는 것
	 		- 전달 과정에서 내용을 누가 훔쳐가더라도 알아볼 수 없게 하는 것이 목적이다
	 		
	 	# 복호화
	 	
	 		- 암호화 된 암호문을 다시 평문으로 되돌리는 것 
	 	
	 	# 키
	 	
	 		- 암호화 또는 복호화에 사용되는 값을 키 라고 부른다
	 	 
		# 시저 암호
		
	 		"Hello, world!" ---- key : 5 -----> "Mjqqt, btwqi!"
	 		
	 		암호화 : key만큼 오른쪽으로 문자를 이동 시킴
	 		복호화 : key만큼 왼쪽으로 문자를 이동 시킴
	 		
	 	# "frankenstein.txt"의 전체 내용을 1 ~ 25사이의 랜덤 키로 암호화한
	 	  "frankenstein.encrypted.txt"를 생성해보세요
	 	  (단, 알파벳만 암호화 할 것)
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

