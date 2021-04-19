package javaQuiz;

import java.util.Arrays;

public class D01_FunctionQuiz2 {
	//1
	public static boolean isAlpha(char ch) {
		return (ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z');
	}
	//2
	public static boolean is3sBaesu(int num) {
		return num % 3 == 0;
	}
	//3
	public static String evenOdd(int num) {
		return num % 2 == 0 ? "Â¦¼öÀÔ´Ï´Ù" : "È¦¼öÀÔ´Ï´Ù";
	}
	//4
	public static int[] findDivide(int num) {
		
		boolean[] divide = new boolean[num];
		int count = 0;
		
		for (int i = 1; i <= num; i++) {
			if (num % i == 0) {
				divide[i - 1] = true;
				count++;
			}
		}
		
		int[] result = new int[count];
		int index = 0;
		for (int i = 0; i < divide.length; i++) {
			if (divide[i]) {
				result[index++] = i + 1;
			}
		}
		return result;
	}
	//5
	public static boolean isPrime(int num) {
		
		double sqrt = Math.sqrt(num);
		
		for (int i = 2; i <= sqrt; i++) {
			
			if (num % i == 0) {
				return false;
			}
		}
		return true;
	}
	//6
	public static int factorial(int num) {
		if (num == 2) {
			return 2;
		}
		
		return num * factorial(num - 1);
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(findDivide(100)));
		System.out.println(factorial(11));
		int[] numbers = {1, 1, 2, 3, 5, 8, 13, 21, 34};
		for(int number : numbers) {
		   System.out.println(number);
		}
	}
}













