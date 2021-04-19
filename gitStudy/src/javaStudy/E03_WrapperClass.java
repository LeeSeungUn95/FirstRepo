package javaStudy;

public class E03_WrapperClass {
	/*
	 	# Wrapper Class
	 	
	 	 - �⺻ Ÿ�Ե��� ������ Ÿ������ ����ϱ� ���� Ŭ����
	 	 - �� Ÿ�Ե鿡 ���� ������ ��ɵ��� ���ִ�
	 	 
	 	 # �⺻�� �̸�
	 	 
	 	  - byte, short, char, int, long, float, double, boolean
	 	  
	 	 # ������ �̸�
	 	 
	 	  - Byte, Short, Character, Integer, Long, Float, Double, Boolean
	 */
	public static void main(String[] args) {

		/*
		 	# parse �ø���

		  	 - ���ڿ��� ���ϴ� Ÿ������ ��ȯ��Ű�� ���
		  	 - �� Ÿ�Կ� ���¤Ӥ� �޼���� �����Ѵ�
	  	 - �����͸� �ְ� �������� ��� ���ڿ��� ��ȯ�Ͽ� ���۵Ǵ� ��찡 ����
	  	 - �ٽ� ����ϱ� ���ؼ��� ���� �����͸� ������ Ÿ������ �ǵ����� �Ѵ�
	  	 - radix�� �����ִ� �����ε��� ������ �ǹ��Ѵ�
		 */
		try {
			int a1 = Integer.parseInt("1234156", 16);			
			System.out.println(a1);
		} catch (NumberFormatException e) {
			System.out.println("int�� ��ȯ�� �� ���� ���ڿ��̾����ϴ�..");
		}

		System.out.printf("%.9f\n", Double.parseDouble("123.123456789"));


		/*
	 	# toString()

	 	 - �ش� Ÿ���� ���� �ս��� ���ڿ��� ��ȯ�� �� �ִ�
	 	 - toString()�� Object�� �޼����̱� ������ ��� Ŭ������ �����Ѵ�
	 	 - �ν��Ͻ� �޼��� toString()�� �ش� �ν��Ͻ��� ���ڿ��� ��ȯ�Ѵ�
	 	 - ����ƽ �޼��� toString()�� ������ ���� ���ڿ��� ��ȯ�Ѵ�
		 */
		System.out.println(Integer.toString(123456,2));
		System.out.println(Integer.toString(123456,8));
		System.out.println(Integer.toString(123456)); // radix ������������ 10����(�״��)
		System.out.println(Integer.toString(123456,16));
		
		/*
		  	# typeValue() �ø���
		  	
		  	 - �ش� �ν��Ͻ� ���� ���ϴ� Ÿ���� ������ �ս��� �����ϴ� �޼���
		 	 - Ÿ��ĳ������ ������ ����
		 */
		
		Integer num = 1000000000;

		System.out.println("num : " + num);
		System.out.println("num.byteValue   : " + num.byteValue());
		System.out.println("num.doubleValue : " + num.doubleValue());
		System.out.println("num.shortValue  : " + num.shortValue());
		System.out.println("num.longValue   : " + num.longValue());
		System.out.println("num.floatValue  : " + num.floatValue());
		
	}
}
















































