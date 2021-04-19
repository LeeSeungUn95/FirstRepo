package javaQuiz;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
import java.util.TimeZone;

public class CarEndNumber {
	String applicableNumber = "";
	/*
	 	끝번호 차량 출입제한
	 	
	 	월 1, 6
	 	화 2, 7
	 	수 3, 8
	 	목 4, 9
	 	금 5, 0
	 	공휴일 휴무일 적용제외 
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
				System.out.println("숫자가 아닌게 있습니다.");
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
		SimpleDateFormat carFormat = new SimpleDateFormat("MM월 dd일 EEEE입니다");

		Calendar vehiclFiveSubtitle = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
		
		int entrance = dayOfWeek();
		
		String possibleCarLastNumNumber = "";
		
		switch (entrance) {
		case 1:
		case 7:
			break;
		case 2:
			possibleCarLastNumNumber = "1번 6번";
			break;
		case 3:
			possibleCarLastNumNumber = "2번 7번";
			break;
		case 4:
			possibleCarLastNumNumber = "3번 8번";
			break;
		case 5:
			possibleCarLastNumNumber = "4번 9번";
			break;
		case 6:
			possibleCarLastNumNumber = "0번 5번";
			break;
		}
		if (checkCarNumberLength(carNumber)) {
			if (entrance == 1 || entrance == 7) {
				System.out.println("오늘은 주말입니다 모든 차량이 주차 가능합니다\n");
			}else if (entrance(carNumber)) {
				System.out.println("해당 차량번호는 금일 주차 가능합니다\n");
			} else {
				System.out.printf("금일 %s 차량 뒷번호  %s빼고 주차 가능합니다.\n\n", 
						carFormat.format(Calendar.getInstance().getTime()), possibleCarLastNumNumber);
			}	
		} else {
			System.out.println("차량번호는 숫자 4개 입니다.\n");
		}
	}
	
//	public void printPossible(String carNumber) {
//		SimpleDateFormat carFormat = new SimpleDateFormat("MM월 dd일 EEEE입니다");
//
//		Calendar vehiclFiveSubtitle = Calendar.getInstance(TimeZone.getTimeZone("Asia/Seoul"));
//		
//		String possibleCarNumber = possibleCarLastNumber(dayOfWeek());
//		if (entrance(carNumber)) {
//			System.out.println("해당 차량번호는 금일 주차 가능합니다");
//		} else {
//			System.out.printf("금일 차량 뒷번호 %s %s만 주차 가능합니다.\n", carFormat.format(Calendar.getInstance().getTime()), possibleCarNumber);
//		}
//	}
//	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		CarEndNumber entrance = new CarEndNumber();
		
		while (true) {
			System.out.print("차량 넘버를 입력하세요 > ");
			String carNumber = sc.nextLine();
			
			entrance.printPossibleCarLastNumber(carNumber);
		}
		
		
	}
}


















