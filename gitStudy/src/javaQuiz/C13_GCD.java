package javaQuiz;

import java.util.Scanner;

public class C13_GCD {

	public static void main(String[] args) {
		/*
		 	두 숫자를 입력받고 두 숫자의 최대 공약수를 구해보세요
		 	※ 최대공약수 : 두숫자의 공약수중 가장 큰 공약수
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.printf("첫번째 숫자입력 > ");
		int fNum = sc.nextInt();
		System.out.printf("두번째 숫자입력 > ");
		int sNum = sc.nextInt();
		
//		int minFactor = 0;
//		
//		for (int i = 2; i <= fNum && i <= sNum; i++) {
//			
//			if (fNum % i == 0 && sNum % i == 0) {
//				minFactor = i;
//			}
//		}
//		System.out.println("최대 공약수 : " + minFactor);

		int gcd = 1;
		
		int min = Math.min(fNum, sNum);
		int max = Math.max(fNum, sNum);
		for(int i = 1; i < min; i++) {
			
			if (fNum % i == 0 && sNum % i == 0) {
				gcd = i;
			}
		}
		System.out.println("최대 공약수 : " + gcd);
	}
}











