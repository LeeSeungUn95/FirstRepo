package teacher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class TeacherSaesarCipher {
	static int encrypt_key = 0;
	final static String ENCRYPT_UPPER = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	final static String ENCRYPT_LOWER = "abcdefghijklmnopqrstuvwxyz";
	final static String DECRYPTION_UPPER = "ZYXWVUTSRQPONMLKJIHGFEDCBA";
	final static String DECRYPTION_LOWER = "zyxwvutsrqponmlkjihgfedcba";
	
	public static char encrypt_plusUpper(char ch, int key) {
		
		return ENCRYPT_UPPER.charAt((ENCRYPT_UPPER.indexOf(ch) + key) % ENCRYPT_UPPER.length());
	}
	public static char encrypt_plusLower(char ch, int key) {
		
		return ENCRYPT_LOWER.charAt((ENCRYPT_LOWER.indexOf(ch) + key) % ENCRYPT_LOWER.length());
	}
	
	public static void encrypt(String file) {
		File frankenstein = new File(file);
		File frankenstein_encrypted = new File("./data/text/feankenstein.encrypted2.txt");
		
		Random ran = new Random();
		int key = ran.nextInt(25) + 1;
		encrypt_key = key;
		try (
			FileReader fin = new FileReader(frankenstein);
			BufferedReader bin = new BufferedReader(fin);
			FileWriter fout = new FileWriter(frankenstein_encrypted);
			BufferedWriter bout = new BufferedWriter(fout)
		) {
			String line = null;
			while ((line = bin.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					
					char ch = line.charAt(i);
					
					switch (Character.getType(ch)) {
					case Character.UPPERCASE_LETTER :
						ch = encrypt_plusUpper(ch, key);
						break;
					case Character.LOWERCASE_LETTER :
						ch = encrypt_plusLower(ch, key);
						break;
					}
					fout.append(ch);
				}
				fout.append('\n');
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static char decryption_minusUpper(char ch, int key) {
		
		return DECRYPTION_UPPER.charAt((DECRYPTION_UPPER.indexOf(ch) + key) % DECRYPTION_UPPER.length());
	}
	public static char decryption_minusLower(char ch, int key) {
		
		return DECRYPTION_LOWER.charAt((DECRYPTION_LOWER.indexOf(ch) + key) % DECRYPTION_LOWER.length());
	}

	public static void decryption(String file) {
		File frankenstein = new File(file);
		File frankenstein_decryption = new File("./data/text/frankenstein.decryption.txt");
		
		Random ran = new Random();
		try (
			FileReader fin = new FileReader(frankenstein);
			BufferedReader bin = new BufferedReader(fin);
			FileWriter fout = new FileWriter(frankenstein_decryption);
			BufferedWriter bout = new BufferedWriter(fout)
		) {
			String line = null;
			while ((line = bin.readLine()) != null) {
				for (int i = 0; i < line.length(); i++) {
					
					char ch = line.charAt(i);
					
					switch (Character.getType(ch)) {
					case Character.UPPERCASE_LETTER :
						ch = decryption_minusUpper(ch, encrypt_key);
						break;
					case Character.LOWERCASE_LETTER :
						ch = decryption_minusLower(ch, encrypt_key);
						break;
					}
					fout.append(ch);
				}
				fout.append('\n');
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// 암호화된 파일을 해석하는 decryption(file) 메서드를 만들어보세요
	
	public static void main(String[] args) {
		encrypt("./data/text/frankenstein.txt");
		decryption("./data/text/feankenstein.encrypted2.txt");
	}
}
