package javaQuiz;

import java.util.Random;
import java.util.Scanner;

public class C20_CountRandomFruit {

	public static void main(String[] args) {
		
		/*
		 	1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
		 	
		 	2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
		 		(�������� �����ϴ� ���� : apple, banana, kiwi, orange, strawberry, pineapple)
		 	
		 	3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���.
		 */
		
//		Scanner sc = new Scanner(System.in);
//		Random ran = new Random();
//		
//		String[] fruit = { "apple", "banana", "kiwi", "orange", "strawberry", "pineapple" };
//		int[] fruitCount = new int[6];
//		
//		System.out.print("�迭�� ũ�� �Է� > ");
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
//			System.out.printf("%s �� ���� : %d��\n", fruit[i], fruitCount[i]);
//		}
		
		/*
	 	1. ����ڷκ��� �迭�� ũ�⸦ �Է¹޴´�
	 	
	 	2. �ش� ũ�⸸ŭ�� �迭�� ���� ���� ���ڿ��� �����Ѵ�
	 		(�������� �����ϴ� ���� : apple, banana, kiwi, orange, strawberry, pineapple)
	 	
	 	3. �� ������ �� �� �����ߴ��� ��� ����ϰ� ����غ���.
	 */
		Random ran = new Random();
		Scanner sc = new Scanner(System.in);
		
		String[] fruit = { "apple", "banana", "kiwi", "peach", "orange", "strawberry", "pineapple" };
		int[] fruitArray = new int[fruit.length];
		
		System.out.print("�迭�� ũ�� �Է� > ");
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
				System.out.printf("%10s�� ���� : %d��\n", fruit[i], fruitArray[i]);
				
			}
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
	}

}

















