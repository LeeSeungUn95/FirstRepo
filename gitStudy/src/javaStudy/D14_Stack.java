package javaStudy;

public class D14_Stack {
	static int i = 0;
	
	public static void main(String[] args) {
//		a();  //a�ΰ���
//		stackOverflow();
	}
	
	public static void stackOverflow() {
		System.out.println(i++);
		stackOverflow();
	}
	
	public static void a() {
		b();  //b�ΰ���
	}
	
	public static void b() {
		b_1(); //b_1�� c���� ��������
		c();   //b_2�� ����� c�ΰ���
	}
	
	public static void b_1() {
		b_2(); //b_2�� ����
	}
	
	public static void b_2() {
		System.out.println("hi (b-2)"); //����� ����������
	}
	
	public static void c() {
		System.out.println("hi"); //����� ����
	}
}
