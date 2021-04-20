package javaStudy;

import java.io.File;

public class F02_FileIO {
	/*
	 	# java.util.File
	 	
	 	 - ���� �ý����� ���� ������ ���� �� �ִ� Ŭ����
	 */
	public static void main(String[] args) {
		
		// �����ڷ� �������
		File f1 = new File("a.txt");
		File f2 = new File("OutputTest.txt");
		File dir = new File("D:/images/");
	
		System.out.println("�б� ������ �ִ� ���� �ΰ��� ? : " + f1.canRead());
		System.out.println("���� ������ �ִ� ���� �ΰ��� ? : " + f2.canExecute());
		System.out.println("���� ������ �ִ� ���� �ΰ��� ? : " + f2.canWrite());
		
		// ���� ��� �˾ƿ���
		System.out.println(f2.getAbsolutePath());
	
		// f2�� ��� ��ΰ� ���� ����ΰ�?
		System.out.println("f2�� ��� ��ΰ� ���� ����ΰ��� ? : " + f2.isAbsolute());
		
		// f2�� ��� ���� �ν��Ͻ��� ���丮�ΰ�?
		System.out.println("f2�� ��� ���� �ν��Ͻ��� ���丮�ΰ��� ? : " + f2.isDirectory());

		// f2�� ���� �����ϳ��°�?
		System.out.println("���� f1�� �����ϳ��� ? : " + f1.exists());
		System.out.println("���� f2�� �����ϳ��� ? : " + f2.exists());
		
		// ���� ���� ������ ���丮 �����ϱ�
		if (!dir.exists()) {
			dir.mkdir();
		} else {
			System.out.println("�̹� �����ϴ� ���丮�Դϴ�");
		}
	}
}


































