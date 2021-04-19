package javaQuiz;

import java.util.Scanner;

public class C05_ConvertSecond {

	public static void main(String[] args) {
		/*
			초를 입력받으면 년/일/시간/분/초로 변환하여 출력해보세요
			
			※ 필요없는 단위는 출력하지 말것
			ex) 0년 0일 5시간 0분 20초인 경우 0년 0일은 나오지 않아야 함
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("초를 입력하세요 > ");
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
			System.out.println("입력 오류입니다");
		}else {
			if(year > 0) {
				System.out.printf("%d년 %d일 %d시 %d분 %d초", year, day, hour, min, second);
			}else if(day > 0) {
				System.out.printf("%d일 %d시 %d분 %d초", day, hour, min, second);			
			}else if(hour > 0) {
				System.out.printf("%d시 %d분 %d초", hour, min, second);
			}else if(min > 0) {
				System.out.printf("%d분 %d초", min, second);
			}else {
				System.out.printf("%d초", second);
			}
		}
	}
}














