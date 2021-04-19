package javaQuiz;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class CarEndNumber {
	String applicableNumber = "";
	/*
	 	����ȣ ���� ��������
	 	
	 	�� 1, 6
	 	ȭ 2, 7
	 	�� 3, 8
	 	�� 4, 9
	 	�� 5, 0
	 	������ �޹��� �������� 
	 */
	public static boolean checkNumeric(char ch) {
		return ch >= '0' && ch <= '9'; 
	}
	
	public static boolean checkCarNumberLength(String carNumber) {
		if (carNumber.length() != 4) {
			return false;
		}
		for (int i = 0; i < carNumber.length(); i++) {
			char ch = carNumber.charAt(i);
			if (!checkNumeric(ch)) {
				System.out.println("���ڰ� �ƴѰ� �ֽ��ϴ�.");
				return false;
			}
		}
		return true;
	}
	
	public static int dayOfWeek() {
		Calendar vehiclFiveSubtitle = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		return vehiclFiveSubtitle.get(Calendar.DAY_OF_WEEK);
	}
	
	public static boolean entrance(String carNumber) {
		int entrance = dayOfWeek();

		if (checkCarNumberLength(carNumber)) {
			char carLastNumber = carNumber.charAt(3);
	
			if (entrance == 1 || entrance == 7) {
				return true;
			} else if (entrance == 2) {
				if (carLastNumber == '1' || carLastNumber == '6') {
					return false;
				}
			} else if (entrance == 3) {
				if (carLastNumber == '2' || carLastNumber == '7') {
					return false;
				}
			} else if (entrance == 4) {
				if (carLastNumber == '3' || carLastNumber == '8') {
					return false;
				}
			} else if (entrance == 5) {
				if (carLastNumber == '4' || carLastNumber == '9') {
					return false;
				}
			} else if (entrance == 6) {
				if (carLastNumber == '0' || carLastNumber == '5') {
					return false;
				}
			}
		}
		return true;
	}
	
	public static void printPossibleCarLastNumber(String carNumber) {
		SimpleDateFormat carFormat = new SimpleDateFormat("MM�� dd�� EEEE�Դϴ�");

		Calendar vehiclFiveSubtitle = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		int entrance = dayOfWeek();
		
		String possibleCarLastNumNumber = "";
		
		switch (entrance) {
		case 1:
		case 7:
			break;
		case 2:
			possibleCarLastNumNumber = "1�� 6��";
			break;
		case 3:
			possibleCarLastNumNumber = "2�� 7��";
			break;
		case 4:
			possibleCarLastNumNumber = "3�� 8��";
			break;
		case 5:
			possibleCarLastNumNumber = "4�� 9��";
			break;
		case 6:
			possibleCarLastNumNumber = "0�� 5��";
			break;
		}
		if (checkCarNumberLength(carNumber)) {
			if (entrance == 1 || entrance == 7) {
				System.out.println("������ �ָ��Դϴ� ��� ������ ���� �����մϴ�\n");
			}else if (entrance(carNumber)) {
				System.out.println("�ش� ������ȣ�� ���� ���� �����մϴ�\n");
			} else {
				System.out.printf("���� %s ���� �޹�ȣ  %s���� ���� �����մϴ�.\n\n", 
						carFormat.format(Calendar.getInstance().getTime()), possibleCarLastNumNumber);
			}	
		} else {
			System.out.println("������ȣ�� ���� 4�� �Դϴ�.\n");
		}
	}
	
//	public void printPossible(String carNumber) {
//		SimpleDateFormat carFormat = new SimpleDateFormat("MM�� dd�� EEEE�Դϴ�");
//
//		Calendar vehiclFiveSubtitle = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
//		
//		String possibleCarNumber = possibleCarLastNumber(dayOfWeek());
//		if (entrance(carNumber)) {
//			System.out.println("�ش� ������ȣ�� ���� ���� �����մϴ�");
//		} else {
//			System.out.printf("���� ���� �޹�ȣ %s %s�� ���� �����մϴ�.\n", carFormat.format(Calendar.getInstance().getTime()), possibleCarNumber);
//		}
//	}
//	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CarEndNumber entrance = new CarEndNumber();
		
		while (true) {
			System.out.print("���� �ѹ��� �Է��ϼ��� > ");
			String carNumber = sc.nextLine();
			
			entrance.printPossibleCarLastNumber(carNumber);
		}
		
		
	}
}


















