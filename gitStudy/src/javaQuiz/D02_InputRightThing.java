package javaQuiz;

import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class D02_InputRightThing {

	/*
	 	# 사용자로부터 숫자를 제대로 입력받을때 까지 계속 입력받는 프로그램을 만들어보세요
	 	 ( 잘못된 값이 입력되어도 강제종료 되지 않고, 올바른 값이 입력되면 출력 후 프로그램 종료)
	 */
	public static void main(String[] args) {
		int a = input("첫번째 숫자 > ");
		int b = input("두번째 숫자 > ");
		
		System.out.println("input함수로 입력받은 첫번째 값 : " + a);
		System.out.println("input함수로 입력받은 두번째 값 : " + a);
		
//		Scanner sc = new Scanner(System.in);
//		int userNum;
//		while(true) {
//			System.out.print("숫자를 입력해주세요 >");
//			
//			try {
//				userNum = sc.nextInt();
//				System.out.println("정확하게 숫자를 입력하셨습니다 : " + userNum);
//				break;
//			} catch(InputMismatchException e) {
//				System.out.println("숫자가 아닙니다");
//			} catch (NoSuchElementException e) {
//				System.out.println("숫자가 아닙니다");
//			} catch (IllegalStateException e) {
//				System.out.println("숫자가 아닙니다");
//			}		
//			String stuck = sc.nextLine();
//			System.out.println("걸려있던 걸 뺌 : " + stuck);
//		}
		System.out.println("-Program End-");
	}
	public static int input(String message) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		while (true) {
			try {
				System.out.print(message);
				num = sc.nextInt();
				break;				
			} catch (InputMismatchException e) {
				sc.nextLine();
			}
		}
		
		// sc.close(); // 더이상 쓰지 않을 스캐너를 삭제 (System.in은 close를 하지 않는것이 좋음)
		
		return num;
	}
	
}















