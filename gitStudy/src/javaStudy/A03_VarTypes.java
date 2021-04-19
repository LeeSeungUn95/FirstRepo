package javaStudy;

public class A03_VarTypes {


	public static void main(String[] args) {
		/*
			# ���� Ÿ�� 
				- byte  (1byte)
					1byte => 8bit
					
					0000 0000 (0) ~ 1111 1111 (255)
					
					�� ù ��° bit�� ��ȣ ��Ʈ�� ���ȴ�
				
					byteŸ���� ��� ���� 0000 0000 (0) ~ 0111 1111 (127)
					byteŸ���� ���� ���� 1000 0000 (-128) ~ 1111 1111 (-1)
					
					2 ^ 1 - 2����
					2 ^ 2 - 4����
					2 ^ 3 - 8����
					2 ^ 4 - 16����
					2 ^ 5 - 32����
					2 ^ 6 - 64����
					2 ^ 7 - 128����
					2 ^ 8 - 256����

				- short (2byte)
				
					2byte => 16bit
					
					2 ^ 16 - 65536����
					
					short�� ��� ���� 0 ~ 32767
					short�� ���� ���� -32768 ~ -1
					
				- char (2byte, unsigned)
				
					2byte => 16bit
					
					2 ^ 16 = 65535����
					
					��ȣ�� ���� ������ 0 ~ 65536�� ����� ������ �� �ִ� Ÿ��
					�ַ� ���� �ڵ带 �����ϴµ��� ����Ѵ� (����Ÿ��)
					
				- int   (4byte)
				
					4byte => 32bit
					
					2 ^ 32 - 4294967296����
					
					int�� ��� ���� 0 ~ 2147483647
					int�� ���� ���� -2147483648 ~ -1
					
 				- long  (8byte)
 				
 					8byte => 64bit 
 					
 					2 ^ 64 - 18446744073709551616����
 					
 					long�� ��� ���� 0 ~ 9223372036854775807
 					long�� ���� ���� -9223372036854775808 ~ -1
		*/
		
		//byte
		byte minByte = -128;
		byte maxByte = 127;
		
		System.out.println("byteŸ�Կ� ������ �� �ִ� ���� ū ���� " + maxByte + "�̰�"
				+ "���� ���� ���� " + minByte + "�Դϴ�.");
		
		//short
		short minShort = -32768;
		short maxShort = 32767;
		
		System.out.println("shortŸ�Կ� ������ �� �ִ� ���� ū ���� " + maxShort + "�̰�"
				+ "���� ���� ���� " + minShort + "�Դϴ�.");
		
		//char
		char maxChar = 65535;
		char minChar = 0;
		
		char ch = 65;
		
		System.out.println("char Ÿ�Կ� ����� ���� �⺻������ ���ڷ� ��µȴ�. " + ch);
		System.out.println("char Ÿ�Կ� ����� �ڵ尪�� Ȯ���ϰ� ������ (int)�� ���δ�. " + (int)ch);
		
		System.out.println("charŸ�Կ� ������ �� �ִ� ���� ū ���� " + (int)maxChar + "�̰�"
				+ "���� ���� ���� " + (int)minChar + "�Դϴ�.");
		
		//int
		int maxInt = 2_147_483_647;
		int minInt = -2_147_483_648;
		
		System.out.println("intŸ�Կ� ������ �� �ִ� ���� ū ���� " + maxInt + "�̰�"
				+ "���� ���� ���� " + minInt + "�Դϴ�.");
		
		//long
		// int�� ������ �Ѿ�� ���ڸ� ����� ���� ���� �ڿ� L�� �ٿ��� �Ѵ�
		// �׳� ���ڸ� ���°��� int�̴�
		long _Long = 2_147_483_648L;
		
		/*
			# �Ǽ� Ÿ��
				-float  (4byte)
				-double (8byte)
			
				�Ǽ��� �ַ� �׷��� ��꿡 ���ȴ�
				�ε��Ҽ��� ����� ����Ѵ�
		*/
		
		// �׳� �Ҽ��� ���°��� �⺻������ doubleŸ���̴�
		// floatŸ���� �Ҽ��� �ڿ� F�� �ٿ��� �Ѵ�
		float weight = 65.66F;
		double height = 177.77;
		/*
			# �� / ���� (boolean)Ÿ��
				���� ������ ǥ���ϴµ��� ���Ǵ� Ÿ��
				���� true�� false�ۿ� ����
		
		*/
		boolean hasfood = true;
		boolean over130cm = true;
		
		/*
			# ������ Ÿ�� (Ŭ���� Ÿ��)
				������ Ÿ���� �⺻�� Ÿ�Ե���� �ٸ��� �빮�ڷ� �����Ѵ�
				- String : ���ڿ�
				- �׿� ��� Ŭ������ ...
		*/
		String helloMessage = "Hello, My name is John Doe.";
		String byeMessage = "Good bye.";
		
		System.out.println(helloMessage);
		System.out.println("helloMessage");

		System.out.println(byeMessage + byeMessage + byeMessage);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}











