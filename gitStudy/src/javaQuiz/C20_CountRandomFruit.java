package javaQuiz;

import java.util.Random;
import java.util.Scanner;

public class C20_CountRandomFruit {

	public static void main(String[] args) {
		
		/*
		 	1. 사용자로부터 배열의 크기를 입력받는다
		 	
		 	2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
		 		(랜듬으로 등장하는 과일 : apple, banana, kiwi, orange, strawberry, pineapple)
		 	
		 	3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		
//		String[] fruit = { "apple", "banana", "kiwi", "orange", "strawberry", "pineapple" };
//		int[] fruitCount = new int[6];
//		
//		System.out.print("배열의 크기 입력 > ");
//		int index = sc.nextInt();	
//		String[] array = new String[index];
//		
//		for (int i = 0; i < array.length; i++) {
//			int random_index = ran.nextInt(6);
//			
//			array[i] = fruit[random_index];
//			
//			for (int j = 0; j < fruit.length; j++) {
//				if (fruit[j] == array[i]) {
//					fruitCount[j]++;
//					break;
//				}
//			}
//		}
//		for (int i = 0; i < fruit.length; i++) {
//			System.out.printf("%s 의 개수 : %d개\n", fruit[i], fruitCount[i]);
//		}
		
		/*
	 	1. 사용자로부터 배열의 크기를 입력받는다
	 	
	 	2. 해당 크기만큼의 배열에 랜덤 과일 문자열을 저장한다
	 		(랜듬으로 등장하는 과일 : apple, banana, kiwi, orange, strawberry, pineapple)
	 	
	 	3. 각 과일이 몇 번 등장했는지 모두 기록하고 출력해본다.
	 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] fruit = { "apple", "banana", "kiwi", "peach", "orange", "strawberry", "pineapple" };
		int[] fruitArray = new int[fruit.length];
		
		System.out.print("배열의 크기 입력 > ");
		int userArray = sc.nextInt();
	    String[] array = new String[userArray];
	    
		for (int i = 0; i < array.length; i++) {
			int randomFruit = ran.nextInt(fruit.length);
			
			array[i] = fruit[randomFruit];
			
			for (int j = 0; j < fruit.length; j++) {
				if (array[i].equals(fruit[j])) {
					fruitArray[j]++;
				}
			}
		}
		for (int i = 0; i < fruit.length; i++) {
			
			if (fruitArray[i] > 0) {
				System.out.printf("%10s의 개수 : %d개\n", fruit[i], fruitArray[i]);
				
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}

















