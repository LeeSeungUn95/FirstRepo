package javaQuiz;

import java.util.Scanner;

public class B06_ConditionQuiz2 {

	public static void main(String[] args) {
		/*
        [ �˸��� ���ǽ��� �������� ]

        1. char�� ���� a�� 'q'�Ǵ� 'Q'�� �� true
        2. char�� ���� b�� �����̳� ���� �ƴ� �� true
        3. char�� ���� c�� ����('0' ~ '9')�� �� true
        4. char�� ���� d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true
        5. char�� ���� e�� �ѱ��� �� true
        6. char�� ���� f�� �Ϻ����� �� true
        7. ����ڰ� �Է��� ���ڿ��� exit�� �� true        
                    �����ڵ� ǥ ����
		 */        
		
		//1.	
		char a = 'q';
		System.out.println("a�� 'q' �Ǵ� 'Q'�� �� true : " + (a == 'q' || a == 'Q'));
			
		//2.
		char b = '	';
		System.out.println("b�� �����̳� ���� �ƴ� �� true : " + (b != ' ' && b != '	'));
		
		//3.
		char c = 'a';
		System.out.println("c�� ���� '0' ~ '9'�� �� true : " + (c >= '0' && c <= '9'));
		
		//4.
		char d = 'a';
		System.out.println("d�� ������(�빮�� �Ǵ� �ҹ���)�� �� true : " + ((d >= 'a' && d <= 'z') || (d >= 'A' && d <= 'Z')));
		
		//5.
		char e = '�R';
		System.out.println("e�� �ѱ��� �� true : " + ((e >= 0xAC00) && (e <= 0xD7A3)));
		
		//6.
		char f = '��';
		System.out.println("f�� �Ϻ����� �� true : " + ((f >= 0x3040) && (f <= 0x30FF)));
		
		Scanner sc = new Scanner(System.in);
		//7.
		
		System.out.print("�ƹ� ���ܾ �Է��ϼ���(exit�� �Է��Ͻø� true�� ���ɴϴ�) > ");
		String userSelect = sc.nextLine();
		System.out.println("����ڰ� �Է��� ���ڿ��� exit�� �� true : " + (userSelect.equals("exit")));
		
	}
	
	
	
	
	
	
	
}









