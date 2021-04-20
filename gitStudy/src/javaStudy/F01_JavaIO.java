package javaStudy;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class F01_JavaIO {
	/*
	 	# JAVA IO (Input/Output)
	 	
	 	　- 자바는 스트림 이라는 개념을 이용해 입출력을 다룬다
	 	　- 프로그램으로 들어오는 모든 데이터들을 입력이라고 부른다(Input)
	 	　- 프로그램이 연산해서 내보내는 모든 데이터들을 출력이라고 부른다(Output)
	 	
	 	# Stream
	 	
	 	　- 데이터들이 오고가는 통로
	 	　- 입력 받을 때 데이터들이 프로그램으로 들어오는 통로를 InputStream이라고 부른다
	 	　- 출력 할 때 데이터들이 나가는 통로를 OutputStream이라고 부른다
	 	　- 데이터가 Stream으로 이동하기 위해서는 해당 데이터를 byte 타입으로 변환되어야 한다
	 */
	public static void main(String[] args) {
		FileOutputStream fout = null;
		try {
			// ※소스에서 현재 위치(./)는 프로젝트의 root이다
		//	fout = new FileOutputStream("./a.txt", true) 절대경로
			fout = new FileOutputStream("D:\\files\\a.txt", true);
			for (int i = 0; i < 10; i++) {
				fout.write(String.format("오늘은 날씨가 참 좋네요..%d\n", i).getBytes());				
			}
			
			// ※중요※ I/O Stream은 수동으로 close()를 호출해줘야 한다 (메모리 회수)
			
			System.out.println("파일 쓰기 완료");
		} catch (FileNotFoundException e) {
			System.out.println("파일 못 찾음 익셉션");
		} catch (IOException e) {
			System.out.println("데이터를 쓰다가 문제가 생겼음");
		} finally {
			try {
				if (fout != null) {
				fout.close();
				}
			} catch (IOException e) {}
		}
	}
}

















