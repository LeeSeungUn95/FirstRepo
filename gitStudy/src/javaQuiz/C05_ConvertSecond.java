package javaQuiz;

import java.util.Scanner;

public class C05_ConvertSecond {

	public static void main(String[] args) {
		/*
			�ʸ� �Է¹����� ��/��/�ð�/��/�ʷ� ��ȯ�Ͽ� ����غ�����
			
			�� �ʿ���� ������ ������� ����
			ex) 0�� 0�� 5�ð� 0�� 20���� ��� 0�� 0���� ������ �ʾƾ� ��
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�ʸ� �Է��ϼ��� > ");
		long second = sc.nextInt();
		
		long original, year, day, hour, min;
		
		original = second;
		
		min = second / 60;
		hour = min / 60;
		day = hour / 24;
		year = day / 365;
		
		second %= 60;
		min %= 60;
		hour %= 24;
		day %= 365;
		
		if(second < 0) {
			System.out.println("�Է� �����Դϴ�");
		}else {
			if(year > 0) {
				System.out.printf("%d�� %d�� %d�� %d�� %d��", year, day, hour, min, second);
			}else if(day > 0) {
				System.out.printf("%d�� %d�� %d�� %d��", day, hour, min, second);			
			}else if(hour > 0) {
				System.out.printf("%d�� %d�� %d��", hour, min, second);
			}else if(min > 0) {
				System.out.printf("%d�� %d��", min, second);
			}else {
				System.out.printf("%d��", second);
			}
		}
	}
}














