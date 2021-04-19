package javaQuiz;

import java.util.Scanner;

public class D01_FunctionQuiz {
	/*
	 	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����
	 	
	 	 1. ������ ���ڰ� ���ĺ��̸� true�� ��ȯ, �ƴϸ� flase�� ��ȯ�ϴ� �Լ�
	 	 2. ������ ���ڰ� 3�� ����̸� true�� ��ȯ, �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 3.	���ڸ� �ϳ� �����ϸ� ���ڿ� "¦���Դϴ�", �Ǵ� "Ȧ���Դϴ�"�� ��ȯ�ϴ� �Լ�
	 	 4. ���ڸ� �����ϸ� �ش� ������ ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	 	 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	 	 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	 	 	factorial : (n) * (n-1) * (n-2) ... 3*2*1;
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�� : " + alpha_return('a'));
		System.out.println("9 : " + drainage(9));
		System.out.println("9 : " + even_odd(9));
		System.out.println("100�� ��� : { " + arr_measure(100) + "}");
		System.out.println("11 : " + prime(11));
		System.out.println("8 : " + factorial(10));
	}
	public static boolean alpha_return(char ch) {
		boolean alpha_bool;
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			alpha_bool = true;
		} else {
			alpha_bool = false;
		}
		return alpha_bool;
	}
	
	public static boolean drainage(int num) {
		boolean num_bool;
		if (num % 3 == 0) {
			num_bool = true;
		} else {
			num_bool = false;
		}
		return num_bool;
	}
	
	public static String even_odd(int num) {
		String even_odd;
		if (num % 2 == 0) {
			even_odd = "¦���Դϴ�";
		} else {
			even_odd = "Ȧ���Դϴ�";
		}
		return even_odd;
	}
	//4. ���ڸ� �����ϸ� �ش� ������ ����� �迭 ���·� ��ȯ�ϴ� �Լ�
	public static String arr_measure(int num) {
		String measure = "";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				measure += (i + " ");
			}
		}
		return measure;
	}
	// 5. ������ ������ �Ҽ���� true�� ��ȯ�ϰ� �ƴϸ� false�� ��ȯ�ϴ� �Լ�
	public static boolean prime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {				
				prime = false;
			}
		}
		return prime;
		
	}
	
	// 6. ���ڸ� �����ϸ� �ش� ������ ���丮�� ����� ��ȯ�ϴ� �Լ�
	// 	factorial : (n) * (n-1) * (n-2) ... 3*2*1;
	
	public static long factorial(int num) {
		long factorial = 1;
		for (int i = 0; i < num; i++) {
			factorial *= (num - i);
			
		}
		return factorial;
	}
}






























