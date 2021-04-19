package javaStudy;

public class D14_Stack {
	static int i = 0;
	
	public static void main(String[] args) {
//		a();  //a로간다
//		stackOverflow();
	}
	
	public static void stackOverflow() {
		System.out.println(i++);
		stackOverflow();
	}
	
	public static void a() {
		b();  //b로간다
	}
	
	public static void b() {
		b_1(); //b_1로 c보다 먼저간다
		c();   //b_2를 출력후 c로간다
	}
	
	public static void b_1() {
		b_2(); //b_2로 간다
	}
	
	public static void b_2() {
		System.out.println("hi (b-2)"); //출력후 빠져나간다
	}
	
	public static void c() {
		System.out.println("hi"); //출력후 종료
	}
}
