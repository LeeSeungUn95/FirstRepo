package javaStudy;

public class C02_CharAt {

	public static void main(String[] args) {
		/*
			# "문자열".charAt(index);
				- 해당 문자열에서 원하는 번째의 문자를 char 타입으로 꺼내는 함수
				- 첫 번째 문자는 0번 인덱스에 있다
				
			# "문자열".length();
				- 함수를 실행하면 해당 문자열의 길이를 int 타입으로 알려준다
		 */
		
		System.out.println("Hello, everyone!!!");
		System.out.println("Hello, everyone!!!".charAt(0));
		System.out.println("Hello, everyone!!!".charAt(1));
		System.out.println("Hello, everyone!!!".charAt(11));
		
		String str = "Hello, everyone!!!!";
		System.out.println(str.charAt(17));
		System.out.println(str.length());
	}

}
