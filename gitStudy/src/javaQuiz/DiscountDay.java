package javaQuiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class DiscountDay {

	/*
	 	� ī�信�� ¦����° ����ϸ���  ������縦 �����Ѵٰ� ���� �� ��
	 	
	 	�⵵�� �Է��ϸ� �ش� �⵵�� ��� ���� ��¥�� ����غ�����
	 */
	
	public static void main(String[] args) {
//		�¿�
//		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("�ñ��� �⵵�� �Է����ּ��� > ");
//		int userSelect = sc.nextInt();
//		
//		korea.set(Calendar.YEAR, userSelect);
//		
//		int count = 1;
//		
//		char day = 'a';
//		
//		System.out.println(userSelect + "���� ��� ��¥");
//		for (int i = 0; i < 12; i++) {
//			korea.set(Calendar.MONTH, i);
//			for (int j = 1, maxDate = korea.getMaximum(Calendar.DATE); j <= maxDate; j++) {
//				korea.set(Calendar.DATE, j);
//				int dow = korea.get(Calendar.DAY_OF_WEEK);
//				int evenNumberWeek = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
//				switch (dow) {
//				case 1:
//					day = '��';
//					break;
//				case 2:
//					day = '��';
//					break;
//				case 3: 
//					day = 'ȭ';
//					break;
//				case 4: 
//					day = '��';
//					break;
//				case 5: 
//					day = '��';
//					break;
//				case 6: 
//					day = '��';
//					break;
//				case 7:  
//					day = '��';
//					break;
//				}
//				if (dow == 5 && evenNumberWeek % 2 == 0) {
//					System.out.printf("%d/%d/%d\t%d��°�� %c����\t[%d��° ���]\n", korea.get(Calendar.YEAR), korea.get(Calendar.MONTH) + 1, korea.get(Calendar.DATE), evenNumberWeek, day, count);
//					count++;
//				}
//			}
//		}
		
		//����
		
		int year = 2020;
		
		printAllEventDays(year);
	}
	// ��Calendar Ŭ������ � �ʵ带 �����ϸ� ������ �ʵ嵵 ��Ȳ�� �°� �˾Ƽ� ������Ʈ �ȴ�
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy�� MM�� dd��");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		event.set(year, 0, 1, 0, 0, 0);
		
		
//		for (int i = 0; i < 12; i++) {
		int count = 1;
		while (event.get(Calendar.YEAR) == year) {
//			event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);

			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d��° ���]\n", count++);
			
			// add () : ���ϴ� �ʵ带 ���ϴ� ��ġ��ŭ ���ϰų� �� �� �ִ�
			event.add(Calendar.MONTH, 1);
		}	
	}
}














