package javaStudy;

public class B08_Operator4 {

	public static void main(String[] args) {
		/*
			# 대입 연산자
				- = : 왼쪽의 변수에 오른쪽의 값을 대입한다
			
			# 복합 대입 연산자
				- 변수에 결과를 누적시키는 연산자
		 */
		int num = 10;
		System.out.println(num += 5); // num = num + 5
		System.out.println(num -= 3); // num = num - 3
		System.out.println(num *= 2); // num = num * 2
		System.out.println(num /= 4); // num = num / 4
		System.out.println(num %= 3); // num = num % 3
		
		/*
			# 단항 연산자
				- 변수에 결과를 1씩 누적시키는 연산자
				- ++, --의 위치에 따라 결과가 달라진다	
					- ++, --를 뒤에 붙이면 해당 줄의 모든 명령을 실행한 후에 값이 변한다
					- ++, --를 앞에 붙이면 해당 줄의 명령을 실행하기 전에 값이변한다
		 */
		num = 10;
		
		num++; // 1씩 증가
		System.out.println(num);
		num--; // 1씩 감소
		System.out.println(num);
		
		num = 3;
		
		System.out.println(num++);
		System.out.println(++num);
		
		System.out.println(num--);
		System.out.println(--num);
	}
}














