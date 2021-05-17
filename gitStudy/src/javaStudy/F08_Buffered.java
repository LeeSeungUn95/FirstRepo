package javaStudy;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.time.LocalTime;

public class F08_Buffered {
	// frankenstein.txt를 한 글자씩 모두 읽고 걸린 시간을 측정해보세요
	
	// 한 글자씩 읽을때와 배여를 사용해서 읽을 때의 성능을 비교해보세요
	
	public static void main(String[] args) {
		File frankenFile = new File("./data/text/frankenstein.txt");
		
		long start = System.currentTimeMillis();
		long end = 0;
		
		try (FileReader in = new FileReader(frankenFile)){
			StringBuilder sb = new StringBuilder();
			int ch = -1;
			while ((ch = in.read()) != - 1) {
				sb.append((char)ch);
			}
			end = System.currentTimeMillis();
//			System.out.println(sb);
			
			System.out.println("걸린시간 1: " + (end - start) + "밀리초");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		start = System.currentTimeMillis();
		try (FileReader in = new FileReader(frankenFile)){
			StringBuilder sb = new StringBuilder();
			char[] buff = new char[1024];
			
			int len = -1;
			while ((len = in.read(buff)) != - 1) {
				sb.append(new String(buff, 0, len));
			}
			end = System.currentTimeMillis();
//			System.out.println(sb);
			
			System.out.println("걸린시간2 : " + (end - start) + "밀리초");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		start = System.currentTimeMillis();
		try (
				FileReader fin = new FileReader(frankenFile);
				BufferedReader bin = new BufferedReader(fin, 4096)
			) {
			
			StringBuilder sb = new StringBuilder();
			String line = null;
			while ((line = bin.readLine()) != null) {
				sb.append(line);
			}
			
			end = System.currentTimeMillis();
			System.out.println("걸린시간3 : " + (end - start) + "밀리초");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try (BufferedWriter bout = 
				new BufferedWriter(new FileWriter(new File("./data/text/bufferedWriter.txt")))) {
			bout.append("Hello, BufferedWriter!");
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
}



