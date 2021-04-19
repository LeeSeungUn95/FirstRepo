package javaStudy;

public class B01_Operator1 {

	public static void main(String[] args) {
		/*
		 	# 연산자 (Operator)
		 		- 계산할 때 사용하는 것
		 		-  +, -, *, / ...
		 */
		
		// # 산술 연산자
		int a = 10, b = 7;
		double c = 7.357, d = 7.563;
		
		System.out.println(a + " + " + b + " : " + (a + b));
		System.out.println(a + " - " + b + " : " + (a - b));
		System.out.println(a + " * " + b + " : " + a * b);
		
		// 정수끼리 나누면 몫만 나온다
		System.out.println(a + " / " + b + " : " + a / b);
		// 정수와 실수를 나누면 정확한 값을 계산한다
		System.out.println(a + " / " + c + " : " + a / c);
		System.out.println(a + " / (float)" + b + ": " + a / (float)b);  // 4byte
		System.out.println(a + " / (double)" + b + " : " + a / (double)b); // 8byte
		
		System.out.println(a + " % " + b + " : " + a % b); //나머지
		
		System.out.println(a + " 제곱 " + b + " : " + Math.pow(a, b)); // 제곱
		System.out.println(a + " 제곱? " + b + " : " + (a^b)); // 제곱
		
		System.out.println(a + "의 제곱근 : " + Math.sqrt(a)); // 제곱근
		System.out.println(a + "의 절대값 : " + Math.abs(a)); //절대값
		
		System.out.println(c + "의 소수 첫째 자리에서 반올림 : " + Math.round(c)); // 반올림
		System.out.println(d + "의 소수 첫째 자리에서 반올림 : " + Math.round(d));
		/*
			Math.round()는 소수 첫째 자리에서만 반올림 할 수 있다
			반올림하고 싶은 자리를 소수 첫째 자리로 만들만큼 곱한 후 
			다시 나누는 방식을 통해 원하는 자릿수에서 반올림 할 수 있다
		 */
		System.out.println(c + "의 소수 셋째 자리에서 반올림 : " + Math.round(c * 100) / 100.0);
		System.out.println(d + "의 소수 둘째 자리에서 반올림 : " + Math.round(d * 10) / 10.0);
		
		System.out.println(c + "의 올림 : " + Math.ceil(c));  // 올림
		System.out.println(c + "의 내림 : " + Math.floor(c)); // 내림
		
		System.out.println(a + " 과(와) " + b + " 중에 큰 숫자 : " + Math.max(a, b));  // 큰숫자
		System.out.println(a + " 과(와) " + b + " 중에 작은 숫자 : " + Math.min(a, b));// 작은숫자
		
		
		
		// # 비트 연산자
		// 	&, |, ^, >>, <<
		
		// a = 10, b = 7
		// -> a = 1010, b -> 0111
		
		// a = 1010
		// b = 0111
		// ---------&  1이 같이 있으면 1 
		//     0010 -> 2
		System.out.println("a & b : " + (a & b));  // AND
		
		// a = 1010
		// b = 0111
		// ---------|  1이 하나라도 있으면 1
		//     1111 -> 15
		System.out.println("a | b : " + (a | b));  // OR
		
		// a = 1010
		// b = 0111
		// ---------^  1이 같이 있으면 0
		//     1101 -> 13
		System.out.println("a ^ b : " + (a ^ b));  // XOR
		
		// a = 1010 = 10
		// b = 0111 = 7
		// ---------<<
		//     10100000000 (b만큼 오른쪽에서 왼쪽으로 추가 한다) -> 1280
		System.out.println("a << b : " + (a << b)); // SHIFT
		
		// a = 1010 = 10
		// b = 0111 = 7
		// --------->>
		//     0 (b만큼 왼쪽에서 오른쪽으로 제거 한다) -> 0
		System.out.println("a >> b : " + (a >> b)); // SHIFT
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
