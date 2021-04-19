package javaQuiz;

import java.util.Scanner;

public class B04_celtoFahr {

	public static void main(String[] args) {
		// 사용자로부터 섭씨 온도를 입력받으면
		// 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
		// (변환 공식은 구글링, 출력은 소수 첫째 자리 까지)

		Scanner sc = new Scanner(System.in);
		
		System.out.print("섭씨 온도를 입력 하시면 화씨 온도로 변환해드립니다 > ");
		double celsius = sc.nextDouble();
		
		double fahrenheit = (celsius * 1.8) + 32;
		
		System.out.printf("입력하신 섭씨 온도는 %.1f℃ 이고 화씨 온도는 %.1f℉ 입니다", celsius, fahrenheit);
	}

}
