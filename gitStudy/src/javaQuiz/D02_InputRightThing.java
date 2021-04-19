package javaQuiz;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class D02_InputRightThing {

	/*
	 	# ����ڷκ��� ���ڸ� ����� �Է¹����� ���� ��� �Է¹޴� ���α׷��� ��������
	 	 ( �߸��� ���� �ԷµǾ �������� ���� �ʰ�, �ùٸ� ���� �ԷµǸ� ��� �� ���α׷� ����)
	 */
	public static void main(String[] args) {
		int a = input("ù��° ���� > ");
		int b = input("�ι�° ���� > ");
		
		System.out.println("input�Լ��� �Է¹��� ù��° �� : " + a);
		System.out.println("input�Լ��� �Է¹��� �ι�° �� : " + a);
		
//		Scanner sc = new Scanner(System.in);
//		int userNum;
//		while(true) {
//			System.out.print("���ڸ� �Է����ּ��� >");
//			
//			try {
//				userNum = sc.nextInt();
//				System.out.println("��Ȯ�ϰ� ���ڸ� �Է��ϼ̽��ϴ� : " + userNum);
//				break;
//			} catch(InputMismatchException e) {
//				System.out.println("���ڰ� �ƴմϴ�");
//			} catch (NoSuchElementException e) {
//				System.out.println("���ڰ� �ƴմϴ�");
//			} catch (IllegalStateException e) {
//				System.out.println("���ڰ� �ƴմϴ�");
//			}		
//			String stuck = sc.nextLine();
//			System.out.println("�ɷ��ִ� �� �� : " + stuck);
//		}
		System.out.println("-Program End-");
	}
	public static int input(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
			try {
				System.out.print(message);
				num = sc.nextInt();
				break;				
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		
		// sc.close(); // ���̻� ���� ���� ��ĳ�ʸ� ���� (System.in�� close�� ���� �ʴ°��� ����)
		
		return num;
	}
	
}















