package javaQuiz;

import java.util.Scanner;

public class C06_ForBasicQuiz {

	public static void main(String[] args) {
		/*
		 	사용자가 숫자를 입력했을 때
		 	1. 10부터 입력한 숫자까지의 총 합을 구해보세요
		 	
		 	2. 1부터 입력한 숫자 사이의 5의 배수만 모두 출력해보세요
		 */
		
		Scanner sc = new Scanner(System.in);
		int start1 = 10, start2 = 1;
		
		int end1 = -50, end2 = -50;
		int sum = 0;
	 	
		// 만약 start값이 end값보다 크다면, 두 값을 교환한다
		if(start1 > end1) {
			int temp = start1;
			start1 = end1;
			end1 = temp;
		}
		
		if(start2 > end2) {
			int temp = start2;
			start2 = end2;
			end2 = temp;
		}
		
		for (int i = start1; i <= end1; i++) {
			sum += i;
		}
		System.out.printf("10 부터 %d 까지의 숫자 합 : %d\n", end1, sum);
		
		System.out.println();
		System.out.printf("1 ~ %d 사이의 5의 배수만 출력 \n", start2);
		for (int i = start2; i <= end2; i++) {
			if(i % 5 == 0) {
				System.out.print(i + " ");
			}
		}
	}
}


















