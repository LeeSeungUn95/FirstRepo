package javaQuiz;

import java.util.Scanner;

public class D01_FunctionQuiz {
	/*
	 	# 다음의 함수를 정의하고 올바르게 동작하는지 테스트 해보세요
	 	
	 	 1. 전달한 문자가 알파벳이면 true를 반환, 아니면 flase를 반환하는 함수
	 	 2. 전달한 숫자가 3의 배수이면 true를 반환, 아니면 false를 반환하는 함수
	 	 3.	숫자를 하나 전달하면 문자열 "짝수입니다", 또는 "홀수입니다"를 반환하는 함수
	 	 4. 숫자를 전달하면 해당 숫자의 약수를 배열 형태로 반환하는 함수
	 	 5. 전달한 정수가 소수라면 true를 만환하고 아니면 false를 반환하는 함수
	 	 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	 	 	factorial : (n) * (n-1) * (n-2) ... 3*2*1;
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ㅁ : " + alpha_return('a'));
		System.out.println("9 : " + drainage(9));
		System.out.println("9 : " + even_odd(9));
		System.out.println("100의 약수 : { " + arr_measure(100) + "}");
		System.out.println("11 : " + prime(11));
		System.out.println("8 : " + factorial(10));
	}
	public static boolean alpha_return(char ch) {
		boolean alpha_bool;
		if (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z') {
			alpha_bool = true;
		} else {
			alpha_bool = false;
		}
		return alpha_bool;
	}
	
	public static boolean drainage(int num) {
		boolean num_bool;
		if (num % 3 == 0) {
			num_bool = true;
		} else {
			num_bool = false;
		}
		return num_bool;
	}
	
	public static String even_odd(int num) {
		String even_odd;
		if (num % 2 == 0) {
			even_odd = "짝수입니다";
		} else {
			even_odd = "홀수입니다";
		}
		return even_odd;
	}
	//4. 숫자를 전달하면 해당 숫자의 약수를 배열 형태로 반환하는 함수
	public static String arr_measure(int num) {
		String measure = "";
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				measure += (i + " ");
			}
		}
		return measure;
	}
	// 5. 전달한 정수가 소수라면 true를 만환하고 아니면 false를 반환하는 함수
	public static boolean prime(int num) {
		boolean prime = true;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {				
				prime = false;
			}
		}
		return prime;
		
	}
	
	// 6. 숫자를 전달하면 해당 숫자의 팩토리얼 결과를 반환하는 함수
	// 	factorial : (n) * (n-1) * (n-2) ... 3*2*1;
	
	public static long factorial(int num) {
		long factorial = 1;
		for (int i = 0; i < num; i++) {
			factorial *= (num - i);
			
		}
		return factorial;
	}
}






























