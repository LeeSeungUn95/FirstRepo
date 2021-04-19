package javaQuiz;

public class C14_WhileBasicQuiz {

	public static void main(String[] args) {

		/*
		 	while문이용
		 	
		 	1. 1부터 100까지의 3의 배수의 총합
		 	
		 	2. 200부터 1까지 출력
		 	
		 	3. continue를 이용하여 300부터 500사이의 7의 배수만 출력
		 	
		 	4. 1부터 200까지의 숫자중 2의 배수도 아니고 3의 배수도 아닌 숫자들의 총합
		 */
		
		int num = 1;
		int sum = 0;
		//1.
		while (num <= 100) {
			if (num % 3 == 0) {
				sum += num;
				System.out.println("3의 배수 : " + num);
			}
			num++;
		}
		System.out.println("3의 배수의 총 합 : " + sum);
		
		//2.
		num = 200;
		while (num > 0) {
			System.out.print(num + " ");
			num--;
		}
		System.out.println();
		//3.
		num = 299;
		while (num <= 500) {
			num++;
			if (num % 7 != 0) {
				continue;
			}
			System.out.print(num + " ");
		}
		System.out.println();
		
		//4.
		num = 0;
		sum = 0;
		while (num <= 200) {
			num++;
			if (num % 2 != 0) {
				if (num % 3 !=0) {
					sum += num;
				}
			}
		}
		System.out.println("총합 : " + sum);
	}
}





















