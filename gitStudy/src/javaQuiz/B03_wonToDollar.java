package javaQuiz;

import java.util.Scanner;

public class B03_wonToDollar {

	public static void main(String[] args) {
		// 한국 돈을 입력하면 미국 달러로 환전해주는 프로그램을 만들어보세요
		// (현재 환율은 구글 검색, 소수 둘째 자리까지 출력, 환전 수수료 1.75%)
		Scanner sc = new Scanner(System.in);
		//승운//
		
//		String banner = "========== 환전시스템 ==========";
//		
//		double usMoney = 1122.48;
//		double userMoney;
//		int koreanMoney;
//		
//		System.out.println(banner);
//		System.out.print("미국 달러로 환전받고 싶은 한국 돈을 입력하세요 > ");
//		koreanMoney = sc.nextInt();
//		
//		double fees = koreanMoney * 0.0175;
//		
//		userMoney = (koreanMoney - fees) / usMoney;
//		
//		System.out.printf("입력하신 금액은 %d원 입니다\n", koreanMoney);
//		System.out.printf("현재 환율은 1 달러에 %f원 입니다\n", usMoney);
//		 
//		System.out.println("-----환전 수수료 1.75%-----");
//		System.out.printf("환전 받으실 달러는 %.2f달러 입니다\n", userMoney);
//		
		//강사
		
		// final이 함께 선언된 변수는 나중에 값을 변경할 수 없다
		final double WON_TO_DOLLAR = 0.00089;

		System.out.print("한국 돈을 입력 해주세요. 달러로 바꿔드립니다.(수수료 1.75%) > ");
		int korMoney = sc.nextInt();
		
		double usd = korMoney * WON_TO_DOLLAR;
		
		System.out.printf("%d원은 %.2fUSD입니다. \n", korMoney, (usd * 0.9825));
	}

}












