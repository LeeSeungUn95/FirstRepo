package javaStudy;

public class C02_CharAt {

	public static void main(String[] args) {
		/*
			# "���ڿ�".charAt(index);
				- �ش� ���ڿ����� ���ϴ� ��°�� ���ڸ� char Ÿ������ ������ �Լ�
				- ù ��° ���ڴ� 0�� �ε����� �ִ�
				
			# "���ڿ�".length();
				- �Լ��� �����ϸ� �ش� ���ڿ��� ���̸� int Ÿ������ �˷��ش�
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
