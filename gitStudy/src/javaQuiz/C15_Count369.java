package javaQuiz;

import java.util.Scanner;

public class C15_Count369 {
	
	public static void main(String[] args) {
		/*
		 	사용자로부터 정수를 하나 입력받고
		 	해당 숫자까지 369 게임이 진행된다면 박수를 총 몇 번 쳐야하는지 세어보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		
		
		// 승운
//		System.out.print("정수 입력 > ");
//		int userNum = sc.nextInt();
//		
//		int count = 0;
//		
//		int i = 0;
//		
//		while (i <= userNum) {
//
//			if (i / 10 == 3 || i / 10 == 6 || i / 10 == 9) {
//				if (i % 10 == 3 || i % 10 == 6 || i % 10 ==9) {
//					count++;
//					System.out.println(i);
//				}else {
//					count++;
//					System.out.println(i);
//				}
//			}else if (i % 10 == 3 || i % 10 == 6 || i % 10 == 9) {
//				count++;
//				System.out.println(i);
//			}
//			i++;			
//		}
//		System.out.println("총 박수 횟수 : " + count);
		
		// 강사
		
		//1. 문자열로 풀기
		
		System.out.print("정수 입력 > ");
		int input = sc.nextInt();
		int count = 0;
		
		for (int i = 1 ; i <= input; i++) {
			String num_str = "" + i;
			
			for (int j = 0; j < num_str.length(); j++) {
				char num_ch = num_str.charAt(j);
				if (num_ch == '3' || num_ch == '6' || num_ch == '9') {
					count++;
					System.out.println(i);
				}
			}
		}
		System.out.println("총 박수 횟수 : " + count);

		
//		System.out.print("정수 입력 > ");
//		int input = sc.nextInt();
//		
//		int cnt = 0;
//		int i = 0;
//		
//		while (i < input) {
//			i++;
//			
//			int one_unit = i % 10;                             //    1의 단위 잘라내기
//			int ten_unit = (i % 100 - one_unit) / 10;          //   10의 단위 잘라내기
//			int hundred_unit = (i % 1000 - i % 100) / 100;     //  100의 단위 잘라내기
//			int thousand_unit = (i % 10000 - i % 1000) / 1000; // 1000의 단위 잘라내기  
//			
//			if (one_unit % 3 == 0 && one_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} else if (ten_unit % 3 == 0 && ten_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} else if (hundred_unit % 3 == 0 && hundred_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} else if (thousand_unit % 3 == 0 && thousand_unit > 0) {
//				System.out.println(i);
//				cnt++;
//			} 
//		}
//		System.out.println("총 박수 횟수 : " + cnt);
	}
}















