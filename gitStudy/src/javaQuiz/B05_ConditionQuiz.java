package javaQuiz;

public class B05_ConditionQuiz {

	public static void main(String[] args) {
		/*
        [ 알맞은 비교연산을 만들어보세요 ]
            
        1. int형 변수 a가 10보다 크고 20보다 작을 때 true
        2. int형 변수 b가 짝수일 때 true                
        3. int형 변수 c가 7의 배수일 때 true
        4. int형 변수 hour가 0미만 24이상이 아니고, 12이상일 때 true
        5. int형 변수 d와 e의 차이가 30일 때 true                
        6. int형 변수 year가 400으로 나누어 떨어지거나  
                     또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true
        7. 민수가 철수보다 2살 많으면 true
        8. 민수가 철수보다 생일이 3달 빠르면 true  
        9. boolean형 변수 powerOn이 false일 때 true
        10. 문자열 참조변수 str이 "yes"일 때 true
		 */        
		
		//1.
		int a = 15;
		System.out.println("1. a가 10보다 크고 20보다 작을 때 true : " + (20 > a && a > 10));	
		//2.
		int b = 4;
		System.out.println("2. b가 짝수일 때 true : " + (b % 2 == 0));
		//3.
		int c = 21;
		System.out.println("3. c가 7의 배수일 때 true : " + (c % 7 == 0));
		//4.
		int hour = 26;
		System.out.println("4. hour가 0미만 24이상이 아니고, 12이상일 때 true : " + (hour >= 12 && hour < 24));
		//5.
		int d = 50, e = 80;
		System.out.println("5. d와 e의 차이가 30일 때 true : " + (d - e == 30 || e - d == 30));
		//6.
		int year = 36;
		System.out.println("6. year가 400으로 나누어 떨어지거나 또는 4로 나누어 떨어지고 100으로 나누어떨어지지 않을 때 true : "
				+ (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)));
		//7.
		int minsu = 7, chulsu = 5;
		System.out.println("7. 민수가 철수보다 2살 많으면 true : " + (minsu == chulsu + 2));
		//8.
		int minsuBir = 12, chulsuBir = 3;
		System.out.println("8. 민수가 철수보다 생일이 3달 빠르면 true : " + (minsuBir == chulsuBir - 3));
		//9.
		boolean powerOn = false;
		System.out.println("9. boolean형 변수 powerOn이 false일 때 true : " + (powerOn == false));
		//10. 문자열은 == 으로 비교하면 안된다.
		//    참조형 타입의 값을 비교할 때는 해당 클래스에 정의되어 있는 equals()라는
		//    메서드를 이용해야 한다
		String str = "yes";
		System.out.println("10. 문자열 참조변수 str이 \"yes\"일 때 true : " + (str.equals("yes")));
		
		// # 기본형 타입과 참조형 타입의 차이점
		//   - 기본형 타입은 내부 데이터의 크기를 예측하기 쉽다
		//    (차곡차곡 쌓이는 메모리를 사용한다, Stack)
		//   - 참조형 타입은 내부 데이터의 크기를 예측하기 어렵다
		//    (여기저기 막 쓰는 메모리를 사용한다, Heap)
		
		String str1 = "yes";
		String str2 = new String("yes");
		String str3 = "yes";
		
		System.out.println("str1 == str2 : " + (str1 == str2));
		System.out.println("str1.equals(str2) : " + (str1.equals(str2)));
		System.out.println("str1 == str3 : " + (str1 == str3));
	}

}











