package javaStudy;

import java.io.File;

public class F02_FileIO {
	/*
	 	# java.util.File
	 	
	 	 - 파일 시스템의 파일 정보를 담을 수 있는 클래스
	 */
	public static void main(String[] args) {
		
		// 생성자로 경로전달
		File f1 = new File("a.txt");
		File f2 = new File("OutputTest.txt");
		File dir = new File("D:/images/");
	
		System.out.println("읽기 권한이 있는 파일 인가요 ? : " + f1.canRead());
		System.out.println("실행 권한이 있는 파일 인가요 ? : " + f2.canExecute());
		System.out.println("쓰기 권한이 있는 파일 인가요 ? : " + f2.canWrite());
		
		// 절대 경로 알아오기
		System.out.println(f2.getAbsolutePath());
	
		// f2에 담긴 경로가 절대 경로인가?
		System.out.println("f2에 담긴 경로가 절대 경로인가요 ? : " + f2.isAbsolute());
		
		// f2에 담긴 파일 인스턴스는 디렉토리인가?
		System.out.println("f2에 담긴 파일 인스턴스는 디렉토리인가요 ? : " + f2.isDirectory());

		// f2가 현재 존자하나는가?
		System.out.println("현재 f1이 존재하나요 ? : " + f1.exists());
		System.out.println("현재 f2가 존재하나요 ? : " + f2.exists());
		
		// 존재 하지 않으면 디렉토리 생성하기
		if (!dir.exists()) {
			dir.mkdir();
		} else {
			System.out.println("이미 존재하는 디렉토리입니다");
		}
	}
}


































