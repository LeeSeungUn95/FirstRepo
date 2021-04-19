package javaQuiz;

import java.util.Scanner;

public class C12_Prime {

	public static void main(String[] args) {
		/*
		 	사용자로부터 숫자를 입력받으면
		 	1부터 입력한 숫자 사이에 존재하는 소수를 모두 출력해보세요
		 	
		 	※ 소수 : 1과 자기자신으로만 나누어 떨어지는 수
		 	ex : 7, 11, 13, 17
		 */
		
		Scanner sc = new Scanner(System.in);
	
		System.out.print("숫자 입력 > ");
		int userSelect = sc.nextInt();

		int count = 0;
		
		for (int num = 2; num <= userSelect; num++) {
			int i;
			for (i = 2; i < num; i++) {
				if (num % i == 0) {
					System.out.printf("[%d]는 [%d]로 나누어 떨어졌습니다.\n", num, i);
					break;
				}
			}
			if (num == i) {
				count++;
				System.out.printf("[%d]는 소수입니다.\n", num);
			}
			System.out.println("-----------------------------");
		}
		System.out.println("소수의 개수 : " + count);
	}
}











