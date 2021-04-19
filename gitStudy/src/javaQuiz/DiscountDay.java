package javaQuiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class DiscountDay {

	/*
	 	어떤 카페에서 짝수번째 목요일마다  할인행사를 진행한다고 가정 할 때
	 	
	 	년도를 입력하면 해당 년도의 모든 할인 날짜를 출력해보세요
	 */
	
	public static void main(String[] args) {
//		승운
//		Calendar korea = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("궁금한 년도를 입력해주세요 > ");
//		int userSelect = sc.nextInt();
//		
//		korea.set(Calendar.YEAR, userSelect);
//		
//		int count = 1;
//		
//		char day = 'a';
//		
//		System.out.println(userSelect + "년의 행사 날짜");
//		for (int i = 0; i < 12; i++) {
//			korea.set(Calendar.MONTH, i);
//			for (int j = 1, maxDate = korea.getMaximum(Calendar.DATE); j <= maxDate; j++) {
//				korea.set(Calendar.DATE, j);
//				int dow = korea.get(Calendar.DAY_OF_WEEK);
//				int evenNumberWeek = korea.get(Calendar.DAY_OF_WEEK_IN_MONTH);
//				switch (dow) {
//				case 1:
//					day = '일';
//					break;
//				case 2:
//					day = '월';
//					break;
//				case 3: 
//					day = '화';
//					break;
//				case 4: 
//					day = '수';
//					break;
//				case 5: 
//					day = '목';
//					break;
//				case 6: 
//					day = '금';
//					break;
//				case 7:  
//					day = '토';
//					break;
//				}
//				if (dow == 5 && evenNumberWeek % 2 == 0) {
//					System.out.printf("%d/%d/%d\t%d번째주 %c요일\t[%d번째 행사]\n", korea.get(Calendar.YEAR), korea.get(Calendar.MONTH) + 1, korea.get(Calendar.DATE), evenNumberWeek, day, count);
//					count++;
//				}
//			}
//		}
		
		//강사
		
		int year = 2020;
		
		printAllEventDays(year);
	}
	// ※Calendar 클래스는 어떤 필드를 변경하면 나머지 필드도 상황에 맞게 알아서 업데이트 된다
	public static void printAllEventDays(int year) {
		SimpleDateFormat eventFormat = new SimpleDateFormat("yyyy년 MM월 dd일");
		Calendar event = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		event.set(year, 0, 1, 0, 0, 0);
		
		
//		for (int i = 0; i < 12; i++) {
		int count = 1;
		while (event.get(Calendar.YEAR) == year) {
//			event.set(Calendar.MONTH, i);
			event.set(Calendar.DAY_OF_WEEK, Calendar.THURSDAY);
			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 2);
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d번째 행사]\n", count++);

			event.set(Calendar.DAY_OF_WEEK_IN_MONTH, 4);
			
			System.out.printf(eventFormat.format(event.getTime()) + "\t[%d번째 행사]\n", count++);
			
			// add () : 원하는 필드를 원하는 수치만큼 더하거나 뺄 수 있다
			event.add(Calendar.MONTH, 1);
		}	
	}
}














